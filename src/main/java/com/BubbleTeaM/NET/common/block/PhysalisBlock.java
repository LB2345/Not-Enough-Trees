package com.BubbleTeaM.NET.common.block;

import com.BubbleTeaM.NET.common.block.NETBlocks;
import com.BubbleTeaM.NET.common.worldgen.features.EndburstTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class PhysalisBlock extends BushBlock {

    public PhysalisBlock(Properties p_51021_) {
        super(p_51021_);
    }
    protected boolean mayPlaceOn(BlockState p_51042_, BlockGetter p_51043_, BlockPos p_51044_) {
        return p_51042_.is(Blocks.END_STONE) || p_51042_.is(NETBlocks.PURPEAT_MOSS_BLOCK.get());
    }
}
