package com.BubbleTeaM.NET.common.worldgen.features;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.TreePlacements;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;

import java.util.List;

public class NETVegetationFeatures {
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> TREES_EBONY_GROVE = FeatureUtils.register("trees_ebony_grove", Feature.RANDOM_SELECTOR, new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(TreePlacements.ACACIA_CHECKED, 0.5F), new WeightedPlacedFeature(NETPlacedFeatures.EBONY_CHECKED, 0.8F)), TreePlacements.OAK_CHECKED));
}
