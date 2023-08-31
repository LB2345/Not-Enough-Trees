package com.BubbleTeaM.NET.common.item;

import com.BubbleTeaM.NET.NETMod;
import com.BubbleTeaM.NET.common.block.NETBlocks;
import com.BubbleTeaM.NET.common.entity.NETBoat;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
public class NETItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NETMod.MOD_ID);

    public static final RegistryObject<Item> PURPEAT_MOSS_BLOCK = ITEMS.register("purpeat_moss_block",
            () -> new BlockItem(NETBlocks.PURPEAT_MOSS_BLOCK.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));
    public static final RegistryObject<Item> POPLAR_PLANKS = ITEMS.register("poplar_planks",
            () -> new BlockItem(NETBlocks.POPLAR_PLANKS.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));
    public static final RegistryObject<Item> ENDBURST_PLANKS = ITEMS.register("endburst_planks",
            () -> new BlockItem(NETBlocks.ENDBURST_PLANKS.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));
    public static final RegistryObject<Item> POPLAR_LOG = ITEMS.register("poplar_log",
            () -> new BlockItem(NETBlocks.POPLAR_LOG.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));
    public static final RegistryObject<Item> ENDBURST_LOG = ITEMS.register("endburst_log",
            () -> new BlockItem(NETBlocks.ENDBURST_LOG.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));
    public static final RegistryObject<Item> STRIPPED_POPLAR_LOG = ITEMS.register("stripped_poplar_log",
            () -> new BlockItem(NETBlocks.STRIPPED_POPLAR_LOG.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));
    public static final RegistryObject<Item> STRIPPED_ENDBURST_LOG = ITEMS.register("stripped_endburst_log",
            () -> new BlockItem(NETBlocks.STRIPPED_ENDBURST_LOG.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));
    public static final RegistryObject<Item> STRIPPED_POPLAR_WOOD = ITEMS.register("stripped_poplar_wood",
            () -> new BlockItem(NETBlocks.STRIPPED_POPLAR_WOOD.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));
    public static final RegistryObject<Item> STRIPPED_ENDBURST_WOOD = ITEMS.register("stripped_endburst_wood",
            () -> new BlockItem(NETBlocks.STRIPPED_ENDBURST_WOOD.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));
    public static final RegistryObject<Item> POPLAR_WOOD = ITEMS.register("poplar_wood",
            () -> new BlockItem(NETBlocks.POPLAR_WOOD.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));
    public static final RegistryObject<Item> ENDBURST_WOOD = ITEMS.register("endburst_wood",
            () -> new BlockItem(NETBlocks.ENDBURST_WOOD.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));
    public static final RegistryObject<Item> POPLAR_SLAB = ITEMS.register("poplar_slab",
            () -> new BlockItem(NETBlocks.POPLAR_SLAB.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));
    public static final RegistryObject<Item> ENDBURST_SLAB = ITEMS.register("endburst_slab",
            () -> new BlockItem(NETBlocks.ENDBURST_SLAB.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));
    public static final RegistryObject<Item> POPLAR_STAIRS = ITEMS.register("poplar_stairs",
            () -> new BlockItem(NETBlocks.POPLAR_STAIRS.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));
    public static final RegistryObject<Item> ENDBURST_STAIRS = ITEMS.register("endburst_stairs",
            () -> new BlockItem(NETBlocks.ENDBURST_STAIRS.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));
    public static final RegistryObject<Item> POPLAR_SAPLING = ITEMS.register("poplar_sapling",
            () -> new BlockItem(NETBlocks.POPLAR_SAPLING.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));
    public static final RegistryObject<Item> ENDBURST_SAPLING = ITEMS.register("endburst_sapling",
            () -> new BlockItem(NETBlocks.ENDBURST_SAPLING.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));
    public static final RegistryObject<Item> POPLAR_LEAVES = ITEMS.register("poplar_leaves",
            () -> new BlockItem(NETBlocks.POPLAR_LEAVES.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));
    public static final RegistryObject<Item> ENDBURST_LEAVES = ITEMS.register("endburst_leaves",
            () -> new BlockItem(NETBlocks.ENDBURST_LEAVES.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));
    public static final RegistryObject<Item> POPLAR_FENCE = ITEMS.register("poplar_fence",
            () -> new BlockItem(NETBlocks.POPLAR_FENCE.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));
    public static final RegistryObject<Item> ENDBURST_FENCE = ITEMS.register("endburst_fence",
            () -> new BlockItem(NETBlocks.ENDBURST_FENCE.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));
    public static final RegistryObject<Item> POPLAR_SIGN = ITEMS.register("poplar_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16).tab(NETCreativeModeTabs.TAB_NET),
                    NETBlocks.POPLAR_SIGN.get(), NETBlocks.POPLAR_WALL_SIGN.get()));
    public static final RegistryObject<Item> ENDBURST_SIGN = ITEMS.register("endburst_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16).tab(NETCreativeModeTabs.TAB_NET),
                    NETBlocks.ENDBURST_SIGN.get(), NETBlocks.ENDBURST_WALL_SIGN.get()));
    public static final RegistryObject<Item> POPLAR_BUTTON = ITEMS.register("poplar_button",
            () -> new BlockItem(NETBlocks.POPLAR_BUTTON.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));
    public static final RegistryObject<Item> ENDBURST_BUTTON = ITEMS.register("endburst_button",
            () -> new BlockItem(NETBlocks.ENDBURST_BUTTON.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));
    public static final RegistryObject<Item> POPLAR_PRESSURE_PLATE = ITEMS.register("poplar_pressure_plate",
            () -> new BlockItem(NETBlocks.POPLAR_PRESSURE_PLATE.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));
    public static final RegistryObject<Item> ENDBURST_PRESSURE_PLATE = ITEMS.register("endburst_pressure_plate",
            () -> new BlockItem(NETBlocks.ENDBURST_PRESSURE_PLATE.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));
    public static final RegistryObject<Item> POPLAR_DOOR = ITEMS.register("poplar_door",
            () -> new BlockItem(NETBlocks.POPLAR_DOOR.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));
    public static final RegistryObject<Item> ENDBURST_DOOR = ITEMS.register("endburst_door",
            () -> new BlockItem(NETBlocks.ENDBURST_DOOR.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));
    public static final RegistryObject<Item> POPLAR_TRAPDOOR = ITEMS.register("poplar_trapdoor",
            () -> new BlockItem(NETBlocks.POPLAR_TRAPDOOR.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));
    public static final RegistryObject<Item> ENDBURST_TRAPDOOR = ITEMS.register("endburst_trapdoor",
            () -> new BlockItem(NETBlocks.ENDBURST_TRAPDOOR.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));
    public static final RegistryObject<Item> POPLAR_FENCE_GATE = ITEMS.register("poplar_fence_gate",
            () -> new BlockItem(NETBlocks.POPLAR_FENCE_GATE.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));
    public static final RegistryObject<Item> ENDBURST_FENCE_GATE = ITEMS.register("endburst_fence_gate",
            () -> new BlockItem(NETBlocks.ENDBURST_FENCE_GATE.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));
    public static final RegistryObject<Item> POPLAR_BOAT = ITEMS.register("poplar_boat",
            () -> new NETBoatItem(NETBoat.Type.POPLAR, new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));
    public static final RegistryObject<Item> ENDBURST_BOAT = ITEMS.register("endburst_boat",
            () -> new NETBoatItem(NETBoat.Type.ENDBURST, new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
