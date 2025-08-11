package net.mcacejr.floral.datagen;

import net.mcacejr.floral.FloralForge;
import net.mcacejr.floral.block.FloralBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class FloralBlockTagProviderForge extends BlockTagsProvider {

    public FloralBlockTagProviderForge(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, FloralForge.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {

        this.tag(BlockTags.FLOWERS)
                .add(FloralBlocks.BLACK_PETUNIA.get())
                .add(FloralBlocks.RED_PETUNIA.get())
                .add(Blocks.SPORE_BLOSSOM)
                .add(FloralBlocks.PURPLE_BELLFLOWER.get())
                .add(FloralBlocks.GREEN_CONEFLOWER.get())
                .add(FloralBlocks.PURPLE_CHIMNEY_BELLFLOWER.get())
                .add(FloralBlocks.BLUE_AUBRIETAS.get())
                .add(FloralBlocks.PINK_ALCEA.get())
                .add(FloralBlocks.PINK_ALCEA_PLANT.get())
                .add(FloralBlocks.LIGHT_GRAY_TULIP.get())
                .add(FloralBlocks.GRAY_TULIP.get())
                .add(FloralBlocks.BLACK_TULIP.get())
                .add(FloralBlocks.BROWN_TULIP.get())
                .add(FloralBlocks.YELLOW_TULIP.get())
                .add(FloralBlocks.LIME_TULIP.get())
                .add(FloralBlocks.GREEN_TULIP.get())
                .add(FloralBlocks.CYAN_TULIP.get())
                .add(FloralBlocks.LIGHT_BLUE_TULIP.get())
                .add(FloralBlocks.BLUE_TULIP.get())
                .add(FloralBlocks.PURPLE_TULIP.get())
                .add(FloralBlocks.MAGENTA_TULIP.get())
                .add(FloralBlocks.WEEPING_ROOTS.get())
                .add(FloralBlocks.TWISTING_ROOTS.get())
                .add(FloralBlocks.WARDEN_PRIMROSE.get())
                .add(FloralBlocks.ROCKY_SEDUM.get())
                .add(FloralBlocks.STEM_LILY.get())
                .add(FloralBlocks.BONES_BANE.get())
                .add(FloralBlocks.GREEN_DAHLIA.get())
                .add(FloralBlocks.MAGENTA_CABARET.get())
                .add(FloralBlocks.LIME_BELLFLOWER.get())
                .add(FloralBlocks.LIME_CHIMNEY_BELLFLOWER.get())
                .add(FloralBlocks.PURPLE_WOLFSBANE.get());

        this.tag(BlockTags.TALL_FLOWERS)
                .add(FloralBlocks.PURPLE_CHIMNEY_BELLFLOWER.get())
                .add(FloralBlocks.LIME_CHIMNEY_BELLFLOWER.get())
                .add(FloralBlocks.PINK_ALCEA.get());

        this.tag(BlockTags.CLIMBABLE)
                .add(FloralBlocks.THICK_STALK.get())
                .add(FloralBlocks.THICK_STALK_PLANT.get())
                .add(FloralBlocks.THICK_VINES.get())
                .add(FloralBlocks.THICK_VINES_PLANT.get());

        this.tag(BlockTags.FLOWER_POTS)
                .add(FloralBlocks.POTTED_BLACK_PETUNIA.get())
                .add(FloralBlocks.POTTED_RED_PETUNIA.get())
                .add(FloralBlocks.POTTED_PURPLE_BELLFLOWER.get())
                .add(FloralBlocks.POTTED_GREEN_CONEFLOWER.get())
                .add(FloralBlocks.POTTED_LIGHT_GRAY_TULIP.get())
                .add(FloralBlocks.POTTED_GRAY_TULIP.get())
                .add(FloralBlocks.POTTED_BLACK_TULIP.get())
                .add(FloralBlocks.POTTED_BROWN_TULIP.get())
                .add(FloralBlocks.POTTED_YELLOW_TULIP.get())
                .add(FloralBlocks.POTTED_LIME_TULIP.get())
                .add(FloralBlocks.POTTED_GREEN_TULIP.get())
                .add(FloralBlocks.POTTED_CYAN_TULIP.get())
                .add(FloralBlocks.POTTED_LIGHT_BLUE_TULIP.get())
                .add(FloralBlocks.POTTED_BLUE_TULIP.get())
                .add(FloralBlocks.POTTED_PURPLE_TULIP.get())
                .add(FloralBlocks.POTTED_MAGENTA_TULIP.get())
                .add(FloralBlocks.POTTED_GREEN_DAHLIA.get())
                .add(FloralBlocks.POTTED_MAGENTA_CABARET.get())
                .add(FloralBlocks.POTTED_LIME_BELLFLOWER.get())
                .add(FloralBlocks.POTTED_PURPLE_WOLFSBANE.get());

        this.tag(BlockTags.STAIRS)
                .add(FloralBlocks.STEM_STAIRS.get())
                .add(FloralBlocks.FLORAL_STONE_STAIRS.get())
                .add(FloralBlocks.FLORAL_STONE_BRICK_STAIRS.get())
                .add(FloralBlocks.COBBLED_FLORAL_STONE_STAIRS.get());
        this.tag(BlockTags.SLABS)
                .add(FloralBlocks.FLORAL_STONE_SLAB.get())
                .add(FloralBlocks.FLORAL_STONE_BRICK_SLAB.get())
                .add(FloralBlocks.COBBLED_FLORAL_STONE_SLAB.get());
        this.tag(BlockTags.WALLS)
                .add(FloralBlocks.FLORAL_STONE_WALL.get())
                .add(FloralBlocks.FLORAL_STONE_BRICK_WALL.get())
                .add(FloralBlocks.COBBLED_FLORAL_STONE_WALL.get());

        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(FloralBlocks.STEM_LOG.get())
                .add(FloralBlocks.STEM_WOOD.get())
                .add(FloralBlocks.STRIPPED_STEM_LOG.get())
                .add(FloralBlocks.STRIPPED_STEM_WOOD.get());

        this.tag(BlockTags.FENCES)
                .add(FloralBlocks.STEM_FENCE.get());

        this.tag(BlockTags.FENCE_GATES)
                .add(FloralBlocks.STEM_FENCE_GATE.get());
    }
}
