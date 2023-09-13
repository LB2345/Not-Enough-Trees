package com.BubbleTeaM.NET.common.worldgen.features;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.VegetationFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import static net.minecraft.data.worldgen.placement.VegetationPlacements.treePlacement;

public class NETVegetationPlacements {
    public static final Holder<PlacedFeature> TREES_EBONY_GROVE = PlacementUtils.register("trees_ebony_grove", NETVegetationFeatures.TREES_EBONY_GROVE, treePlacement(PlacementUtils.countExtra(1, 0.1F, 1)));
}
