package com.BubbleTeaM.NET.common.worldgen.features;

import com.BubbleTeaM.NET.common.block.NETBlocks;
import com.google.common.collect.ImmutableList;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.TreeFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.VegetationPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.ThreeLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FancyFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.RandomSpreadFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.feature.treedecorators.BeehiveDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.CocoaDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.LeaveVineDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TrunkVineDecorator;
import net.minecraft.world.level.levelgen.feature.trunkplacers.BendingTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.FancyTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.ForkingTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.CaveSurface;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.List;
import java.util.OptionalInt;

public class NETConfiguredFeatures {

    public static final Holder<ConfiguredFeature<VegetationPatchConfiguration, ?>> PURPEAT_MOSS_PATCH_BONEMEAL = FeatureUtils.register("purpeat_moss_patch_bonemeal", Feature.VEGETATION_PATCH, new VegetationPatchConfiguration(BlockTags.MOSS_REPLACEABLE, BlockStateProvider.simple(NETBlocks.PURPEAT_MOSS_BLOCK.get()), PlacementUtils.inlinePlaced(NETConfiguredFeatures.PURPEAT_MOSS_VEGETATION), CaveSurface.FLOOR, ConstantInt.of(1), 0.0F, 5, 0.6F, UniformInt.of(1, 2), 0.75F));
    public static final Holder<ConfiguredFeature<SimpleBlockConfiguration, ?>> PURPEAT_MOSS_VEGETATION = FeatureUtils.register("purpeat_moss_vegetation", Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(NETBlocks.PHYSALIS.get().defaultBlockState(), 6).add(NETBlocks.PURPEAT_MOSS_CARPET.get().defaultBlockState(), 25))));
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> POPLAR_TREE = FeatureUtils.register("poplar_tree", Feature.TREE, (new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(NETBlocks.POPLAR_LOG.get()), new BendingTrunkPlacer(8, 4, 4, 5, UniformInt.of(1, 2)), BlockStateProvider.simple(NETBlocks.POPLAR_LEAVES.get()), new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 55), new TwoLayersFeatureSize(1, 0, 1))).build());
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> EBONY_TREE = FeatureUtils.register("ebony_tree", Feature.TREE, (new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(NETBlocks.EBONY_LOG.get()), new ForkingTrunkPlacer(6, 1, 1), BlockStateProvider.simple(NETBlocks.EBONY_LEAVES.get()), new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 80), new ThreeLayersFeatureSize(3, 3, 3, 2, 2, OptionalInt.empty()))).build());
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> ENDBURST_TREE = FeatureUtils.register("endburst_tree", Feature.TREE, (new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(NETBlocks.ENDBURST_LOG.get()), new ForkingTrunkPlacer(6, 4, 4), BlockStateProvider.simple(NETBlocks.ENDBURST_LEAVES.get()), new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50), new TwoLayersFeatureSize(2, 0, 1))).dirt(BlockStateProvider.simple(NETBlocks.ROOTED_END_STONE.get())).forceDirt().decorators(ImmutableList.of(new LichenDecorator(0.2F))).ignoreVines().build());
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> BLUE_MAHOE_TREE = FeatureUtils.register("blue_mahoe_tree", Feature.TREE, (new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(NETBlocks.BLUE_MAHOE_LOG.get()), new ForkingTrunkPlacer(3, 0, 2), new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(NETBlocks.BLUE_MAHOE_LEAVES.get().defaultBlockState(), 3).add(NETBlocks.FLOWERING_BLUE_MAHOE_LEAVES.get().defaultBlockState(), 1)), new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50), new TwoLayersFeatureSize(2, 0, 4))).decorators(ImmutableList.of(new BeehiveDecorator(0.8F))).build());
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> WILLOW_TREE = FeatureUtils.register("willow_tree", Feature.TREE, createStraightBlobTree(NETBlocks.WILLOW_LOG.get(), NETBlocks.WILLOW_LEAVES.get(), 5, 3, 0, 3).decorators(ImmutableList.of(LeaveVineDecorator.INSTANCE)).build());

    private static TreeConfiguration.TreeConfigurationBuilder createStraightBlobTree(Block p_195147_, Block p_195148_, int p_195149_, int p_195150_, int p_195151_, int p_195152_) {
        return new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(p_195147_), new StraightTrunkPlacer(p_195149_, p_195150_, p_195151_), BlockStateProvider.simple(p_195148_), new BlobFoliagePlacer(ConstantInt.of(p_195152_), ConstantInt.of(0), 3), new TwoLayersFeatureSize(1, 0, 1));
    }
}
