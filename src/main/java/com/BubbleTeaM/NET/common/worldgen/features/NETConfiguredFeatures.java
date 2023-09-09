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
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.VegetationPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.RandomSpreadFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.feature.treedecorators.CocoaDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.LeaveVineDecorator;
import net.minecraft.world.level.levelgen.feature.trunkplacers.BendingTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.ForkingTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.CaveSurface;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.List;

public class NETConfiguredFeatures {

    public static final Holder<ConfiguredFeature<VegetationPatchConfiguration, ?>> PURPEAT_MOSS_PATCH_BONEMEAL = FeatureUtils.register("purpeat_moss_patch_bonemeal", Feature.VEGETATION_PATCH, new VegetationPatchConfiguration(BlockTags.MOSS_REPLACEABLE, BlockStateProvider.simple(NETBlocks.PURPEAT_MOSS_BLOCK.get()), PlacementUtils.inlinePlaced(NETConfiguredFeatures.PURPEAT_MOSS_VEGETATION), CaveSurface.FLOOR, ConstantInt.of(1), 0.0F, 5, 0.6F, UniformInt.of(1, 2), 0.75F));
    public static final Holder<ConfiguredFeature<SimpleBlockConfiguration, ?>> PURPEAT_MOSS_VEGETATION = FeatureUtils.register("purpeat_moss_vegetation", Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(NETBlocks.PHYSALIS.get().defaultBlockState(), 6).add(NETBlocks.PURPEAT_MOSS_CARPET.get().defaultBlockState(), 25))));
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> POPLAR_TREE = FeatureUtils.register("poplar_tree", Feature.TREE, (new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(NETBlocks.POPLAR_LOG.get()), new BendingTrunkPlacer(8, 4, 4, 5, UniformInt.of(1, 2)),  BlockStateProvider.simple(NETBlocks.POPLAR_LEAVES.get()), new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 55), new TwoLayersFeatureSize(1, 0, 1))).build());
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> ENDBURST_TREE = FeatureUtils.register("endburst_tree", Feature.TREE, (new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(NETBlocks.ENDBURST_LOG.get()), new ForkingTrunkPlacer(6, 4, 4),  BlockStateProvider.simple(NETBlocks.ENDBURST_LEAVES.get()), new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50), new TwoLayersFeatureSize(2, 0, 1))).dirt(BlockStateProvider.simple(NETBlocks.ROOTED_END_STONE.get())).forceDirt().decorators((ImmutableList.of(new LichenDecorator(1F)))).build());

    public static final Holder<PlacedFeature> POPLAR_CHECKED = PlacementUtils.register("poplar_checked", POPLAR_TREE,
            PlacementUtils.filteredByBlockSurvival(NETBlocks.POPLAR_SAPLING.get()));
    public static final Holder<PlacedFeature> ENDBURST_CHECKED = PlacementUtils.register("endburst_checked", ENDBURST_TREE,
            PlacementUtils.filteredByBlockSurvival(NETBlocks.ENDBURST_SAPLING.get()));

    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> POPLAR_SPAWN =
            FeatureUtils.register("poplar_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(POPLAR_CHECKED,
                            0.5F)), POPLAR_CHECKED));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> ENDBURST_SPAWN =
            FeatureUtils.register("endburst_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(ENDBURST_CHECKED,
                            0.5F)), ENDBURST_CHECKED));
}
