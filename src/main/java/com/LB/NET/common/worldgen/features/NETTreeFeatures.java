package com.BubbleTeaM.NET.common.worldgen.features;

import com.BubbleTeaM.NET.common.block.NETBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.TreeFeatures;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.RandomSpreadFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.BendingTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;

public class NETTreeFeatures {
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> POPLAR_TREE = FeatureUtils.register("poplar_tree", Feature.TREE, (new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(NETBlocks.POPLAR_LOG.get()), new BendingTrunkPlacer(8, 0, 0, 5, UniformInt.of(1, 2)),  BlockStateProvider.simple(NETBlocks.POPLAR_LEAVES.get()), new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 55), new TwoLayersFeatureSize(1, 0, 1))).build());
}
