package com.BubbleTeaM.NET;

import com.BubbleTeaM.NET.common.block.NETBlocks;
import com.BubbleTeaM.NET.common.block.entity.NETBlockEntities;
import com.BubbleTeaM.NET.common.block.entity.NETWoodTypes;
import com.BubbleTeaM.NET.common.entity.NETEntities;
import com.BubbleTeaM.NET.common.item.NETItems;
import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.level.block.Block;
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

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        //Renderers
        ItemBlockRenderTypes.setRenderLayer(NETBlocks.POPLAR_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(NETBlocks.POPLAR_LEAVES.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(NETBlocks.ENDBURST_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(NETBlocks.ENDBURST_LEAVES.get(), RenderType.cutoutMipped());
        //Woodtypes
        Sheets.addWoodType(NETWoodTypes.POPLAR);
        Sheets.addWoodType(NETWoodTypes.ENDBURST);

        WoodType.register(NETWoodTypes.POPLAR);
        WoodType.register(NETWoodTypes.ENDBURST);
        //Strippables
        event.enqueueWork(() -> {
            AxeItem.STRIPPABLES = new ImmutableMap.Builder<Block, Block>().putAll(AxeItem.STRIPPABLES)
                    .put(NETBlocks.POPLAR_LOG.get(), NETBlocks.STRIPPED_POPLAR_LOG.get())
                    .put(NETBlocks.POPLAR_WOOD.get(), NETBlocks.STRIPPED_POPLAR_WOOD.get())
                    .put(NETBlocks.ENDBURST_LOG.get(), NETBlocks.STRIPPED_ENDBURST_LOG.get())
                    .put(NETBlocks.ENDBURST_WOOD.get(), NETBlocks.STRIPPED_ENDBURST_WOOD.get()).build();
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

