package com.BubbleTeaM.NET.common.block;

import com.BubbleTeaM.NET.NETMod;
import com.BubbleTeaM.NET.common.block.entity.NETWoodTypes;
import com.BubbleTeaM.NET.common.worldgen.features.EbonyTreeGrower;
import com.BubbleTeaM.NET.common.worldgen.features.MahoeTreeGrower;
import com.BubbleTeaM.NET.common.worldgen.features.PoplarTreeGrower;
import com.BubbleTeaM.NET.common.worldgen.features.WillowTreeGrower;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.grower.OakTreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class NETBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, NETMod.MOD_ID);
    public static final RegistryObject<Block> ROOTED_END_STONE = registerBlock("rooted_end_stone",
            () -> new PurpeatMossBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE)));
    public static final RegistryObject<Block> PURPEAT_MOSS_BLOCK = registerBlock("purpeat_moss_block",
            () -> new PurpeatMossBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)));
    public static final RegistryObject<Block> PURPEAT_MOSS_CARPET = registerBlock("purpeat_moss_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_CARPET)));
    public static final RegistryObject<Block> POPLAR_PLANKS = registerBlock("poplar_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> ENDBURST_PLANKS = registerBlock("endburst_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> EBONY_PLANKS = registerBlock("ebony_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> BLUE_MAHOE_PLANKS = registerBlock("blue_mahoe_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> WILLOW_PLANKS = registerBlock("willow_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POPLAR_LOG = registerBlock("poplar_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> ENDBURST_LOG = registerBlock("endburst_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> EBONY_LOG = registerBlock("ebony_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> BLUE_MAHOE_LOG = registerBlock("blue_mahoe_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> WILLOW_LOG = registerBlock("willow_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_POPLAR_LOG = registerBlock("stripped_poplar_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_ENDBURST_LOG = registerBlock("stripped_endburst_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_EBONY_LOG = registerBlock("stripped_ebony_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_BLUE_MAHOE_LOG = registerBlock("stripped_blue_mahoe_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_WILLOW_LOG = registerBlock("stripped_willow_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_POPLAR_WOOD = registerBlock("stripped_poplar_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_ENDBURST_WOOD = registerBlock("stripped_endburst_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_EBONY_WOOD = registerBlock("stripped_ebony_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_BLUE_MAHOE_WOOD = registerBlock("stripped_blue_mahoe_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_WILLOW_WOOD = registerBlock("stripped_willow_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> POPLAR_WOOD = registerBlock("poplar_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> ENDBURST_WOOD = registerBlock("endburst_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> EBONY_WOOD = registerBlock("ebony_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> BLUE_MAHOE_WOOD = registerBlock("blue_mahoe_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> WILLOW_WOOD = registerBlock("willow_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> POPLAR_SLAB = registerBlock("poplar_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> ENDBURST_SLAB = registerBlock("endburst_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> EBONY_SLAB = registerBlock("ebony_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> BLUE_MAHOE_SLAB = registerBlock("blue_mahoe_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> WILLOW_SLAB = registerBlock("willow_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> POPLAR_STAIRS = registerBlock("poplar_stairs",
            () -> new StairBlock(NETBlocks.POPLAR_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> ENDBURST_STAIRS = registerBlock("endburst_stairs",
            () -> new StairBlock(NETBlocks.ENDBURST_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> EBONY_STAIRS = registerBlock("ebony_stairs",
            () -> new StairBlock(NETBlocks.EBONY_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> BLUE_MAHOE_STAIRS = registerBlock("blue_mahoe_stairs",
            () -> new StairBlock(NETBlocks.BLUE_MAHOE_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> WILLOW_STAIRS = registerBlock("willow_stairs",
            () -> new StairBlock(NETBlocks.WILLOW_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> POPLAR_SAPLING = registerBlock("poplar_sapling",
            () -> new SaplingBlock(new PoplarTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> POTTED_POPLAR_SAPLING = registerBlock("potted_poplar_sapling",
            () -> new FlowerPotBlock(null, NETBlocks.POPLAR_SAPLING,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING).noOcclusion()));
    public static final RegistryObject<Block> ENDBURST_SAPLING = registerBlock("endburst_sapling",
            () -> new EndburstSaplingBlock(BlockBehaviour.Properties.copy(Blocks.AZALEA)));
    public static final RegistryObject<Block> POTTED_ENDBURST_SAPLING = registerBlock("potted_endburst_sapling",
            () -> new FlowerPotBlock(null, NETBlocks.ENDBURST_SAPLING,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_AZALEA).noOcclusion()));
    public static final RegistryObject<Block> EBONY_SAPLING = registerBlock("ebony_sapling",
            () -> new SaplingBlock(new EbonyTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> POTTED_EBONY_SAPLING = registerBlock("potted_ebony_sapling",
            () -> new FlowerPotBlock(null, NETBlocks.EBONY_SAPLING,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING).noOcclusion()));
    public static final RegistryObject<Block> BLUE_MAHOE_SAPLING = registerBlock("blue_mahoe_sapling",
            () -> new SaplingBlock(new MahoeTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> POTTED_BLUE_MAHOE_SAPLING = registerBlock("potted_blue_mahoe_sapling",
            () -> new FlowerPotBlock(null, NETBlocks.BLUE_MAHOE_SAPLING,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING).noOcclusion()));
    public static final RegistryObject<Block> WILLOW_SAPLING = registerBlock("willow_sapling",
            () -> new SaplingBlock(new WillowTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> POTTED_WILLOW_SAPLING = registerBlock("potted_willow_sapling",
            () -> new FlowerPotBlock(null, NETBlocks.WILLOW_SAPLING,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING).noOcclusion()));
    public static final RegistryObject<Block> POPLAR_LEAVES = registerBlock("poplar_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> ENDBURST_LEAVES = registerBlock("endburst_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> EBONY_LEAVES = registerBlock("ebony_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> BLUE_MAHOE_LEAVES = registerBlock("blue_mahoe_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> FLOWERING_BLUE_MAHOE_LEAVES = registerBlock("flowering_blue_mahoe_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> WILLOW_LEAVES = registerBlock("willow_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> POPLAR_FENCE = registerBlock("poplar_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> ENDBURST_FENCE = registerBlock("endburst_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> EBONY_FENCE = registerBlock("ebony_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> BLUE_MAHOE_FENCE = registerBlock("blue_mahoe_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> WILLOW_FENCE = registerBlock("willow_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> POPLAR_WALL_SIGN = registerBlock("poplar_wall_sign",
            () -> new NETWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), NETWoodTypes.POPLAR));
    public static final RegistryObject<Block> ENDBURST_WALL_SIGN = registerBlock("endburst_wall_sign",
            () -> new NETWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), NETWoodTypes.ENDBURST));
    public static final RegistryObject<Block> EBONY_WALL_SIGN = registerBlock("ebony_wall_sign",
            () -> new NETWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), NETWoodTypes.EBONY));
    public static final RegistryObject<Block> BLUE_MAHOE_WALL_SIGN = registerBlock("blue_mahoe_wall_sign",
            () -> new NETWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), NETWoodTypes.BLUE_MAHOE));
    public static final RegistryObject<Block> WILLOW_WALL_SIGN = registerBlock("willow_wall_sign",
            () -> new NETWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), NETWoodTypes.WILLOW));
    public static final RegistryObject<Block> POPLAR_SIGN = registerBlock("poplar_sign",
            () -> new NETStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), NETWoodTypes.POPLAR));
    public static final RegistryObject<Block> ENDBURST_SIGN = registerBlock("endburst_sign",
            () -> new NETStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), NETWoodTypes.ENDBURST));
    public static final RegistryObject<Block> EBONY_SIGN = registerBlock("ebony_sign",
            () -> new NETStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), NETWoodTypes.EBONY));
    public static final RegistryObject<Block> BLUE_MAHOE_SIGN = registerBlock("blue_mahoe_sign",
            () -> new NETStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), NETWoodTypes.BLUE_MAHOE));
    public static final RegistryObject<Block> WILLOW_SIGN = registerBlock("willow_sign",
            () -> new NETStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), NETWoodTypes.WILLOW));
    public static final RegistryObject<Block> POPLAR_BUTTON = registerBlock("poplar_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON)));
    public static final RegistryObject<Block> ENDBURST_BUTTON = registerBlock("endburst_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON)));
    public static final RegistryObject<Block> EBONY_BUTTON = registerBlock("ebony_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON)));
    public static final RegistryObject<Block> BLUE_MAHOE_BUTTON = registerBlock("blue_mahoe_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON)));
    public static final RegistryObject<Block> WILLOW_BUTTON = registerBlock("willow_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON)));
    public static final RegistryObject<Block> POPLAR_PRESSURE_PLATE = registerBlock("poplar_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE)));
    public static final RegistryObject<Block> ENDBURST_PRESSURE_PLATE = registerBlock("endburst_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE)));
    public static final RegistryObject<Block> EBONY_PRESSURE_PLATE = registerBlock("ebony_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE)));
    public static final RegistryObject<Block> BLUE_MAHOE_PRESSURE_PLATE = registerBlock("blue_mahoe_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE)));
    public static final RegistryObject<Block> WILLOW_PRESSURE_PLATE = registerBlock("willow_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE)));
    public static final RegistryObject<Block> POPLAR_DOOR = registerBlock("poplar_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR)));
    public static final RegistryObject<Block> ENDBURST_DOOR = registerBlock("endburst_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR)));
    public static final RegistryObject<Block> EBONY_DOOR = registerBlock("ebony_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR)));
    public static final RegistryObject<Block> BLUE_MAHOE_DOOR = registerBlock("blue_mahoe_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR)));
    public static final RegistryObject<Block> WILLOW_DOOR = registerBlock("willow_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR)));
    public static final RegistryObject<Block> POPLAR_TRAPDOOR = registerBlock("poplar_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR)));
    public static final RegistryObject<Block> ENDBURST_TRAPDOOR = registerBlock("endburst_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR)));
    public static final RegistryObject<Block> EBONY_TRAPDOOR = registerBlock("ebony_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR)));
    public static final RegistryObject<Block> BLUE_MAHOE_TRAPDOOR = registerBlock("blue_mahoe_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR)));
    public static final RegistryObject<Block> WILLOW_TRAPDOOR = registerBlock("willow_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR)));
    public static final RegistryObject<Block> POPLAR_FENCE_GATE = registerBlock("poplar_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)));
    public static final RegistryObject<Block> ENDBURST_FENCE_GATE = registerBlock("endburst_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)));
    public static final RegistryObject<Block> EBONY_FENCE_GATE = registerBlock("ebony_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)));
    public static final RegistryObject<Block> BLUE_MAHOE_FENCE_GATE = registerBlock("blue_mahoe_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)));
    public static final RegistryObject<Block> WILLOW_FENCE_GATE = registerBlock("willow_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)));
    public static final RegistryObject<Block> PHYSALIS = registerBlock("physalis",
            () -> new PhysalisBlock(BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_PHYSALIS = registerBlock("potted_physalis",
            () -> new FlowerPotBlock(null, NETBlocks.PHYSALIS,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY).noOcclusion()));
    public static final RegistryObject<Block> PURPUR_LICHEN = registerBlock("purpur_lichen",
            () -> new PurpurLichenBlock(BlockBehaviour.Properties.copy(Blocks.BUBBLE_CORAL_FAN)));
    public static final RegistryObject<Block> PURPUR_LICHEN_WALL = registerBlock("purpur_lichen_wall",
            () -> new PurpurLichenWallBlock(BlockBehaviour.Properties.copy(Blocks.BUBBLE_CORAL_WALL_FAN)));
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        return toReturn;
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

