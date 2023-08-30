package com.BubbleTeaM.NET.common.worldgen.features;

import com.BubbleTeaM.NET.common.block.NETBlocks;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.block.DoublePlantBlock;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class NETBlockColors {
    public static net.minecraft.client.color.block.BlockColors createDefault() {
        net.minecraft.client.color.block.BlockColors blockcolors = new net.minecraft.client.color.block.BlockColors();
        blockcolors.register((p_92646_, p_92647_, p_92648_, p_92649_) -> {
            return p_92647_ != null && p_92648_ != null ? BiomeColors.getAverageGrassColor(p_92647_, p_92646_.getValue(DoublePlantBlock.HALF) == DoubleBlockHalf.UPPER ? p_92648_.below() : p_92648_) : -1;
        }, NETBlocks.POPLAR_LEAVES.get());
        blockcolors.register((p_92626_, p_92627_, p_92628_, p_92629_) -> {
            return p_92627_ != null && p_92628_ != null ? BiomeColors.getAverageFoliageColor(p_92627_, p_92628_) : FoliageColor.getBirchColor();
        });
        return blockcolors;
    }
}
