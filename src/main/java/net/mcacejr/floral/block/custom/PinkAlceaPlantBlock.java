package net.mcacejr.floral.block.custom;

import net.mcacejr.floral.block.FloralBlocks;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.GrowingPlantBodyBlock;
import net.minecraft.world.level.block.GrowingPlantHeadBlock;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class PinkAlceaPlantBlock extends GrowingPlantBodyBlock {

    public static final VoxelShape SHAPE = box(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

    public PinkAlceaPlantBlock(Properties settings) {
        super(settings, Direction.UP, SHAPE, false);
    }

    @Override
    protected @NotNull GrowingPlantHeadBlock getHeadBlock() {
        return (GrowingPlantHeadBlock) FloralBlocks.PINK_ALCEA.get();
    }

}
