package com.BubbleTeaM.NET.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class PurpurLichenBlock extends Block{

    private static final VoxelShape AABB = Block.box(2.0D, 0.0D, 2.0D, 14.0D, 4.0D, 14.0D);

    public PurpurLichenBlock(BlockBehaviour.Properties p_49106_) {
        super(p_49106_);
    }

    public VoxelShape getShape(BlockState p_49108_, BlockGetter p_49109_, BlockPos p_49110_, CollisionContext p_49111_) {
        return AABB;
    }
}
