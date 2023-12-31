package com.BubbleTeaM.NET.common.block;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;
import java.util.Map;

public class PurpurLichenWallBlock extends Block{

    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    private static final Map<Direction, VoxelShape> SHAPES = Maps.newEnumMap(ImmutableMap.of(Direction.NORTH, Block.box(0.0D, 4.0D, 5.0D, 16.0D, 12.0D, 16.0D), Direction.SOUTH, Block.box(0.0D, 4.0D, 0.0D, 16.0D, 12.0D, 11.0D), Direction.WEST, Block.box(5.0D, 4.0D, 0.0D, 16.0D, 12.0D, 16.0D), Direction.EAST, Block.box(0.0D, 4.0D, 0.0D, 11.0D, 12.0D, 16.0D)));

    public PurpurLichenWallBlock(BlockBehaviour.Properties p_49196_) {
        super(p_49196_);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
    }

    public VoxelShape getShape(BlockState p_49219_, BlockGetter p_49220_, BlockPos p_49221_, CollisionContext p_49222_) {
        return SHAPES.get(p_49219_.getValue(FACING));
    }

    public BlockState rotate(BlockState p_49207_, Rotation p_49208_) {
        return p_49207_.setValue(FACING, p_49208_.rotate(p_49207_.getValue(FACING)));
    }

    public BlockState mirror(BlockState p_49204_, Mirror p_49205_) {
        return p_49204_.rotate(p_49205_.getRotation(p_49204_.getValue(FACING)));
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_49217_) {
        p_49217_.add(FACING);
    }


    public boolean canSurvive(BlockState p_49200_, LevelReader p_49201_, BlockPos p_49202_) {
        Direction direction = p_49200_.getValue(FACING);
        BlockPos blockpos = p_49202_.relative(direction.getOpposite());
        BlockState blockstate = p_49201_.getBlockState(blockpos);
        return blockstate.isFaceSturdy(p_49201_, blockpos, direction);
    }

    public BlockState getStateForPlacement(BlockPlaceContext p_49198_) {
        BlockState blockstate = super.getStateForPlacement(p_49198_);
        LevelReader levelreader = p_49198_.getLevel();
        BlockPos blockpos = p_49198_.getClickedPos();
        Direction[] adirection = p_49198_.getNearestLookingDirections();

        for(Direction direction : adirection) {
            if (direction.getAxis().isHorizontal()) {
                blockstate = blockstate.setValue(FACING, direction.getOpposite());
                if (blockstate.canSurvive(levelreader, blockpos)) {
                    return blockstate;
                }
            }
        }

        return null;
    }
}
