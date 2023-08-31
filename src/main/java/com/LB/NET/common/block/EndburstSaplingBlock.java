package com.BubbleTeaM.NET.common.block;

import com.BubbleTeaM.NET.common.worldgen.features.EndburstTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.Random;

public class EndburstSaplingBlock extends BushBlock implements BonemealableBlock {
    private static final EndburstTreeGrower TREE_GROWER = new EndburstTreeGrower();
    private static final VoxelShape SHAPE = Shapes.or(Block.box(0.0D, 8.0D, 0.0D, 16.0D, 16.0D, 16.0D), Block.box(6.0D, 0.0D, 6.0D, 10.0D, 8.0D, 10.0D));

    public EndburstSaplingBlock(Properties p_49795_) {
        super(p_49795_);
    }

    public VoxelShape getShape(BlockState p_152084_, BlockGetter p_152085_, BlockPos p_152086_, CollisionContext p_152087_) {
        return SHAPE;
    }

    protected boolean mayPlaceOn(BlockState p_51042_, BlockGetter p_51043_, BlockPos p_51044_) {
        return p_51042_.is(Blocks.END_STONE) || p_51042_.is(NETBlocks.PURPEAT_MOSS_BLOCK.get());
    }

    public boolean isValidBonemealTarget(BlockGetter p_152074_, BlockPos p_152075_, BlockState p_152076_, boolean p_152077_) {
        return p_152074_.getFluidState(p_152075_.above()).isEmpty();
    }

    public boolean isBonemealSuccess(Level p_152079_, Random p_152080_, BlockPos p_152081_, BlockState p_152082_) {
        return (double) p_152079_.random.nextFloat() < 0.45D;
    }

    public void performBonemeal(ServerLevel p_152069_, Random p_152070_, BlockPos p_152071_, BlockState p_152072_) {
        TREE_GROWER.growTree(p_152069_, p_152069_.getChunkSource().getGenerator(), p_152071_, p_152072_, p_152070_);
    }
}
