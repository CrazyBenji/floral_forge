package net.mcacejr.floral.block;

import net.mcacejr.floral.block.custom.FloralPlantBodyBlock;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.RegistryObject;

public class FloralPlantBodyBlocks {
    public static final RegistryObject<Block> THICK_STALK_PLANT;
    public static final RegistryObject<Block> THICK_VINES_PLANT;
    public static final RegistryObject<Block> PINK_ALCEA_PLANT;

    public static void register() {

    }

    static {
        THICK_STALK_PLANT = FloralBlocks.registerBlock("thick_stalk_plant",
                () -> new FloralPlantBodyBlock(FloralPlantHeadBlocks.THICK_STALK, Direction.UP, false, BlockBehaviour.Properties.copy(Blocks.TWISTING_VINES_PLANT).noOcclusion().noCollission()));
        THICK_VINES_PLANT = FloralBlocks.registerBlock("thick_vines_plant",
                () -> new FloralPlantBodyBlock(FloralPlantHeadBlocks.THICK_VINES, Direction.DOWN, false, BlockBehaviour.Properties.copy(Blocks.WEEPING_VINES_PLANT).noOcclusion().noCollission()));
        PINK_ALCEA_PLANT = FloralBlocks.registerBlock("pink_alcea_plant",
                () -> new FloralPlantBodyBlock(FloralPlantHeadBlocks.PINK_ALCEA, Direction.UP, true, BlockBehaviour.Properties.copy(Blocks.TWISTING_VINES_PLANT).noOcclusion().noCollission()));
    }
}
