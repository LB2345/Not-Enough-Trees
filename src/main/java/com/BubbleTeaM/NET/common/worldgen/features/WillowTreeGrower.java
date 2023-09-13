package com.BubbleTeaM.NET.common.worldgen.features;

import net.minecraft.core.Holder;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

import javax.annotation.Nullable;
import java.util.Random;

public class WillowTreeGrower extends AbstractTreeGrower {
    @Nullable
    protected Holder<? extends ConfiguredFeature<?, ?>> getConfiguredFeature(Random p_204313_, boolean p_204314_) {
        return NETConfiguredFeatures.WILLOW_TREE;
    }
}
