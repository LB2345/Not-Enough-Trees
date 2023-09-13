package com.BubbleTeaM.NET.common.worldgen.biome;

import com.BubbleTeaM.NET.common.worldgen.features.NETVegetationPlacements;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.levelgen.GenerationStep;

public class NETBiomeDefaultFeatures {
    public static void addEbonyTrees(BiomeGenerationSettings.Builder p_126681_) {
        p_126681_.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, NETVegetationPlacements.TREES_EBONY_GROVE);
    }
}
