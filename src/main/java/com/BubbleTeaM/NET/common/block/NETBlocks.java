package com.BubbleTeaM.NET.common.block;

import com.BubbleTeaM.NET.NETMod;
import com.BubbleTeaM.NET.common.block.entity.NETWoodTypes;
import com.BubbleTeaM.NET.common.block.entity.PhysalisBlock;
import com.BubbleTeaM.NET.common.worldgen.features.PoplarTreeGrower;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.*;
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
    public static final RegistryObject<Block> POPLAR_LOG = registerBlock("poplar_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> ENDBURST_LOG = registerBlock("endburst_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_POPLAR_LOG = registerBlock("stripped_poplar_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_ENDBURST_LOG = registerBlock("stripped_endburst_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_POPLAR_WOOD = registerBlock("stripped_poplar_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_ENDBURST_WOOD = registerBlock("stripped_endburst_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> POPLAR_WOOD = registerBlock("poplar_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> ENDBURST_WOOD = registerBlock("endburst_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> POPLAR_SLAB = registerBlock("poplar_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> ENDBURST_SLAB = registerBlock("endburst_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> POPLAR_STAIRS = registerBlock("poplar_stairs",
            () -> new StairBlock(NETBlocks.POPLAR_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> ENDBURST_STAIRS = registerBlock("endburst_stairs",
            () -> new StairBlock(NETBlocks.ENDBURST_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
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
    public static final RegistryObject<Block> POPLAR_LEAVES = registerBlock("poplar_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> ENDBURST_LEAVES = registerBlock("endburst_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> POPLAR_FENCE = registerBlock("poplar_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> ENDBURST_FENCE = registerBlock("endburst_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> POPLAR_WALL_SIGN = registerBlock("poplar_wall_sign",
            () -> new NETWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), NETWoodTypes.POPLAR));
    public static final RegistryObject<Block> ENDBURST_WALL_SIGN = registerBlock("endburst_wall_sign",
            () -> new NETWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), NETWoodTypes.ENDBURST));
    public static final RegistryObject<Block> POPLAR_SIGN = registerBlock("poplar_sign",
            () -> new NETStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), NETWoodTypes.POPLAR));
    public static final RegistryObject<Block> ENDBURST_SIGN = registerBlock("endburst_sign",
            () -> new NETStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), NETWoodTypes.ENDBURST));
    public static final RegistryObject<Block> POPLAR_BUTTON = registerBlock("poplar_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON)));
    public static final RegistryObject<Block> ENDBURST_BUTTON = registerBlock("endburst_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON)));
    public static final RegistryObject<Block> POPLAR_PRESSURE_PLATE = registerBlock("poplar_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE)));
    public static final RegistryObject<Block> ENDBURST_PRESSURE_PLATE = registerBlock("endburst_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE)));
    public static final RegistryObject<Block> POPLAR_DOOR = registerBlock("poplar_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR)));
    public static final RegistryObject<Block> ENDBURST_DOOR = registerBlock("endburst_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR)));
    public static final RegistryObject<Block> POPLAR_TRAPDOOR = registerBlock("poplar_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR)));
    public static final RegistryObject<Block> ENDBURST_TRAPDOOR = registerBlock("endburst_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR)));
    public static final RegistryObject<Block> POPLAR_FENCE_GATE = registerBlock("poplar_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)));
    public static final RegistryObject<Block> ENDBURST_FENCE_GATE = registerBlock("endburst_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)));
    public static final RegistryObject<Block> PHYSALIS = registerBlock("physalis",
            () -> new PhysalisBlock(BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_PHYSALIS = registerBlock("potted_physalis",
            () -> new FlowerPotBlock(null, NETBlocks.PHYSALIS,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY).noOcclusion()));
    public static final RegistryObject<Block> PURPUR_LICHEN = registerBlock("purpur_lichen",
            () -> new PurpurLichenBlock(BlockBehaviour.Properties.copy(Blocks.BUBBLE_CORAL_FAN)));
    public static final RegistryObject<Block> PURPUR_LICHEN_WALL = registerBlock("purpur_lichen_wall",
            () -> new PurpurLichenBlock(BlockBehaviour.Properties.copy(Blocks.BUBBLE_CORAL_WALL_FAN)));
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        return toReturn;
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

