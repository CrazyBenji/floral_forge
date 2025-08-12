package net.mcacejr.floral.datagen;

import net.mcacejr.floral.FloralForge;
import net.mcacejr.floral.block.FloralBlocks;
import net.mcacejr.floral.block.FloralPlantHeadBlocks;
import net.mcacejr.floral.item.FloralItems;
import net.mcacejr.floral.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class FloralItemTagProviderForge extends ItemTagsProvider {

    public FloralItemTagProviderForge(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, FloralForge.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {

        this.tag(ModTags.Items.PETALS)
                .add(FloralItems.BLACK_PETAL.get())
                .add(FloralItems.GRAY_PETAL.get())
                .add(FloralItems.LIGHT_GRAY_PETAL.get())
                .add(FloralItems.WHITE_PETAL.get())
                .add(FloralItems.RED_PETAL.get())
                .add(FloralItems.ORANGE_PETAL.get())
                .add(FloralItems.BROWN_PETAL.get())
                .add(FloralItems.YELLOW_PETAL.get())
                .add(FloralItems.LIME_PETAL.get())
                .add(FloralItems.GREEN_PETAL.get())
                .add(FloralItems.CYAN_PETAL.get())
                .add(FloralItems.LIGHT_BLUE_PETAL.get())
                .add(FloralItems.BLUE_PETAL.get())
                .add(FloralItems.PURPLE_PETAL.get())
                .add(FloralItems.MAGENTA_PETAL.get())
                .add(FloralItems.PINK_PETAL.get())
                .add(FloralItems.WITHERED_PETAL.get())
                .add(FloralItems.BONES_BANE_PETAL.get());

        this.tag(ItemTags.FLOWERS)
                .add(FloralBlocks.BLACK_PETUNIA.get().asItem())
                .add(FloralBlocks.RED_PETUNIA.get().asItem())
                .add(Items.SPORE_BLOSSOM)
                .add(FloralBlocks.PURPLE_BELLFLOWER.get().asItem())
                .add(FloralBlocks.PURPLE_CHIMNEY_BELLFLOWER.get().asItem())
                .add(FloralBlocks.GREEN_CONEFLOWER.get().asItem())
                .add(FloralBlocks.BLUE_AUBRIETAS.get().asItem())
                .add(FloralPlantHeadBlocks.PINK_ALCEA.get().asItem())
                .add(FloralBlocks.LIGHT_GRAY_TULIP.get().asItem())
                .add(FloralBlocks.GRAY_TULIP.get().asItem())
                .add(FloralBlocks.BLACK_TULIP.get().asItem())
                .add(FloralBlocks.BROWN_TULIP.get().asItem())
                .add(FloralBlocks.YELLOW_TULIP.get().asItem())
                .add(FloralBlocks.LIME_TULIP.get().asItem())
                .add(FloralBlocks.GREEN_TULIP.get().asItem())
                .add(FloralBlocks.CYAN_TULIP.get().asItem())
                .add(FloralBlocks.LIGHT_BLUE_TULIP.get().asItem())
                .add(FloralBlocks.BLUE_TULIP.get().asItem())
                .add(FloralBlocks.PURPLE_TULIP.get().asItem())
                .add(FloralBlocks.MAGENTA_TULIP.get().asItem())
                .add(FloralBlocks.WEEPING_ROOTS.get().asItem())
                .add(FloralBlocks.TWISTING_ROOTS.get().asItem())
                .add(FloralBlocks.WARDEN_PRIMROSE.get().asItem())
                .add(FloralBlocks.ROCKY_SEDUM.get().asItem())
                .add(FloralBlocks.STEM_LILY.get().asItem())
                .add(FloralBlocks.BONES_BANE.get().asItem())
                .add(FloralBlocks.GREEN_DAHLIA.get().asItem())
                .add(FloralBlocks.MAGENTA_CABARET.get().asItem())
                .add(FloralBlocks.LIME_BELLFLOWER.get().asItem())
                .add(FloralBlocks.LIME_CHIMNEY_BELLFLOWER.get().asItem())
                .add(FloralBlocks.PURPLE_WOLFSBANE.get().asItem());

        this.tag(ItemTags.SMALL_FLOWERS)
                .add(FloralBlocks.BLUE_AUBRIETAS.get().asItem())
                .add(FloralBlocks.GREEN_CONEFLOWER.get().asItem())
                .add(FloralBlocks.BLACK_PETUNIA.get().asItem())
                .add(FloralBlocks.RED_PETUNIA.get().asItem())
                .add(FloralBlocks.PURPLE_BELLFLOWER.get().asItem())
                .add(FloralBlocks.LIGHT_GRAY_TULIP.get().asItem())
                .add(FloralBlocks.GRAY_TULIP.get().asItem())
                .add(FloralBlocks.BLACK_TULIP.get().asItem())
                .add(FloralBlocks.BROWN_TULIP.get().asItem())
                .add(FloralBlocks.YELLOW_TULIP.get().asItem())
                .add(FloralBlocks.LIME_TULIP.get().asItem())
                .add(FloralBlocks.GREEN_TULIP.get().asItem())
                .add(FloralBlocks.CYAN_TULIP.get().asItem())
                .add(FloralBlocks.LIGHT_BLUE_TULIP.get().asItem())
                .add(FloralBlocks.BLUE_TULIP.get().asItem())
                .add(FloralBlocks.PURPLE_TULIP.get().asItem())
                .add(FloralBlocks.MAGENTA_TULIP.get().asItem())
                .add(FloralBlocks.WEEPING_ROOTS.get().asItem())
                .add(FloralBlocks.TWISTING_ROOTS.get().asItem())
                .add(FloralBlocks.WARDEN_PRIMROSE.get().asItem())
                .add(FloralBlocks.ROCKY_SEDUM.get().asItem())
                .add(FloralBlocks.STEM_LILY.get().asItem())
                .add(FloralBlocks.GREEN_DAHLIA.get().asItem())
                .add(FloralBlocks.MAGENTA_CABARET.get().asItem())
                .add(FloralBlocks.LIME_BELLFLOWER.get().asItem())
                .add(FloralBlocks.PURPLE_WOLFSBANE.get().asItem());

        this.tag(ItemTags.TALL_FLOWERS)
                .add(FloralPlantHeadBlocks.PINK_ALCEA.get().asItem())
                .add(FloralBlocks.PURPLE_CHIMNEY_BELLFLOWER.get().asItem())
                .add(FloralBlocks.LIME_CHIMNEY_BELLFLOWER.get().asItem());

        this.tag(ItemTags.SWORDS)
                .add(FloralItems.PETUNIA_LANCE.get())
                .add(FloralItems.CORPSE_BLOSSOM.get())
                .add(FloralItems.FLOWER_TRIMMER.get())
                .add(FloralItems.DEADHEADER.get())
                .add(FloralItems.FLORAL_BANE.get());

        this.tag(ModTags.Items.FLOWER_TRIMMERS)
                .add(FloralItems.FLOWER_TRIMMER.get())
                .add(FloralItems.DEADHEADER.get());

        this.tag(ModTags.Items.WHITE_FLOWERS)
                .add(Blocks.WHITE_TULIP.asItem())
                .add(Blocks.LILY_OF_THE_VALLEY.asItem());
        this.tag(ModTags.Items.LIGHT_GRAY_FLOWERS)
                .add(Blocks.AZURE_BLUET.asItem())
                .add(Blocks.OXEYE_DAISY.asItem())
                .add(FloralBlocks.LIGHT_GRAY_TULIP.get().asItem());
        this.tag(ModTags.Items.GRAY_FLOWERS)
                .add(FloralBlocks.GRAY_TULIP.get().asItem());
        this.tag(ModTags.Items.BLACK_FLOWERS)
                .add(FloralBlocks.BLACK_TULIP.get().asItem())
                .add(FloralBlocks.WARDEN_PRIMROSE.get().asItem())
                .add(FloralBlocks.BLACK_PETUNIA.get().asItem());
        this.tag(ModTags.Items.RED_FLOWERS)
                .add(FloralBlocks.RED_PETUNIA.get().asItem())
                .add(Blocks.POPPY.asItem())
                .add(Blocks.RED_TULIP.asItem());
        this.tag(ModTags.Items.ORANGE_FLOWERS)
                .add(Blocks.ORANGE_TULIP.asItem())
                .add(FloralBlocks.ROCKY_SEDUM.get().asItem())
                .add(Blocks.TORCHFLOWER.asItem());
        this.tag(ModTags.Items.BROWN_FLOWERS)
                .add(FloralBlocks.WEEPING_ROOTS.get().asItem())
                .add(FloralBlocks.TWISTING_ROOTS.get().asItem())
                .add(FloralBlocks.BROWN_TULIP.get().asItem());
        this.tag(ModTags.Items.YELLOW_FLOWERS)
                .add(FloralBlocks.YELLOW_TULIP.get().asItem())
                .add(Blocks.DANDELION.asItem());
        this.tag(ModTags.Items.LIME_FLOWERS)
                .add(FloralBlocks.LIME_TULIP.get().asItem())
                .add(FloralBlocks.LIME_BELLFLOWER.get().asItem());
        this.tag(ModTags.Items.GREEN_FLOWERS)
                .add(FloralBlocks.GREEN_TULIP.get().asItem())
                .add(FloralBlocks.GREEN_DAHLIA.get().asItem())
                .add(FloralBlocks.STEM_LILY.get().asItem())
                .add(FloralBlocks.GREEN_CONEFLOWER.get().asItem());
        this.tag(ModTags.Items.CYAN_FLOWERS)
                .add(FloralBlocks.CYAN_TULIP.get().asItem());
        this.tag(ModTags.Items.LIGHT_BLUE_FLOWERS)
                .add(FloralBlocks.LIGHT_BLUE_TULIP.get().asItem())
                .add(Blocks.BLUE_ORCHID.asItem());
        this.tag(ModTags.Items.BLUE_FLOWERS)
                .add(FloralBlocks.BLUE_TULIP.get().asItem())
                .add(Blocks.CORNFLOWER.asItem());
        this.tag(ModTags.Items.PURPLE_FLOWERS)
                .add(FloralBlocks.PURPLE_WOLFSBANE.get().asItem())
                .add(FloralBlocks.PURPLE_TULIP.get().asItem())
                .add(FloralBlocks.PURPLE_BELLFLOWER.get().asItem());
        this.tag(ModTags.Items.MAGENTA_FLOWERS)
                .add(FloralBlocks.MAGENTA_TULIP.get().asItem())
                .add(FloralBlocks.MAGENTA_CABARET.get().asItem())
                .add(Blocks.ALLIUM.asItem());
        this.tag(ModTags.Items.PINK_FLOWERS)
                .add(FloralPlantHeadBlocks.PINK_ALCEA.get().asItem())
                .add(Blocks.PINK_TULIP.asItem());
        
        this.tag(ModTags.Items.TALL_RED_FLOWERS)
                .add(Blocks.ROSE_BUSH.asItem());
        this.tag(ModTags.Items.TALL_YELLOW_FLOWERS)
                .add(Blocks.SUNFLOWER.asItem());
        this.tag(ModTags.Items.TALL_LIME_FLOWERS)
                .add(FloralBlocks.LIME_CHIMNEY_BELLFLOWER.get().asItem());
        this.tag(ModTags.Items.TALL_PURPLE_FLOWERS)
                .add(FloralBlocks.PURPLE_CHIMNEY_BELLFLOWER.get().asItem());
        this.tag(ModTags.Items.TALL_MAGENTA_FLOWERS)
                .add(Blocks.LILAC.asItem());
        this.tag(ModTags.Items.TALL_PINK_FLOWERS)
                .add(Blocks.PEONY.asItem());

        this.tag(ItemTags.STAIRS)
                .add(FloralBlocks.STEM_STAIRS.get().asItem())
                .add(FloralBlocks.FLORAL_STONE_STAIRS.get().asItem())
                .add(FloralBlocks.FLORAL_STONE_BRICK_STAIRS.get().asItem())
                .add(FloralBlocks.COBBLED_FLORAL_STONE_STAIRS.get().asItem());
        this.tag(ItemTags.SLABS)
                .add(FloralBlocks.FLORAL_STONE_SLAB.get().asItem())
                .add(FloralBlocks.FLORAL_STONE_BRICK_SLAB.get().asItem())
                .add(FloralBlocks.COBBLED_FLORAL_STONE_SLAB.get().asItem());
        this.tag(ItemTags.WALLS)
                .add(FloralBlocks.FLORAL_STONE_WALL.get().asItem())
                .add(FloralBlocks.FLORAL_STONE_BRICK_WALL.get().asItem())
                .add(FloralBlocks.COBBLED_FLORAL_STONE_WALL.get().asItem());

        this.tag(ItemTags.PLANKS)
                .add(FloralBlocks.STEM_PLANKS.get().asItem());

        this.tag(ItemTags.LOGS_THAT_BURN)
                .add(FloralBlocks.STEM_LOG.get().asItem())
                .add(FloralBlocks.STEM_WOOD.get().asItem())
                .add(FloralBlocks.STRIPPED_STEM_LOG.get().asItem())
                .add(FloralBlocks.STRIPPED_STEM_WOOD.get().asItem());

        this.tag(ItemTags.LOGS)
                .add(FloralBlocks.STEM_LOG.get().asItem())
                .add(FloralBlocks.STEM_WOOD.get().asItem())
                .add(FloralBlocks.STRIPPED_STEM_LOG.get().asItem())
                .add(FloralBlocks.STRIPPED_STEM_WOOD.get().asItem());

        this.tag(ModTags.Items.STEM_LOGS)
                .add(FloralBlocks.STEM_LOG.get().asItem())
                .add(FloralBlocks.STEM_WOOD.get().asItem())
                .add(FloralBlocks.STRIPPED_STEM_LOG.get().asItem())
                .add(FloralBlocks.STRIPPED_STEM_WOOD.get().asItem());

    }

}
