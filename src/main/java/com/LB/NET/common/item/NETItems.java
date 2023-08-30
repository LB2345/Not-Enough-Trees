package com.BubbleTeaM.NET.common.item;

import com.BubbleTeaM.NET.NETMod;
import com.BubbleTeaM.NET.common.block.NETBlocks;
import com.BubbleTeaM.NET.common.entity.NETBoat;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class NETItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NETMod.MOD_ID);

    public static final RegistryObject<Item> POPLAR_PLANKS = ITEMS.register("poplar_planks",
            () -> new BlockItem(NETBlocks.POPLAR_PLANKS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> POPLAR_LOG = ITEMS.register("poplar_log",
            () -> new BlockItem(NETBlocks.POPLAR_LOG.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> STRIPPED_POPLAR_LOG = ITEMS.register("stripped_poplar_log",
            () -> new BlockItem(NETBlocks.STRIPPED_POPLAR_LOG.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> STRIPPED_POPLAR_WOOD = ITEMS.register("stripped_poplar_wood",
            () -> new BlockItem(NETBlocks.STRIPPED_POPLAR_WOOD.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> POPLAR_WOOD = ITEMS.register("poplar_wood",
            () -> new BlockItem(NETBlocks.POPLAR_WOOD.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> POPLAR_SLAB = ITEMS.register("poplar_slab",
            () -> new BlockItem(NETBlocks.POPLAR_SLAB.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> POPLAR_STAIRS = ITEMS.register("poplar_stairs",
            () -> new BlockItem(NETBlocks.POPLAR_STAIRS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> POPLAR_SAPLING = ITEMS.register("poplar_sapling",
            () -> new BlockItem(NETBlocks.POPLAR_SAPLING.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> POPLAR_LEAVES = ITEMS.register("poplar_leaves",
            () -> new BlockItem(NETBlocks.POPLAR_LEAVES.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> POPLAR_FENCE = ITEMS.register("poplar_fence",
            () -> new BlockItem(NETBlocks.POPLAR_FENCE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> POPLAR_SIGN = ITEMS.register("poplar_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16).tab(CreativeModeTab.TAB_DECORATIONS),
                    NETBlocks.POPLAR_SIGN.get(), NETBlocks.POPLAR_WALL_SIGN.get()));
    public static final RegistryObject<Item> POPLAR_BUTTON = ITEMS.register("poplar_button",
            () -> new BlockItem(NETBlocks.POPLAR_BUTTON.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
    public static final RegistryObject<Item> POPLAR_PRESSURE_PLATE = ITEMS.register("poplar_pressure_plate",
            () -> new BlockItem(NETBlocks.POPLAR_PRESSURE_PLATE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
    public static final RegistryObject<Item> POPLAR_DOOR = ITEMS.register("poplar_door",
            () -> new BlockItem(NETBlocks.POPLAR_DOOR.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
    public static final RegistryObject<Item> POPLAR_TRAPDOOR = ITEMS.register("poplar_trapdoor",
            () -> new BlockItem(NETBlocks.POPLAR_TRAPDOOR.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
    public static final RegistryObject<Item> POPLAR_FENCE_GATE = ITEMS.register("poplar_fence_gate",
            () -> new BlockItem(NETBlocks.POPLAR_FENCE_GATE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
    public static final RegistryObject<Item> POPLAR_BOAT = ITEMS.register("poplar_boat",
            () -> new NETBoatItem(NETBoat.Type.POPLAR, new Item.Properties().tab(CreativeModeTab.TAB_TRANSPORTATION)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
