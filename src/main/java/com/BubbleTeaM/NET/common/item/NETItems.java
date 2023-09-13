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
    public static final RegistryObject<Item> ROOTED_END_STONE = ITEMS.register("rooted_end_stone",
            () -> new BlockItem(NETBlocks.ROOTED_END_STONE.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));
    public static final RegistryObject<Item> PURPEAT_MOSS_BLOCK = ITEMS.register("purpeat_moss_block",
            () -> new BlockItem(NETBlocks.PURPEAT_MOSS_BLOCK.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));
    public static final RegistryObject<Item> PURPEAT_MOSS_CARPET = ITEMS.register("purpeat_moss_carpet",
            () -> new BlockItem(NETBlocks.PURPEAT_MOSS_CARPET.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> POPLAR_PLANKS = ITEMS.register("poplar_planks",
            () -> new BlockItem(NETBlocks.POPLAR_PLANKS.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> ENDBURST_PLANKS = ITEMS.register("endburst_planks",
            () -> new BlockItem(NETBlocks.ENDBURST_PLANKS.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> EBONY_PLANKS = ITEMS.register("ebony_planks",
            () -> new BlockItem(NETBlocks.EBONY_PLANKS.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> BLUE_MAHOE_PLANKS = ITEMS.register("blue_mahoe_planks",
            () -> new BlockItem(NETBlocks.BLUE_MAHOE_PLANKS.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> WILLOW_PLANKS = ITEMS.register("willow_planks",
            () -> new BlockItem(NETBlocks.WILLOW_PLANKS.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> POPLAR_LOG = ITEMS.register("poplar_log",
            () -> new BlockItem(NETBlocks.POPLAR_LOG.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> ENDBURST_LOG = ITEMS.register("endburst_log",
            () -> new BlockItem(NETBlocks.ENDBURST_LOG.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> EBONY_LOG = ITEMS.register("ebony_log",
            () -> new BlockItem(NETBlocks.EBONY_LOG.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> BLUE_MAHOE_LOG = ITEMS.register("blue_mahoe_log",
            () -> new BlockItem(NETBlocks.BLUE_MAHOE_LOG.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> WILLOW_LOG = ITEMS.register("willow_log",
            () -> new BlockItem(NETBlocks.WILLOW_LOG.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> STRIPPED_POPLAR_LOG = ITEMS.register("stripped_poplar_log",
            () -> new BlockItem(NETBlocks.STRIPPED_POPLAR_LOG.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> STRIPPED_ENDBURST_LOG = ITEMS.register("stripped_endburst_log",
            () -> new BlockItem(NETBlocks.STRIPPED_ENDBURST_LOG.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> STRIPPED_EBONY_LOG = ITEMS.register("stripped_ebony_log",
            () -> new BlockItem(NETBlocks.STRIPPED_EBONY_LOG.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> STRIPPED_BLUE_MAHOE_LOG = ITEMS.register("stripped_blue_mahoe_log",
            () -> new BlockItem(NETBlocks.STRIPPED_BLUE_MAHOE_LOG.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> STRIPPED_WILLOW_LOG = ITEMS.register("stripped_willow_log",
            () -> new BlockItem(NETBlocks.STRIPPED_WILLOW_LOG.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> STRIPPED_POPLAR_WOOD = ITEMS.register("stripped_poplar_wood",
            () -> new BlockItem(NETBlocks.STRIPPED_POPLAR_WOOD.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> STRIPPED_ENDBURST_WOOD = ITEMS.register("stripped_endburst_wood",
            () -> new BlockItem(NETBlocks.STRIPPED_ENDBURST_WOOD.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> STRIPPED_EBONY_WOOD = ITEMS.register("stripped_ebony_wood",
            () -> new BlockItem(NETBlocks.STRIPPED_EBONY_WOOD.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> STRIPPED_BLUE_MAHOE_WOOD = ITEMS.register("stripped_blue_mahoe_wood",
            () -> new BlockItem(NETBlocks.STRIPPED_BLUE_MAHOE_WOOD.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> STRIPPED_WILLOW_WOOD = ITEMS.register("stripped_willow_wood",
            () -> new BlockItem(NETBlocks.STRIPPED_WILLOW_WOOD.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> POPLAR_WOOD = ITEMS.register("poplar_wood",
            () -> new BlockItem(NETBlocks.POPLAR_WOOD.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> ENDBURST_WOOD = ITEMS.register("endburst_wood",
            () -> new BlockItem(NETBlocks.ENDBURST_WOOD.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> EBONY_WOOD = ITEMS.register("ebony_wood",
            () -> new BlockItem(NETBlocks.EBONY_WOOD.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> BLUE_MAHOE_WOOD = ITEMS.register("blue_mahoe_wood",
            () -> new BlockItem(NETBlocks.BLUE_MAHOE_WOOD.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> WILLOW_WOOD = ITEMS.register("willow_wood",
            () -> new BlockItem(NETBlocks.WILLOW_WOOD.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> POPLAR_SLAB = ITEMS.register("poplar_slab",
            () -> new BlockItem(NETBlocks.POPLAR_SLAB.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> ENDBURST_SLAB = ITEMS.register("endburst_slab",
            () -> new BlockItem(NETBlocks.ENDBURST_SLAB.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> EBONY_SLAB = ITEMS.register("ebony_slab",
            () -> new BlockItem(NETBlocks.EBONY_SLAB.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> BLUE_MAHOE_SLAB = ITEMS.register("blue_mahoe_slab",
            () -> new BlockItem(NETBlocks.BLUE_MAHOE_SLAB.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> WILLOW_SLAB = ITEMS.register("willow_slab",
            () -> new BlockItem(NETBlocks.WILLOW_SLAB.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> POPLAR_STAIRS = ITEMS.register("poplar_stairs",
            () -> new BlockItem(NETBlocks.POPLAR_STAIRS.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> ENDBURST_STAIRS = ITEMS.register("endburst_stairs",
            () -> new BlockItem(NETBlocks.ENDBURST_STAIRS.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> EBONY_STAIRS = ITEMS.register("ebony_stairs",
            () -> new BlockItem(NETBlocks.EBONY_STAIRS.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> BLUE_MAHOE_STAIRS = ITEMS.register("blue_mahoe_stairs",
            () -> new BlockItem(NETBlocks.BLUE_MAHOE_STAIRS.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> WILLOW_STAIRS = ITEMS.register("willow_stairs",
            () -> new BlockItem(NETBlocks.WILLOW_STAIRS.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));
    public static final RegistryObject<Item> POPLAR_SAPLING = ITEMS.register("poplar_sapling",
            () -> new BlockItem(NETBlocks.POPLAR_SAPLING.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> ENDBURST_SAPLING = ITEMS.register("endburst_sapling",
            () -> new BlockItem(NETBlocks.ENDBURST_SAPLING.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> EBONY_SAPLING = ITEMS.register("ebony_sapling",
            () -> new BlockItem(NETBlocks.EBONY_SAPLING.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> BLUE_MAHOE_SAPLING = ITEMS.register("blue_mahoe_sapling",
            () -> new BlockItem(NETBlocks.BLUE_MAHOE_SAPLING.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> WILLOW_SAPLING = ITEMS.register("willow_sapling",
            () -> new BlockItem(NETBlocks.WILLOW_SAPLING.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> POPLAR_LEAVES = ITEMS.register("poplar_leaves",
            () -> new BlockItem(NETBlocks.POPLAR_LEAVES.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> ENDBURST_LEAVES = ITEMS.register("endburst_leaves",
            () -> new BlockItem(NETBlocks.ENDBURST_LEAVES.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> EBONY_LEAVES = ITEMS.register("ebony_leaves",
            () -> new BlockItem(NETBlocks.EBONY_LEAVES.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> BLUE_MAHOE_LEAVES = ITEMS.register("blue_mahoe_leaves",
            () -> new BlockItem(NETBlocks.BLUE_MAHOE_LEAVES.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> FLOWERING_BLUE_MAHOE_LEAVES = ITEMS.register("flowering_blue_mahoe_leaves",
            () -> new BlockItem(NETBlocks.FLOWERING_BLUE_MAHOE_LEAVES.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> WILLOW_LEAVES = ITEMS.register("willow_leaves",
            () -> new BlockItem(NETBlocks.WILLOW_LEAVES.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> POPLAR_FENCE = ITEMS.register("poplar_fence",
            () -> new BlockItem(NETBlocks.POPLAR_FENCE.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> ENDBURST_FENCE = ITEMS.register("endburst_fence",
            () -> new BlockItem(NETBlocks.ENDBURST_FENCE.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> EBONY_FENCE = ITEMS.register("ebony_fence",
            () -> new BlockItem(NETBlocks.EBONY_FENCE.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> BLUE_MAHOE_FENCE = ITEMS.register("blue_mahoe_fence",
            () -> new BlockItem(NETBlocks.BLUE_MAHOE_FENCE.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> WILLOW_FENCE = ITEMS.register("willow_fence",
            () -> new BlockItem(NETBlocks.WILLOW_FENCE.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> POPLAR_SIGN = ITEMS.register("poplar_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16).tab(NETCreativeModeTabs.TAB_NET),
                    NETBlocks.POPLAR_SIGN.get(), NETBlocks.POPLAR_WALL_SIGN.get()));

    public static final RegistryObject<Item> ENDBURST_SIGN = ITEMS.register("endburst_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16).tab(NETCreativeModeTabs.TAB_NET),
                    NETBlocks.ENDBURST_SIGN.get(), NETBlocks.ENDBURST_WALL_SIGN.get()));

    public static final RegistryObject<Item> EBONY_SIGN = ITEMS.register("ebony_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16).tab(NETCreativeModeTabs.TAB_NET),
                    NETBlocks.EBONY_SIGN.get(), NETBlocks.EBONY_WALL_SIGN.get()));

    public static final RegistryObject<Item> BLUE_MAHOE_SIGN = ITEMS.register("blue_mahoe_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16).tab(NETCreativeModeTabs.TAB_NET),
                    NETBlocks.BLUE_MAHOE_SIGN.get(), NETBlocks.BLUE_MAHOE_WALL_SIGN.get()));

    public static final RegistryObject<Item> WILLOW_SIGN = ITEMS.register("willow_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16).tab(NETCreativeModeTabs.TAB_NET),
                    NETBlocks.WILLOW_SIGN.get(), NETBlocks.WILLOW_WALL_SIGN.get()));

    public static final RegistryObject<Item> POPLAR_BUTTON = ITEMS.register("poplar_button",
            () -> new BlockItem(NETBlocks.POPLAR_BUTTON.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> ENDBURST_BUTTON = ITEMS.register("endburst_button",
            () -> new BlockItem(NETBlocks.ENDBURST_BUTTON.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> EBONY_BUTTON = ITEMS.register("ebony_button",
            () -> new BlockItem(NETBlocks.EBONY_BUTTON.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> BLUE_MAHOE_BUTTON = ITEMS.register("blue_mahoe_button",
            () -> new BlockItem(NETBlocks.BLUE_MAHOE_BUTTON.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> WILLOW_BUTTON = ITEMS.register("willow_button",
            () -> new BlockItem(NETBlocks.WILLOW_BUTTON.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> POPLAR_PRESSURE_PLATE = ITEMS.register("poplar_pressure_plate",
            () -> new BlockItem(NETBlocks.POPLAR_PRESSURE_PLATE.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> ENDBURST_PRESSURE_PLATE = ITEMS.register("endburst_pressure_plate",
            () -> new BlockItem(NETBlocks.ENDBURST_PRESSURE_PLATE.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> EBONY_PRESSURE_PLATE = ITEMS.register("ebony_pressure_plate",
            () -> new BlockItem(NETBlocks.EBONY_PRESSURE_PLATE.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> BLUE_MAHOE_PRESSURE_PLATE = ITEMS.register("blue_mahoe_pressure_plate",
            () -> new BlockItem(NETBlocks.BLUE_MAHOE_PRESSURE_PLATE.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> WILLOW_PRESSURE_PLATE = ITEMS.register("willow_pressure_plate",
            () -> new BlockItem(NETBlocks.WILLOW_PRESSURE_PLATE.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> POPLAR_DOOR = ITEMS.register("poplar_door",
            () -> new BlockItem(NETBlocks.POPLAR_DOOR.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> ENDBURST_DOOR = ITEMS.register("endburst_door",
            () -> new BlockItem(NETBlocks.ENDBURST_DOOR.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> EBONY_DOOR = ITEMS.register("ebony_door",
            () -> new BlockItem(NETBlocks.EBONY_DOOR.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> BLUE_MAHOE_DOOR = ITEMS.register("blue_mahoe_door",
            () -> new BlockItem(NETBlocks.BLUE_MAHOE_DOOR.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> WILLOW_DOOR = ITEMS.register("willow_door",
            () -> new BlockItem(NETBlocks.WILLOW_DOOR.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> POPLAR_TRAPDOOR = ITEMS.register("poplar_trapdoor",
            () -> new BlockItem(NETBlocks.POPLAR_TRAPDOOR.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> ENDBURST_TRAPDOOR = ITEMS.register("endburst_trapdoor",
            () -> new BlockItem(NETBlocks.ENDBURST_TRAPDOOR.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> EBONY_TRAPDOOR = ITEMS.register("ebony_trapdoor",
            () -> new BlockItem(NETBlocks.EBONY_TRAPDOOR.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> BLUE_MAHOE_TRAPDOOR = ITEMS.register("blue_mahoe_trapdoor",
            () -> new BlockItem(NETBlocks.BLUE_MAHOE_TRAPDOOR.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> WILLOW_TRAPDOOR = ITEMS.register("willow_trapdoor",
            () -> new BlockItem(NETBlocks.WILLOW_TRAPDOOR.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> POPLAR_FENCE_GATE = ITEMS.register("poplar_fence_gate",
            () -> new BlockItem(NETBlocks.POPLAR_FENCE_GATE.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> ENDBURST_FENCE_GATE = ITEMS.register("endburst_fence_gate",
            () -> new BlockItem(NETBlocks.ENDBURST_FENCE_GATE.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> EBONY_FENCE_GATE = ITEMS.register("ebony_fence_gate",
            () -> new BlockItem(NETBlocks.EBONY_FENCE_GATE.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> BLUE_MAHOE_FENCE_GATE = ITEMS.register("blue_mahoe_fence_gate",
            () -> new BlockItem(NETBlocks.BLUE_MAHOE_FENCE_GATE.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> WILLOW_FENCE_GATE = ITEMS.register("willow_fence_gate",
            () -> new BlockItem(NETBlocks.WILLOW_FENCE_GATE.get(),
                    new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> POPLAR_BOAT = ITEMS.register("poplar_boat",
            () -> new NETBoatItem(NETBoat.Type.POPLAR, new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> ENDBURST_BOAT = ITEMS.register("endburst_boat",
            () -> new NETBoatItem(NETBoat.Type.ENDBURST, new Item.Properties().stacksTo(1).tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> EBONY_BOAT = ITEMS.register("ebony_boat",
            () -> new NETBoatItem(NETBoat.Type.EBONY, new Item.Properties().stacksTo(1).tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> BLUE_MAHOE_BOAT = ITEMS.register("blue_mahoe_boat",
            () -> new NETBoatItem(NETBoat.Type.BLUE_MAHOE, new Item.Properties().stacksTo(1).tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> WILLOW_BOAT = ITEMS.register("willow_boat",
            () -> new NETBoatItem(NETBoat.Type.WILLOW, new Item.Properties().stacksTo(1).tab(NETCreativeModeTabs.TAB_NET)));

    public static final RegistryObject<Item> PHYSALIS = ITEMS.register("physalis",
            () -> new BlockItem(NETBlocks.PHYSALIS.get(), new Item.Properties().tab(NETCreativeModeTabs.TAB_NET)));
    public static final RegistryObject<Item> PURPUR_LICHEN = ITEMS.register("purpur_lichen",
            () -> new StandingAndWallBlockItem(NETBlocks.PURPUR_LICHEN.get(), NETBlocks.PURPUR_LICHEN_WALL.get(), (new Item.Properties().tab(NETCreativeModeTabs.TAB_NET))));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
