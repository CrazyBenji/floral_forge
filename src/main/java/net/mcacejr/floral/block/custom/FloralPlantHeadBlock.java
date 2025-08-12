package net.mcacejr.floral.block.custom;

import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.GrowingPlantHeadBlock;
import net.minecraft.world.level.block.NetherVines;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public class FloralPlantHeadBlock extends GrowingPlantHeadBlock {
    public static final VoxelShape SHAPE = box(4.0, 0.0, 4.0, 12.0, 15.0, 12.0);
    public final Supplier<Block> BODY_BLOCK;

    public FloralPlantHeadBlock(Supplier<Block> bodyBlock, Direction direction, Properties settings, boolean tickWater, float growthChance) {
        super(settings, direction, SHAPE, tickWater, growthChance);
        this.BODY_BLOCK = bodyBlock;
    }
    public FloralPlantHeadBlock(Supplier<Block> bodyBlock, Direction direction, Properties settings) {
        super(settings, direction, SHAPE, false, 0.1F);
        this.BODY_BLOCK = bodyBlock;
    }

    @Override
    protected int getBlocksToGrowWhenBonemealed(RandomSource random) {
        return NetherVines.getBlocksToGrowWhenBonemealed(random);
    }

    @Override
    protected @NotNull Block getBodyBlock() {
        return this.BODY_BLOCK.get();
    }

    @Override
    protected boolean canGrowInto(@NotNull BlockState state) {
        return NetherVines.isValidGrowthState(state);
    }

}
