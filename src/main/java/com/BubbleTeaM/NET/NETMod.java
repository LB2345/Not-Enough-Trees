package com.BubbleTeaM.NET;

import com.BubbleTeaM.NET.common.block.NETBlocks;
import com.BubbleTeaM.NET.common.block.entity.NETBlockEntities;
import com.BubbleTeaM.NET.common.block.entity.NETWoodTypes;
import com.BubbleTeaM.NET.common.entity.NETEntities;
import com.BubbleTeaM.NET.common.item.NETItems;
import com.BubbleTeaM.NET.common.worldgen.biome.NETRegion;
import com.BubbleTeaM.NET.common.worldgen.features.NETTreeDecoratorType;
import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FireBlock;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import terrablender.api.Regions;


@Mod(value = NETMod.MOD_ID)
public class NETMod {
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final String MOD_ID = "net";
    public NETMod() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        NETBlocks.register(eventBus);
        NETItems.register(eventBus);
        NETEntities.register(eventBus);
        NETBlockEntities.register(eventBus);
        NETTreeDecoratorType.register(eventBus);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        //Renderers
        ItemBlockRenderTypes.setRenderLayer(NETBlocks.POPLAR_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(NETBlocks.POTTED_POPLAR_SAPLING.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(NETBlocks.POPLAR_LEAVES.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(NETBlocks.ENDBURST_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(NETBlocks.POTTED_ENDBURST_SAPLING.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(NETBlocks.EBONY_SAPLING.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(NETBlocks.POTTED_EBONY_SAPLING.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(NETBlocks.BLUE_MAHOE_SAPLING.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(NETBlocks.POTTED_BLUE_MAHOE_SAPLING.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(NETBlocks.WILLOW_SAPLING.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(NETBlocks.POTTED_WILLOW_SAPLING.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(NETBlocks.EBONY_DOOR.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(NETBlocks.EBONY_TRAPDOOR.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(NETBlocks.BLUE_MAHOE_DOOR.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(NETBlocks.BLUE_MAHOE_TRAPDOOR.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(NETBlocks.ENDBURST_LEAVES.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(NETBlocks.EBONY_LEAVES.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(NETBlocks.BLUE_MAHOE_LEAVES.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(NETBlocks.FLOWERING_BLUE_MAHOE_LEAVES.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(NETBlocks.WILLOW_LEAVES.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(NETBlocks.PHYSALIS.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(NETBlocks.POTTED_PHYSALIS.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(NETBlocks.PURPUR_LICHEN.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(NETBlocks.PURPUR_LICHEN_WALL.get(), RenderType.cutoutMipped());
        //Woodtypes
        Sheets.addWoodType(NETWoodTypes.POPLAR);
        Sheets.addWoodType(NETWoodTypes.ENDBURST);
        Sheets.addWoodType(NETWoodTypes.EBONY);
        Sheets.addWoodType(NETWoodTypes.BLUE_MAHOE);
        Sheets.addWoodType(NETWoodTypes.WILLOW);

        WoodType.register(NETWoodTypes.POPLAR);
        WoodType.register(NETWoodTypes.ENDBURST);
        WoodType.register(NETWoodTypes.EBONY);
        WoodType.register(NETWoodTypes.BLUE_MAHOE);
        WoodType.register(NETWoodTypes.WILLOW);
        //Strippables
        event.enqueueWork(() -> {
            AxeItem.STRIPPABLES = new ImmutableMap.Builder<Block, Block>().putAll(AxeItem.STRIPPABLES)
                    .put(NETBlocks.POPLAR_LOG.get(), NETBlocks.STRIPPED_POPLAR_LOG.get())
                    .put(NETBlocks.POPLAR_WOOD.get(), NETBlocks.STRIPPED_POPLAR_WOOD.get())
                    .put(NETBlocks.ENDBURST_LOG.get(), NETBlocks.STRIPPED_ENDBURST_LOG.get())
                    .put(NETBlocks.ENDBURST_WOOD.get(), NETBlocks.STRIPPED_ENDBURST_WOOD.get())
                    .put(NETBlocks.EBONY_LOG.get(), NETBlocks.STRIPPED_EBONY_LOG.get())
                    .put(NETBlocks.EBONY_WOOD.get(), NETBlocks.STRIPPED_EBONY_WOOD.get())
                    .put(NETBlocks.BLUE_MAHOE_LOG.get(), NETBlocks.STRIPPED_BLUE_MAHOE_LOG.get())
                    .put(NETBlocks.BLUE_MAHOE_WOOD.get(), NETBlocks.STRIPPED_BLUE_MAHOE_WOOD.get())
                    .put(NETBlocks.WILLOW_LOG.get(), NETBlocks.STRIPPED_WILLOW_LOG.get())
                    .put(NETBlocks.WILLOW_WOOD.get(), NETBlocks.STRIPPED_WILLOW_WOOD.get()).build();
        });        event.enqueueWork(() -> {
            FireBlock.bootStrap();
            FireBlock fireblock = (FireBlock) Blocks.FIRE;
            fireblock.setFlammable(NETBlocks.POPLAR_PLANKS.get(), 5, 20);
            fireblock.setFlammable(NETBlocks.ENDBURST_PLANKS.get(), 5, 20);
            fireblock.setFlammable(NETBlocks.EBONY_PLANKS.get(), 5, 20);
            fireblock.setFlammable(NETBlocks.BLUE_MAHOE_PLANKS.get(), 5, 20);
            fireblock.setFlammable(NETBlocks.WILLOW_PLANKS.get(), 5, 20);
            fireblock.setFlammable(NETBlocks.POPLAR_LOG.get(), 5, 20);
            fireblock.setFlammable(NETBlocks.ENDBURST_LOG.get(), 5, 20);
            fireblock.setFlammable(NETBlocks.EBONY_LOG.get(), 5, 20);
            fireblock.setFlammable(NETBlocks.BLUE_MAHOE_LOG.get(), 5, 20);
            fireblock.setFlammable(NETBlocks.WILLOW_LOG.get(), 5, 20);
            fireblock.setFlammable(NETBlocks.POPLAR_SLAB.get(), 5, 20);
            fireblock.setFlammable(NETBlocks.ENDBURST_SLAB.get(), 5, 20);
            fireblock.setFlammable(NETBlocks.EBONY_SLAB.get(), 5, 20);
            fireblock.setFlammable(NETBlocks.BLUE_MAHOE_SLAB.get(), 5, 20);
            fireblock.setFlammable(NETBlocks.WILLOW_SLAB.get(), 5, 20);
            fireblock.setFlammable(NETBlocks.POPLAR_STAIRS.get(), 5, 20);
            fireblock.setFlammable(NETBlocks.ENDBURST_STAIRS.get(), 5, 20);
            fireblock.setFlammable(NETBlocks.EBONY_STAIRS.get(), 5, 20);
            fireblock.setFlammable(NETBlocks.BLUE_MAHOE_STAIRS.get(), 5, 20);
            fireblock.setFlammable(NETBlocks.WILLOW_STAIRS.get(), 5, 20);
            fireblock.setFlammable(NETBlocks.POPLAR_LEAVES.get(), 5, 20);
            fireblock.setFlammable(NETBlocks.ENDBURST_LEAVES.get(), 5, 20);
            fireblock.setFlammable(NETBlocks.EBONY_LEAVES.get(), 5, 20);
            fireblock.setFlammable(NETBlocks.BLUE_MAHOE_LEAVES.get(), 5, 20);
            fireblock.setFlammable(NETBlocks.FLOWERING_BLUE_MAHOE_LEAVES.get(), 5, 20);
            fireblock.setFlammable(NETBlocks.WILLOW_LEAVES.get(), 5, 20);
            fireblock.setFlammable(NETBlocks.POPLAR_FENCE.get(), 5, 20);
            fireblock.setFlammable(NETBlocks.ENDBURST_FENCE.get(), 5, 20);
            fireblock.setFlammable(NETBlocks.EBONY_FENCE.get(), 5, 20);
            fireblock.setFlammable(NETBlocks.BLUE_MAHOE_FENCE.get(), 5, 20);
            fireblock.setFlammable(NETBlocks.WILLOW_FENCE.get(), 5, 20);
            fireblock.setFlammable(NETBlocks.POPLAR_FENCE_GATE.get(), 5, 5);
            fireblock.setFlammable(NETBlocks.ENDBURST_FENCE_GATE.get(), 5, 5);
            fireblock.setFlammable(NETBlocks.EBONY_FENCE_GATE.get(), 5, 5);
            fireblock.setFlammable(NETBlocks.BLUE_MAHOE_FENCE_GATE.get(), 5, 5);
            fireblock.setFlammable(NETBlocks.WILLOW_FENCE_GATE.get(), 5, 5);
            fireblock.setFlammable(NETBlocks.STRIPPED_POPLAR_LOG.get(), 5, 5);
            fireblock.setFlammable(NETBlocks.STRIPPED_ENDBURST_LOG.get(), 5, 5);
            fireblock.setFlammable(NETBlocks.STRIPPED_EBONY_LOG.get(), 5, 5);
            fireblock.setFlammable(NETBlocks.STRIPPED_BLUE_MAHOE_LOG.get(), 5, 5);
            fireblock.setFlammable(NETBlocks.STRIPPED_WILLOW_WOOD.get(), 5, 5);
            fireblock.setFlammable(NETBlocks.STRIPPED_POPLAR_WOOD.get(), 5, 5);
            fireblock.setFlammable(NETBlocks.STRIPPED_ENDBURST_WOOD.get(), 5, 5);
            fireblock.setFlammable(NETBlocks.STRIPPED_EBONY_WOOD.get(), 5, 5);
            fireblock.setFlammable(NETBlocks.STRIPPED_BLUE_MAHOE_WOOD.get(), 5, 5);
            fireblock.setFlammable(NETBlocks.STRIPPED_WILLOW_WOOD.get(), 5, 5);
            fireblock.setFlammable(NETBlocks.POPLAR_WOOD.get(), 5, 5);
            fireblock.setFlammable(NETBlocks.ENDBURST_WOOD.get(), 5, 5);
            fireblock.setFlammable(NETBlocks.EBONY_WOOD.get(), 5, 5);
            fireblock.setFlammable(NETBlocks.BLUE_MAHOE_WOOD.get(), 5, 5);
            fireblock.setFlammable(NETBlocks.WILLOW_WOOD.get(), 5, 5);
        });        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(NETBlocks.POPLAR_SAPLING.getId(), NETBlocks.POTTED_POPLAR_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(NETBlocks.ENDBURST_SAPLING.getId(), NETBlocks.POTTED_ENDBURST_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(NETBlocks.EBONY_SAPLING.getId(), NETBlocks.POTTED_EBONY_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(NETBlocks.BLUE_MAHOE_SAPLING.getId(), NETBlocks.POTTED_BLUE_MAHOE_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(NETBlocks.WILLOW_SAPLING.getId(), NETBlocks.POTTED_WILLOW_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(NETBlocks.PHYSALIS.getId(), NETBlocks.POTTED_PHYSALIS);
        });
        event.enqueueWork(() ->
        {
            Regions.register(new NETRegion(new ResourceLocation(MOD_ID, "overworld"), 2));
        });
    }

    private void enqueueIMC(final InterModEnqueueEvent event) {
    }
    private void processIMC(final InterModProcessEvent event) {
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
    }
}
