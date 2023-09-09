package com.BubbleTeaM.NET.common.worldgen.features;

import com.BubbleTeaM.NET.common.block.NETBlocks;
import com.BubbleTeaM.NET.common.block.PurpurLichenWallBlock;
import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CocoaBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.treedecorators.CocoaDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;

import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;

public class LichenDecorator extends TreeDecorator {
    public static final Codec<LichenDecorator> CODEC = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(LichenDecorator::new, (p_69989_) -> {
        return p_69989_.probability;
    }).codec();
    private final float probability;

    public LichenDecorator(float p_69976_) {
        this.probability = p_69976_;
    }

    protected TreeDecoratorType<?> type() {
        return NETTreeDecorators.LICHEN.get();
    }

    public void place(LevelSimulatedReader p_161719_, BiConsumer<BlockPos, BlockState> p_161720_, Random p_161721_, List<BlockPos> p_161722_, List<BlockPos> p_161723_) {
        if (!(p_161721_.nextFloat() >= this.probability)) {
            int i = p_161722_.get(0).getY();
            p_161722_.stream().filter((p_69980_) -> {
                return p_69980_.getY() - i <= 2;
            }).forEach((p_161728_) -> {
                for(Direction direction : Direction.Plane.HORIZONTAL) {
                    if (p_161721_.nextFloat() <= 0.25F) {
                        Direction direction1 = direction.getOpposite();
                        BlockPos blockpos = p_161728_.offset(direction1.getStepX(), 0, direction1.getStepZ());
                        if (Feature.isAir(p_161719_, blockpos)) {
                            p_161720_.accept(blockpos, NETBlocks.PURPUR_LICHEN_WALL.get().defaultBlockState().setValue(PurpurLichenWallBlock.FACING, direction));
                        }
                    }
                }

            });
        }
    }
}
