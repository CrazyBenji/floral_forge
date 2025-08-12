package net.mcacejr.floral.datagen;

import net.mcacejr.floral.block.FloralBlocks;
import net.mcacejr.floral.block.FloralPlantHeadBlocks;
import net.mcacejr.floral.item.FloralItems;
import net.mcacejr.floral.util.ModTags;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class FloralRecipeProviderForge extends RecipeProvider implements IConditionBuilder {

    public FloralRecipeProviderForge(PackOutput output) {
        super(output);
    }

    public static void offerPetalRecipe(Consumer<FinishedRecipe> exporter, TagKey<Item> flowerItem, Item petalItem) {

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, petalItem, 3)
                .requires(ModTags.Items.FLOWER_TRIMMERS)
                .requires(flowerItem)
                .unlockedBy(getHasName(FloralItems.FLOWER_TRIMMER.get()), has(FloralItems.FLOWER_TRIMMER.get()))
                .unlockedBy(getHasName(FloralItems.DEADHEADER.get()), has(FloralItems.DEADHEADER.get()))
                .save(exporter, petalItem + "_from_" + flowerItem.location());
    }

    public static void offerTallPetalRecipe(Consumer<FinishedRecipe> exporter, TagKey<Item> flowerItem, Item petalItem) {

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, petalItem, 6)
                .requires(ModTags.Items.FLOWER_TRIMMERS)
                .requires(flowerItem)
                .unlockedBy(getHasName(FloralItems.FLOWER_TRIMMER.get()), has(FloralItems.FLOWER_TRIMMER.get()))
                .unlockedBy(getHasName(FloralItems.DEADHEADER.get()), has(FloralItems.DEADHEADER.get()))
                .save(exporter, petalItem + "_from_" + flowerItem.location());

    }

    public static void offerPetalToDyeRecipe(Consumer<FinishedRecipe> exporter, Item petalItem, Item dyeItem) {

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, dyeItem, 1)
                .requires(petalItem)
                .unlockedBy(getHasName(petalItem), has(petalItem))
                .save(exporter, dyeItem + "_from_" + petalItem);

    }

    public static void offerFlowerToDyeRecipe(Consumer<FinishedRecipe> exporter, Item flowerItem, Item dyeItem, int count) {

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, dyeItem, count)
                .requires(flowerItem)
                .unlockedBy(getHasName(flowerItem), has(flowerItem))
                .save(exporter, dyeItem + "_from_" + flowerItem);

    }

    @Override
    public void buildRecipes(@NotNull Consumer<FinishedRecipe> exporter) {

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, FloralItems.FLOWER_TRIMMER.get())
                .pattern(" I ")
                .pattern("LSI")
                .pattern("G  ")
                .define('I', Items.IRON_INGOT)
                .define('S', Items.STICK)
                .define('L', Items.LEATHER)
                .define('G', Items.GREEN_DYE)
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .unlockedBy(getHasName(Items.LEATHER), has(Items.LEATHER))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, FloralItems.DEADHEADER.get())
                .pattern("N N")
                .pattern("LTL")
                .pattern(" R ")
                .define('N', Items.NETHERITE_INGOT)
                .define('T', FloralItems.FLOWER_TRIMMER.get())
                .define('L', FloralItems.RED_PETAL.get())
                .define('R', Items.LEATHER)
                .unlockedBy(getHasName(FloralItems.FLOWER_TRIMMER.get()), has(FloralItems.FLOWER_TRIMMER.get()))
                .unlockedBy(getHasName(Items.NETHERITE_INGOT), has(Items.NETHERITE_INGOT))
                .save(exporter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, FloralItems.WITHERED_PETAL.get())
                .requires(ModTags.Items.FLOWER_TRIMMERS)
                .requires(Blocks.WITHER_ROSE)
                .unlockedBy(getHasName(FloralItems.FLOWER_TRIMMER.get()), has(FloralItems.FLOWER_TRIMMER.get()))
                .unlockedBy(getHasName(FloralItems.DEADHEADER.get()), has(FloralItems.DEADHEADER.get()))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, FloralItems.CORPSE_BLOSSOM.get())
                .pattern("WBW")
                .pattern("WOW")
                .pattern("WBW")
                .define('W', FloralItems.WITHERED_PETAL.get())
                .define('O', Items.OXEYE_DAISY)
                .define('B', FloralItems.FLOWER_BLEND.get())
                .unlockedBy(getHasName(FloralItems.WITHERED_PETAL.get()), has(FloralItems.WITHERED_PETAL.get()))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, FloralItems.FLORAL_BANE.get())
                .pattern(" PP")
                .pattern("MPB")
                .pattern("BN ")
                .define('P', FloralItems.BONES_BANE_PETAL.get())
                .define('B', Items.BONE)
                .define('M', Items.BONE_BLOCK)
                .define('N', Items.NETHERITE_INGOT)
                .unlockedBy(getHasName(FloralItems.BONES_BANE_PETAL.get()), has(FloralItems.BONES_BANE_PETAL.get()))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, FloralItems.FLOWER_BLEND.get(), 2)
                .pattern("FFF")
                .pattern("FBF")
                .pattern("FFF")
                .define('F', ItemTags.FLOWERS)
                .define('B', Items.BONE_MEAL)
                .unlockedBy(getHasName(Items.BONE_MEAL), has(Items.BONE_MEAL))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, FloralItems.FLORAL_CROWN.get())
                .pattern("FFF")
                .pattern("FBF")
                .pattern("FFF")
                .define('F', ItemTags.FLOWERS)
                .define('B', FloralItems.FLOWER_BLEND.get())
                .unlockedBy(getHasName(FloralItems.FLOWER_BLEND.get()), has(FloralItems.FLOWER_BLEND.get()))
                .save(exporter);

        offerPetalRecipe(exporter, ModTags.Items.WHITE_FLOWERS, FloralItems.WHITE_PETAL.get());
        offerPetalRecipe(exporter, ModTags.Items.LIGHT_GRAY_FLOWERS, FloralItems.LIGHT_GRAY_PETAL.get());
        offerPetalRecipe(exporter, ModTags.Items.GRAY_FLOWERS, FloralItems.GRAY_PETAL.get());
        offerPetalRecipe(exporter, ModTags.Items.BLACK_FLOWERS, FloralItems.BLACK_PETAL.get());
        offerPetalRecipe(exporter, ModTags.Items.RED_FLOWERS, FloralItems.RED_PETAL.get());
        offerPetalRecipe(exporter, ModTags.Items.ORANGE_FLOWERS, FloralItems.ORANGE_PETAL.get());
        offerPetalRecipe(exporter, ModTags.Items.BROWN_FLOWERS, FloralItems.BROWN_PETAL.get());
        offerPetalRecipe(exporter, ModTags.Items.YELLOW_FLOWERS, FloralItems.YELLOW_PETAL.get());
        offerPetalRecipe(exporter, ModTags.Items.LIME_FLOWERS, FloralItems.LIME_PETAL.get());
        offerPetalRecipe(exporter, ModTags.Items.GREEN_FLOWERS, FloralItems.GREEN_PETAL.get());
        offerPetalRecipe(exporter, ModTags.Items.CYAN_FLOWERS, FloralItems.CYAN_PETAL.get());
        offerPetalRecipe(exporter, ModTags.Items.LIGHT_BLUE_FLOWERS, FloralItems.LIGHT_BLUE_PETAL.get());
        offerPetalRecipe(exporter, ModTags.Items.BLUE_FLOWERS, FloralItems.BLUE_PETAL.get());
        offerPetalRecipe(exporter, ModTags.Items.PURPLE_FLOWERS, FloralItems.PURPLE_PETAL.get());
        offerPetalRecipe(exporter, ModTags.Items.MAGENTA_FLOWERS, FloralItems.MAGENTA_PETAL.get());
        offerPetalRecipe(exporter, ModTags.Items.PINK_FLOWERS, FloralItems.PINK_PETAL.get());

        offerTallPetalRecipe(exporter, ModTags.Items.TALL_RED_FLOWERS, FloralItems.RED_PETAL.get());
        offerTallPetalRecipe(exporter, ModTags.Items.TALL_YELLOW_FLOWERS, FloralItems.YELLOW_PETAL.get());
        offerTallPetalRecipe(exporter, ModTags.Items.TALL_LIME_FLOWERS, FloralItems.LIME_PETAL.get());
        offerTallPetalRecipe(exporter, ModTags.Items.TALL_PURPLE_FLOWERS, FloralItems.PURPLE_PETAL.get());
        offerTallPetalRecipe(exporter, ModTags.Items.TALL_MAGENTA_FLOWERS, FloralItems.MAGENTA_PETAL.get());
        offerTallPetalRecipe(exporter, ModTags.Items.TALL_PINK_FLOWERS, FloralItems.PINK_PETAL.get());

        offerPetalToDyeRecipe(exporter, FloralItems.WHITE_PETAL.get(), Items.WHITE_DYE);
        offerPetalToDyeRecipe(exporter, FloralItems.LIGHT_GRAY_PETAL.get(), Items.LIGHT_GRAY_DYE);
        offerPetalToDyeRecipe(exporter, FloralItems.GRAY_PETAL.get(), Items.GRAY_DYE);
        offerPetalToDyeRecipe(exporter, FloralItems.BLACK_PETAL.get(), Items.BLACK_DYE);
        offerPetalToDyeRecipe(exporter, FloralItems.RED_PETAL.get(), Items.RED_DYE);
        offerPetalToDyeRecipe(exporter, FloralItems.ORANGE_PETAL.get(), Items.ORANGE_DYE);
        offerPetalToDyeRecipe(exporter, FloralItems.BROWN_PETAL.get(), Items.BROWN_DYE);
        offerPetalToDyeRecipe(exporter, FloralItems.YELLOW_PETAL.get(), Items.YELLOW_DYE);
        offerPetalToDyeRecipe(exporter, FloralItems.LIME_PETAL.get(), Items.LIME_DYE);
        offerPetalToDyeRecipe(exporter, FloralItems.GREEN_PETAL.get(), Items.GREEN_DYE);
        offerPetalToDyeRecipe(exporter, FloralItems.CYAN_PETAL.get(), Items.CYAN_DYE);
        offerPetalToDyeRecipe(exporter, FloralItems.LIGHT_BLUE_PETAL.get(), Items.LIGHT_BLUE_DYE);
        offerPetalToDyeRecipe(exporter, FloralItems.BLUE_PETAL.get(), Items.BLUE_DYE);
        offerPetalToDyeRecipe(exporter, FloralItems.PURPLE_PETAL.get(), Items.PURPLE_DYE);
        offerPetalToDyeRecipe(exporter, FloralItems.MAGENTA_PETAL.get(), Items.MAGENTA_DYE);
        offerPetalToDyeRecipe(exporter, FloralItems.PINK_PETAL.get(), Items.PINK_DYE);
        offerPetalToDyeRecipe(exporter, FloralItems.WITHERED_PETAL.get(), Items.BLACK_DYE);
        offerPetalToDyeRecipe(exporter, FloralItems.BONES_BANE_PETAL.get(), Items.PURPLE_DYE);

        offerFlowerToDyeRecipe(exporter, FloralBlocks.BLACK_PETUNIA.get().asItem(), Items.BLACK_DYE, 1);
        offerFlowerToDyeRecipe(exporter, FloralBlocks.RED_PETUNIA.get().asItem(), Items.RED_DYE, 1);
        offerFlowerToDyeRecipe(exporter, FloralBlocks.PURPLE_BELLFLOWER.get().asItem(), Items.PURPLE_DYE, 1);
        offerFlowerToDyeRecipe(exporter, FloralBlocks.PURPLE_CHIMNEY_BELLFLOWER.get().asItem(), Items.PURPLE_DYE, 2);
        offerFlowerToDyeRecipe(exporter, FloralBlocks.GREEN_CONEFLOWER.get().asItem(), Items.GREEN_DYE, 1);
        offerFlowerToDyeRecipe(exporter, FloralBlocks.BLUE_AUBRIETAS.get().asItem(), Items.BLUE_DYE, 1);
        offerFlowerToDyeRecipe(exporter, FloralPlantHeadBlocks.PINK_ALCEA.get().asItem(), Items.PINK_DYE, 1);

        offerFlowerToDyeRecipe(exporter, FloralBlocks.LIGHT_GRAY_TULIP.get().asItem(), Items.LIGHT_GRAY_DYE, 1);
        offerFlowerToDyeRecipe(exporter, FloralBlocks.GRAY_TULIP.get().asItem(), Items.GRAY_DYE, 1);
        offerFlowerToDyeRecipe(exporter, FloralBlocks.BLACK_TULIP.get().asItem(), Items.BLACK_DYE, 1);
        offerFlowerToDyeRecipe(exporter, FloralBlocks.BROWN_TULIP.get().asItem(), Items.BROWN_DYE, 1);
        offerFlowerToDyeRecipe(exporter, FloralBlocks.YELLOW_TULIP.get().asItem(), Items.YELLOW_DYE, 1);
        offerFlowerToDyeRecipe(exporter, FloralBlocks.LIME_TULIP.get().asItem(), Items.LIME_DYE, 1);
        offerFlowerToDyeRecipe(exporter, FloralBlocks.GREEN_TULIP.get().asItem(), Items.GREEN_DYE, 1);
        offerFlowerToDyeRecipe(exporter, FloralBlocks.CYAN_TULIP.get().asItem(), Items.CYAN_DYE, 1);
        offerFlowerToDyeRecipe(exporter, FloralBlocks.LIGHT_BLUE_TULIP.get().asItem(), Items.LIGHT_BLUE_DYE, 1);
        offerFlowerToDyeRecipe(exporter, FloralBlocks.BLUE_TULIP.get().asItem(), Items.BLUE_DYE, 1);
        offerFlowerToDyeRecipe(exporter, FloralBlocks.PURPLE_TULIP.get().asItem(), Items.PURPLE_DYE, 1);
        offerFlowerToDyeRecipe(exporter, FloralBlocks.MAGENTA_TULIP.get().asItem(), Items.MAGENTA_DYE, 1);

        offerFlowerToDyeRecipe(exporter, FloralBlocks.GREEN_DAHLIA.get().asItem(), Items.GREEN_DYE, 1);
        offerFlowerToDyeRecipe(exporter, FloralBlocks.MAGENTA_CABARET.get().asItem(), Items.MAGENTA_DYE, 1);
        offerFlowerToDyeRecipe(exporter, FloralBlocks.LIME_BELLFLOWER.get().asItem(), Items.LIME_DYE, 1);
        offerFlowerToDyeRecipe(exporter, FloralBlocks.LIME_CHIMNEY_BELLFLOWER.get().asItem(), Items.LIME_DYE, 2);
        offerFlowerToDyeRecipe(exporter, FloralBlocks.PURPLE_WOLFSBANE.get().asItem(), Items.PURPLE_DYE, 1);

        offerFlowerToDyeRecipe(exporter, FloralBlocks.ROCKY_SEDUM.get().asItem(), Items.ORANGE_DYE, 1);
        offerFlowerToDyeRecipe(exporter, FloralBlocks.STEM_LILY.get().asItem(), Items.GREEN_DYE, 1);
        offerFlowerToDyeRecipe(exporter, FloralBlocks.BONES_BANE.get().asItem(), Items.PURPLE_DYE, 1);
        offerFlowerToDyeRecipe(exporter, FloralBlocks.TWISTING_ROOTS.get().asItem(), Items.CYAN_DYE, 1);
        offerFlowerToDyeRecipe(exporter, FloralBlocks.WEEPING_ROOTS.get().asItem(), Items.RED_DYE, 1);
        offerFlowerToDyeRecipe(exporter, FloralBlocks.WARDEN_PRIMROSE.get().asItem(), Items.BLACK_DYE, 1);
        offerFlowerToDyeRecipe(exporter, FloralBlocks.CHORUS_TULIP.get().asItem(), Items.PURPLE_DYE, 1);
        offerFlowerToDyeRecipe(exporter, FloralBlocks.WHITE_OVERFLOWING_BELLFLOWER.get().asItem(), Items.WHITE_DYE, 1);

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, FloralBlocks.FLORAL_STONE_BRICKS.get(), FloralBlocks.FLORAL_STONE.get());
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, FloralBlocks.FLORAL_STONE_STAIRS.get(), FloralBlocks.FLORAL_STONE.get());
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, FloralBlocks.FLORAL_STONE_SLAB.get(), FloralBlocks.FLORAL_STONE.get(), 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, FloralBlocks.FLORAL_STONE_WALL.get(), FloralBlocks.FLORAL_STONE.get());
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, FloralBlocks.FLORAL_STONE_BRICK_STAIRS.get(), FloralBlocks.FLORAL_STONE.get());
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, FloralBlocks.FLORAL_STONE_BRICK_SLAB.get(), FloralBlocks.FLORAL_STONE.get(), 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, FloralBlocks.FLORAL_STONE_BRICK_WALL.get(), FloralBlocks.FLORAL_STONE.get());
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, FloralBlocks.FLORAL_STONE.get(), FloralBlocks.FLORAL_STONE_BRICKS.get());
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, FloralBlocks.FLORAL_STONE_BRICK_STAIRS.get(), FloralBlocks.FLORAL_STONE_BRICKS.get());
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, FloralBlocks.FLORAL_STONE_BRICK_SLAB.get(), FloralBlocks.FLORAL_STONE_BRICKS.get(), 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, FloralBlocks.FLORAL_STONE_BRICK_WALL.get(), FloralBlocks.FLORAL_STONE_BRICKS.get());
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, FloralBlocks.COBBLED_FLORAL_STONE_STAIRS.get(), FloralBlocks.COBBLED_FLORAL_STONE.get());
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, FloralBlocks.COBBLED_FLORAL_STONE_SLAB.get(), FloralBlocks.COBBLED_FLORAL_STONE.get(), 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, FloralBlocks.COBBLED_FLORAL_STONE_WALL.get(), FloralBlocks.COBBLED_FLORAL_STONE.get());

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, FloralBlocks.FLORAL_STONE_SLAB.get(), Ingredient.of(FloralBlocks.FLORAL_STONE.get()))
                .unlockedBy(getHasName(FloralBlocks.FLORAL_STONE.get()), has(FloralBlocks.FLORAL_STONE.get()))
                .save(exporter);
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, FloralBlocks.FLORAL_STONE_BRICK_SLAB.get(), Ingredient.of(FloralBlocks.FLORAL_STONE_BRICKS.get()))
                .unlockedBy(getHasName(FloralBlocks.FLORAL_STONE_BRICKS.get()), has(FloralBlocks.FLORAL_STONE_BRICKS.get()))
                .save(exporter);
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, FloralBlocks.COBBLED_FLORAL_STONE_SLAB.get(), Ingredient.of(FloralBlocks.COBBLED_FLORAL_STONE.get()))
                .unlockedBy(getHasName(FloralBlocks.COBBLED_FLORAL_STONE.get()), has(FloralBlocks.COBBLED_FLORAL_STONE.get()))
                .save(exporter);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, FloralBlocks.FLORAL_STONE_STAIRS.get(), Ingredient.of(FloralBlocks.FLORAL_STONE.get()))
                .unlockedBy(getHasName(FloralBlocks.FLORAL_STONE.get()), has(FloralBlocks.FLORAL_STONE.get()))
                .save(exporter);
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, FloralBlocks.FLORAL_STONE_BRICK_STAIRS.get(), Ingredient.of(FloralBlocks.FLORAL_STONE_BRICKS.get()))
                .unlockedBy(getHasName(FloralBlocks.FLORAL_STONE_BRICKS.get()), has(FloralBlocks.FLORAL_STONE_BRICKS.get()))
                .save(exporter);
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, FloralBlocks.COBBLED_FLORAL_STONE_STAIRS.get(), Ingredient.of(FloralBlocks.COBBLED_FLORAL_STONE.get()))
                .unlockedBy(getHasName(FloralBlocks.COBBLED_FLORAL_STONE.get()), has(FloralBlocks.COBBLED_FLORAL_STONE.get()))
                .save(exporter);

        wall(exporter, RecipeCategory.BUILDING_BLOCKS, FloralBlocks.FLORAL_STONE_WALL.get(), FloralBlocks.FLORAL_STONE.get());
        wall(exporter, RecipeCategory.BUILDING_BLOCKS, FloralBlocks.FLORAL_STONE_BRICK_WALL.get(), FloralBlocks.FLORAL_STONE_BRICKS.get());
        wall(exporter, RecipeCategory.BUILDING_BLOCKS, FloralBlocks.COBBLED_FLORAL_STONE_WALL.get(), FloralBlocks.COBBLED_FLORAL_STONE.get());

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(FloralBlocks.COBBLED_FLORAL_STONE.get()), RecipeCategory.BUILDING_BLOCKS,
                FloralBlocks.FLORAL_STONE.get(), 0.1f, 200)
                .unlockedBy(getHasName(FloralBlocks.COBBLED_FLORAL_STONE.get()), has(FloralBlocks.COBBLED_FLORAL_STONE.get()))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, FloralBlocks.FLORAL_STONE_BRICKS.get(), 4)
                .pattern("SS")
                .pattern("SS")
                .define('S', FloralBlocks.FLORAL_STONE.get())
                .unlockedBy(getHasName(FloralBlocks.FLORAL_STONE.get()), has(FloralBlocks.FLORAL_STONE.get()))
                .save(exporter);

        woodFromLogs(exporter, FloralBlocks.STEM_WOOD.get(), FloralBlocks.STEM_LOG.get());

        woodFromLogs(exporter, FloralBlocks.STRIPPED_STEM_WOOD.get(), FloralBlocks.STRIPPED_STEM_LOG.get());

        planksFromLog(exporter, FloralBlocks.STEM_PLANKS.get(), ModTags.Items.STEM_LOGS, 4);

        stairBuilder(FloralBlocks.STEM_STAIRS.get(), Ingredient.of(FloralBlocks.STEM_PLANKS.get()))
                .unlockedBy(getHasName(FloralBlocks.STEM_PLANKS.get()), has(FloralBlocks.STEM_PLANKS.get()))
                .save(exporter);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, FloralBlocks.STEM_SLAB.get(), Ingredient.of(FloralBlocks.STEM_PLANKS.get()))
                .unlockedBy(getHasName(FloralBlocks.STEM_PLANKS.get()), has(FloralBlocks.STEM_PLANKS.get()))
                .save(exporter);

        fenceBuilder(FloralBlocks.STEM_FENCE.get(), Ingredient.of(FloralBlocks.STEM_PLANKS.get()))
                .unlockedBy(getHasName(FloralBlocks.STEM_PLANKS.get()), has(FloralBlocks.STEM_PLANKS.get()))
                .save(exporter);

        fenceGateBuilder(FloralBlocks.STEM_FENCE_GATE.get(), Ingredient.of(FloralBlocks.STEM_PLANKS.get()))
                .unlockedBy(getHasName(FloralBlocks.STEM_PLANKS.get()), has(FloralBlocks.STEM_PLANKS.get()))
                .save(exporter);

        doorBuilder(FloralBlocks.STEM_DOOR.get(), Ingredient.of(FloralBlocks.STEM_PLANKS.get()))
                .unlockedBy(getHasName(FloralBlocks.STEM_PLANKS.get()), has(FloralBlocks.STEM_PLANKS.get()))
                .save(exporter);

        trapdoorBuilder(FloralBlocks.STEM_TRAPDOOR.get(), Ingredient.of(FloralBlocks.STEM_PLANKS.get()))
                .unlockedBy(getHasName(FloralBlocks.STEM_PLANKS.get()), has(FloralBlocks.STEM_PLANKS.get()))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, FloralBlocks.ROCKY_SEDUM.get())
                .pattern("FCF")
                .pattern("DBD")
                .pattern("FCF")
                .define('F', Blocks.COBBLESTONE)
                .define('B', FloralItems.FLOWER_BLEND.get())
                .define('D', FloralItems.BROWN_PETAL.get())
                .define('C', FloralItems.ORANGE_PETAL.get())
                .unlockedBy(getHasName(FloralItems.FLOWER_BLEND.get()), has(FloralItems.FLOWER_BLEND.get()))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, FloralBlocks.STEM_LILY.get())
                .pattern("FCF")
                .pattern("DBD")
                .pattern("FCF")
                .define('F', ItemTags.LOGS)
                .define('B', FloralItems.FLOWER_BLEND.get())
                .define('D', FloralItems.GREEN_PETAL.get())
                .define('C', FloralItems.LIME_PETAL.get())
                .unlockedBy(getHasName(FloralItems.FLOWER_BLEND.get()), has(FloralItems.FLOWER_BLEND.get()))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, FloralBlocks.WEEPING_ROOTS.get())
                .pattern("FCF")
                .pattern("DND")
                .pattern("FCF")
                .define('F', Blocks.NETHER_WART_BLOCK)
                .define('N', Blocks.SOUL_SOIL)
                .define('D', FloralItems.RED_PETAL.get())
                .define('C', FloralItems.BROWN_PETAL.get())
                .unlockedBy(getHasName(Blocks.NETHER_WART_BLOCK), has(Blocks.NETHER_WART_BLOCK))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, FloralBlocks.TWISTING_ROOTS.get())
                .pattern("FCF")
                .pattern("DND")
                .pattern("FCF")
                .define('F', Blocks.WARPED_WART_BLOCK)
                .define('N', FloralBlocks.WEEPING_ROOTS.get())
                .define('D', FloralItems.CYAN_PETAL.get())
                .define('C', FloralItems.BLUE_PETAL.get())
                .unlockedBy(getHasName(Blocks.WARPED_WART_BLOCK), has(Blocks.WARPED_WART_BLOCK))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, FloralBlocks.BONES_BANE.get())
                .pattern("FCF")
                .pattern("DWD")
                .pattern("FCF")
                .define('F', FloralItems.WITHERED_PETAL.get())
                .define('W', FloralBlocks.PURPLE_WOLFSBANE.get())
                .define('D', FloralItems.PURPLE_PETAL.get())
                .define('C', FloralItems.WHITE_PETAL.get())
                .unlockedBy(getHasName(FloralBlocks.PURPLE_WOLFSBANE.get()), has(FloralBlocks.PURPLE_WOLFSBANE.get()))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, FloralBlocks.WARDEN_PRIMROSE.get())
                .pattern("FCF")
                .pattern("DWD")
                .pattern("BCB")
                .define('F', Blocks.SCULK_SHRIEKER)
                .define('B', Blocks.SCULK)
                .define('W', Blocks.SCULK_CATALYST)
                .define('D', Items.ECHO_SHARD)
                .define('C', FloralItems.BLACK_PETAL.get())
                .unlockedBy(getHasName(Blocks.SCULK_CATALYST), has(Blocks.SCULK_CATALYST))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, FloralBlocks.CHORUS_TULIP.get())
                .pattern("FCF")
                .pattern("DWD")
                .pattern("BCB")
                .define('F', Items.CHORUS_FRUIT)
                .define('B', Blocks.END_STONE)
                .define('W', Blocks.CHORUS_FLOWER)
                .define('D', FloralItems.PURPLE_PETAL.get())
                .define('C', FloralItems.LIGHT_GRAY_PETAL.get())
                .unlockedBy(getHasName(Blocks.CHORUS_FLOWER), has(Blocks.CHORUS_FLOWER))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, FloralBlocks.WHITE_OVERFLOWING_BELLFLOWER.get())
                .pattern("FCF")
                .pattern("DWD")
                .pattern("FCF")
                .define('F', Blocks.BONE_BLOCK)
                .define('W', Blocks.SKELETON_SKULL)
                .define('D', FloralItems.WHITE_PETAL.get())
                .define('C', FloralItems.WHITE_PETAL.get())
                .unlockedBy(getHasName(Blocks.SKELETON_SKULL), has(Blocks.SKELETON_SKULL))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, FloralPlantHeadBlocks.THICK_VINES.get())
                .pattern("   ")
                .pattern("GVG")
                .pattern(" G ")
                .define('G', FloralItems.GREEN_PETAL.get())
                .define('V', Blocks.VINE)
                .unlockedBy(getHasName(Blocks.VINE), has(Blocks.VINE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, FloralPlantHeadBlocks.THICK_STALK.get())
                .pattern(" G ")
                .pattern("GVG")
                .pattern("   ")
                .define('G', FloralItems.GREEN_PETAL.get())
                .define('V', Blocks.VINE)
                .unlockedBy(getHasName(Blocks.VINE), has(Blocks.VINE))
                .save(exporter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, FloralPlantHeadBlocks.PINK_ALCEA.get())
                .pattern("   ")
                .pattern("PVP")
                .pattern("   ")
                .define('P', FloralItems.PINK_PETAL.get())
                .define('V', FloralPlantHeadBlocks.THICK_STALK.get())
                .unlockedBy(getHasName(FloralPlantHeadBlocks.THICK_STALK.get()), has(FloralPlantHeadBlocks.THICK_STALK.get()))
                .unlockedBy(getHasName(FloralItems.PINK_PETAL.get()), has(FloralItems.PINK_PETAL.get()))
                .save(exporter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, FloralBlocks.BLUE_AUBRIETAS.get())
                .pattern(" B ")
                .pattern("BCB")
                .pattern(" B ")
                .define('B', FloralItems.BLUE_PETAL.get())
                .define('C', Blocks.PINK_PETALS)
                .unlockedBy(getHasName(Blocks.PINK_PETALS), has(Blocks.PINK_PETALS))
                .unlockedBy(getHasName(FloralItems.BLUE_PETAL.get()), has(FloralItems.BLUE_PETAL.get()))
                .save(exporter);
    }

}
