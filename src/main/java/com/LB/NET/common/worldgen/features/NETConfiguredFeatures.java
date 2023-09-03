package com.BubbleTeaM.NET.common.worldgen.features;

import com.BubbleTeaM.NET.common.block.NETBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.HugeFungusConfiguration;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.RandomSpreadFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.BendingTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.List;

public class NETConfiguredFeatures {
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> POPLAR_TREE = FeatureUtils.register("poplar_tree", Feature.TREE, (new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(NETBlocks.POPLAR_LOG.get()), new BendingTrunkPlacer(8, 4, 4, 5, UniformInt.of(1, 2)),  BlockStateProvider.simple(NETBlocks.POPLAR_LEAVES.get()), new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 55), new TwoLayersFeatureSize(1, 0, 1))).build());
    public static final Holder<ConfiguredFeature<HugeFungusConfiguration, ?>> ENDBURST_TREE = FeatureUtils.register("endburst_tree", Feature.HUGE_FUNGUS, new HugeFungusConfiguration(NETBlocks.PURPEAT_MOSS_BLOCK.get().defaultBlockState(), NETBlocks.ENDBURST_LOG.get().defaultBlockState(), NETBlocks.ENDBURST_LEAVES.get().defaultBlockState(), Blocks.CHORUS_FLOWER.defaultBlockState(), false));

    public static final Holder<PlacedFeature> POPLAR_CHECKED = PlacementUtils.register("poplar_checked", POPLAR_TREE,
            PlacementUtils.filteredByBlockSurvival(NETBlocks.POPLAR_SAPLING.get()));

    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> POPLAR_SPAWN =
            FeatureUtils.register("poplar_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(POPLAR_CHECKED,
                            0.5F)), POPLAR_CHECKED));
}
