package net.mcacejr.floral.block;

import net.mcacejr.floral.block.custom.FloralPlantHeadBlock;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.RegistryObject;

public class FloralPlantHeadBlocks {
    public static final RegistryObject<Block> THICK_STALK;
    public static final RegistryObject<Block> THICK_VINES;
    public static final RegistryObject<Block> PINK_ALCEA;

    public static void register() {

    }

    static {
        THICK_STALK = FloralBlocks.registerBlock("thick_stalk",
                () -> new FloralPlantHeadBlock(FloralPlantBodyBlocks.THICK_STALK_PLANT, Direction.UP, BlockBehaviour.Properties.copy(Blocks.TWISTING_VINES).noOcclusion().noCollission()));
        THICK_VINES = FloralBlocks.registerBlock("thick_vines",
                () -> new FloralPlantHeadBlock(FloralPlantBodyBlocks.THICK_VINES_PLANT, Direction.DOWN, BlockBehaviour.Properties.copy(Blocks.WEEPING_VINES).noOcclusion().noCollission()));
        PINK_ALCEA = FloralBlocks.registerBlock("pink_alcea",
                () -> new FloralPlantHeadBlock(FloralPlantBodyBlocks.PINK_ALCEA_PLANT, Direction.UP, BlockBehaviour.Properties.copy(Blocks.TWISTING_VINES).noOcclusion().noCollission()));
    }
}
