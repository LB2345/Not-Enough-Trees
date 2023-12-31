package com.BubbleTeaM.NET.common.block;

import com.BubbleTeaM.NET.common.block.entity.NETSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class NETWallSignBlock extends WallSignBlock {
    public NETWallSignBlock(Properties p_56990_, WoodType p_56991_) {
        super(p_56990_, p_56991_);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new NETSignBlockEntity(pPos, pState);
    }
}
