package io.github.redstoneboy0509.mod.independencedaymod.obj.block;

import io.github.redstoneboy0509.mod.independencedaymod.registration.ModBlocks;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.pathfinding.PathType;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class WatermelonCrop extends CropsBlock {

    private static final VoxelShape[] SHAPE_BY_AGE = new VoxelShape[]{Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D), Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 6.0D, 16.0D), Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D), Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 10.0D, 16.0D), Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D), Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 14.0D, 16.0D), Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D)};

    public WatermelonCrop() {
        super(AbstractBlock.Properties.create(Material.PLANTS).notSolid().sound(SoundType.CROP).zeroHardnessAndResistance());
    }

    @Override
    protected IItemProvider getSeedsItem() {
        return ModBlocks.WATERMELON_SEED.get();
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPE_BY_AGE[state.get(this.getAgeProperty())];
    }

    @Override
    public boolean allowsMovement(BlockState state, IBlockReader worldIn, BlockPos pos, PathType type) {
        return !(state.get(this.getAgeProperty()) >= 7);
    }

}
