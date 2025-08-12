package net.mcacejr.floral.block.custom;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.GrowingPlantBodyBlock;
import net.minecraft.world.level.block.GrowingPlantHeadBlock;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public class FloralPlantBodyBlock extends GrowingPlantBodyBlock {
    public static final VoxelShape SHAPE = box(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
    public final Supplier<Block> HEAD_BLOCK;
    private final boolean canUseFlowerBlend;

    public FloralPlantBodyBlock(Supplier<Block> headBlock, Direction direction, boolean canUseFlowerBlend, Properties settings) {
        super(settings, direction, SHAPE, false);
        this.HEAD_BLOCK = headBlock;
        this.canUseFlowerBlend = canUseFlowerBlend;
    }

    @Override
    protected @NotNull GrowingPlantHeadBlock getHeadBlock() {
        return (GrowingPlantHeadBlock) this.HEAD_BLOCK.get();
    }

    public boolean canUseFlowerBlend() {
        return this.canUseFlowerBlend;
    }
}
