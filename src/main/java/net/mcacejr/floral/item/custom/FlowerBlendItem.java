package net.mcacejr.floral.item.custom;

import net.mcacejr.floral.block.FloralBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LevelEvent;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class FlowerBlendItem extends Item {

    public FlowerBlendItem(Properties settings) {
        super(settings);
    }

    @Override
    public @NotNull InteractionResult useOn(UseOnContext context) {

        if (!context.getLevel().isClientSide) {

            BlockState selectedBlockState = context.getLevel().getBlockState(context.getClickedPos());

            BlockPos pos = context.getClickedPos();

            Level world = context.getLevel();

            if (selectedBlockState.is(BlockTags.FLOWERS))
            {

                if (selectedBlockState.is(FloralBlocks.PINK_ALCEA_PLANT.get()))
                {

                    Block.popResource(world, pos, new ItemStack(FloralBlocks.PINK_ALCEA.get()));

                } else {

                    Block.popResource(world, pos, new ItemStack(selectedBlockState.getBlock()));

                }

                world.globalLevelEvent(LevelEvent.PARTICLES_AND_SOUND_PLANT_GROWTH, pos, 0);

                context.getItemInHand().shrink(1);

                return InteractionResult.SUCCESS;

            }

        }

        return InteractionResult.FAIL;

    }

}
