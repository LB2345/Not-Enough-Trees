package com.BubbleTeaM.NET.common.block;

import com.BubbleTeaM.NET.NETMod;
import com.BubbleTeaM.NET.common.block.entity.NETWoodTypes;
import com.BubbleTeaM.NET.common.worldgen.features.PoplarTreeGrower;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class NETBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, NETMod.MOD_ID);

    public static final RegistryObject<Block> POPLAR_PLANKS = registerBlock("poplar_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)));
    public static final RegistryObject<Block> POPLAR_LOG = registerBlock("poplar_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD)));
    public static final RegistryObject<Block> STRIPPED_POPLAR_LOG = registerBlock("stripped_poplar_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD)));
    public static final RegistryObject<Block> STRIPPED_POPLAR_WOOD = registerBlock("stripped_poplar_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD)));
    public static final RegistryObject<Block> POPLAR_WOOD = registerBlock("poplar_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD)));
    public static final RegistryObject<Block> POPLAR_SLAB = registerBlock("poplar_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD)));
    public static final RegistryObject<Block> POPLAR_STAIRS = registerBlock("poplar_stairs",
            () -> new StairBlock(NETBlocks.POPLAR_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD)));
    public static final RegistryObject<Block> POPLAR_SAPLING = registerBlock("poplar_sapling",
            () -> new SaplingBlock(new PoplarTreeGrower(), BlockBehaviour.Properties.of(Material.PLANT)));
    public static final RegistryObject<Block> POPLAR_LEAVES = registerBlock("poplar_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES)));
    public static final RegistryObject<Block> POPLAR_FENCE = registerBlock("poplar_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD)));
    public static final RegistryObject<Block> POPLAR_WALL_SIGN = registerBlock("poplar_wall_sign",
            () -> new NETWallSignBlock(BlockBehaviour.Properties.of(Material.WOOD), NETWoodTypes.POPLAR));
    public static final RegistryObject<Block> POPLAR_SIGN = registerBlock("poplar_sign",
            () -> new NETStandingSignBlock(BlockBehaviour.Properties.of(Material.WOOD), NETWoodTypes.POPLAR));
    public static final RegistryObject<Block> POPLAR_BUTTON = registerBlock("poplar_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.WOOD)));
    public static final RegistryObject<Block> POPLAR_PRESSURE_PLATE = registerBlock("poplar_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD)));
    public static final RegistryObject<Block> POPLAR_DOOR = registerBlock("poplar_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)));
    public static final RegistryObject<Block> POPLAR_TRAPDOOR = registerBlock("poplar_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD)));
    public static final RegistryObject<Block> POPLAR_FENCE_GATE = registerBlock("poplar_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        return toReturn;
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
