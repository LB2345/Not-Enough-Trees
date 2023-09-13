package com.BubbleTeaM.NET.common.worldgen.features;

import com.BubbleTeaM.NET.common.block.NETBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.TreeFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.RarityFilter;

public class NETPlacedFeatures  {
    public static final Holder<PlacedFeature> POPLAR_CHECKED = PlacementUtils.register("poplar_checked", NETConfiguredFeatures.POPLAR_TREE, PlacementUtils.filteredByBlockSurvival(NETBlocks.POPLAR_SAPLING.get()));
    public static final Holder<PlacedFeature> ENDBURST_CHECKED = PlacementUtils.register("endburst_checked", NETConfiguredFeatures.ENDBURST_TREE, PlacementUtils.filteredByBlockSurvival(NETBlocks.ENDBURST_SAPLING.get()));
    public static final Holder<PlacedFeature> EBONY_CHECKED = PlacementUtils.register("ebony_checked", NETConfiguredFeatures.EBONY_TREE, PlacementUtils.filteredByBlockSurvival(NETBlocks.EBONY_SAPLING.get()));
    public static final Holder<PlacedFeature> BLUE_MAHOE_CHECKED = PlacementUtils.register("blue_mahoe_checked", NETConfiguredFeatures.BLUE_MAHOE_TREE, PlacementUtils.filteredByBlockSurvival(NETBlocks.BLUE_MAHOE_SAPLING.get()));
    public static final Holder<PlacedFeature> WILLOW_CHECKED = PlacementUtils.register("willow_checked", NETConfiguredFeatures.WILLOW_TREE, PlacementUtils.filteredByBlockSurvival(NETBlocks.WILLOW_SAPLING.get()));
}