package net.mcacejr.floral.block.custom;


import net.mcacejr.floral.block.FloralBlocks;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.GrowingPlantHeadBlock;
import net.minecraft.world.level.block.NetherVines;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class ThickVineBlock extends GrowingPlantHeadBlock {

    protected static final VoxelShape SHAPE = box(4.0, 1.0, 4.0, 12.0, 16.0, 12.0);

    public ThickVineBlock(Properties settings, boolean tickWater, float growthChance) {
        super(settings, Direction.DOWN, SHAPE, tickWater, growthChance);
    }

    @Override
    protected int getBlocksToGrowWhenBonemealed(@NotNull RandomSource random) {
        return NetherVines.getBlocksToGrowWhenBonemealed(random);
    }

    @Override
    protected @NotNull Block getBodyBlock() {
        return FloralBlocks.THICK_VINES_PLANT.get();
    }

    @Override
    protected boolean canGrowInto(@NotNull BlockState state) {
        return NetherVines.isValidGrowthState(state);
    }

}
