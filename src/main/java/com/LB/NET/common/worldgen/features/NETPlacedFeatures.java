package com.BubbleTeaM.NET.common.worldgen.features;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.RarityFilter;

public class NETPlacedFeatures  {
    public static final Holder<PlacedFeature> POPLAR_PLACED = PlacementUtils.register("poplar_placed",
        NETConfiguredFeatures.POPLAR_SPAWN, VegetationPlacements.treePlacement(RarityFilter.onAverageOnceEvery(100)));
}