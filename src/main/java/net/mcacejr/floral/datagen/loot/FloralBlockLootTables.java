package net.mcacejr.floral.datagen.loot;

import net.mcacejr.floral.block.FloralBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoublePlantBlock;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class FloralBlockLootTables extends BlockLootSubProvider {
    public FloralBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(FloralBlocks.BLACK_PETUNIA.get());
        this.dropPottedContents(FloralBlocks.POTTED_BLACK_PETUNIA.get());

        this.dropSelf(FloralBlocks.RED_PETUNIA.get());
        this.dropPottedContents(FloralBlocks.POTTED_RED_PETUNIA.get());

        this.dropSelf(FloralBlocks.PURPLE_BELLFLOWER.get());
        this.dropPottedContents(FloralBlocks.POTTED_PURPLE_BELLFLOWER.get());

        this.dropSelf(FloralBlocks.GREEN_CONEFLOWER.get());
        this.dropPottedContents(FloralBlocks.POTTED_GREEN_CONEFLOWER.get());

        this.add(FloralBlocks.PURPLE_CHIMNEY_BELLFLOWER.get(), block -> this.createSinglePropConditionTable(block, DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));

        this.dropSelf(FloralBlocks.BLUE_AUBRIETAS.get());

        this.addNetherVinesDropTable(FloralBlocks.THICK_STALK.get(), FloralBlocks.THICK_STALK_PLANT.get());
        this.addNetherVinesDropTable(FloralBlocks.THICK_VINES.get(), FloralBlocks.THICK_VINES_PLANT.get());
        this.addNetherVinesDropTable(FloralBlocks.PINK_ALCEA.get(), FloralBlocks.PINK_ALCEA_PLANT.get());

        this.dropSelf(FloralBlocks.LIGHT_GRAY_TULIP.get());
        this.dropPottedContents(FloralBlocks.POTTED_LIGHT_GRAY_TULIP.get());
        this.dropSelf(FloralBlocks.GRAY_TULIP.get());
        this.dropPottedContents(FloralBlocks.POTTED_GRAY_TULIP.get());
        this.dropSelf(FloralBlocks.BLACK_TULIP.get());
        this.dropPottedContents(FloralBlocks.POTTED_BLACK_TULIP.get());
        this.dropSelf(FloralBlocks.BROWN_TULIP.get());
        this.dropPottedContents(FloralBlocks.POTTED_BROWN_TULIP.get());
        this.dropSelf(FloralBlocks.YELLOW_TULIP.get());
        this.dropPottedContents(FloralBlocks.POTTED_YELLOW_TULIP.get());
        this.dropSelf(FloralBlocks.LIME_TULIP.get());
        this.dropPottedContents(FloralBlocks.POTTED_LIME_TULIP.get());
        this.dropSelf(FloralBlocks.GREEN_TULIP.get());
        this.dropPottedContents(FloralBlocks.POTTED_GREEN_TULIP.get());
        this.dropSelf(FloralBlocks.CYAN_TULIP.get());
        this.dropPottedContents(FloralBlocks.POTTED_CYAN_TULIP.get());
        this.dropSelf(FloralBlocks.LIGHT_BLUE_TULIP.get());
        this.dropPottedContents(FloralBlocks.POTTED_LIGHT_BLUE_TULIP.get());
        this.dropSelf(FloralBlocks.BLUE_TULIP.get());
        this.dropPottedContents(FloralBlocks.POTTED_BLUE_TULIP.get());
        this.dropSelf(FloralBlocks.PURPLE_TULIP.get());
        this.dropPottedContents(FloralBlocks.POTTED_PURPLE_TULIP.get());
        this.dropSelf(FloralBlocks.MAGENTA_TULIP.get());
        this.dropPottedContents(FloralBlocks.POTTED_MAGENTA_TULIP.get());
        this.dropSelf(FloralBlocks.MAGENTA_CABARET.get());
        this.dropPottedContents(FloralBlocks.POTTED_MAGENTA_CABARET.get());

        this.dropSelf(FloralBlocks.GREEN_DAHLIA.get());
        this.dropPottedContents(FloralBlocks.POTTED_GREEN_DAHLIA.get());
        this.dropSelf(FloralBlocks.MAGENTA_TULIP.get());
        this.dropPottedContents(FloralBlocks.POTTED_MAGENTA_TULIP.get());
        this.dropSelf(FloralBlocks.LIME_BELLFLOWER.get());
        this.dropPottedContents(FloralBlocks.POTTED_LIME_BELLFLOWER.get());
        this.dropSelf(FloralBlocks.PURPLE_WOLFSBANE.get());
        this.dropPottedContents(FloralBlocks.POTTED_PURPLE_WOLFSBANE.get());
        this.dropSelf(FloralBlocks.BONES_BANE.get());

        this.add(FloralBlocks.LIME_CHIMNEY_BELLFLOWER.get(), block -> this.createSinglePropConditionTable(block, DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));

        this.dropSelf(FloralBlocks.WEEPING_ROOTS.get());
        this.dropSelf(FloralBlocks.TWISTING_ROOTS.get());
        this.dropSelf(FloralBlocks.WARDEN_PRIMROSE.get());
        this.dropSelf(FloralBlocks.ROCKY_SEDUM.get());
        this.dropSelf(FloralBlocks.STEM_LILY.get());
        this.dropSelf(FloralBlocks.CHORUS_TULIP.get());
        this.dropSelf(FloralBlocks.WHITE_OVERFLOWING_BELLFLOWER.get());

        this.dropSelf(FloralBlocks.FLORAL_STONE.get());
        this.dropSelf(FloralBlocks.FLORAL_STONE_STAIRS.get());
        this.add(FloralBlocks.FLORAL_STONE_SLAB.get(), createSlabItemTable(FloralBlocks.FLORAL_STONE_SLAB.get()));
        this.dropSelf(FloralBlocks.FLORAL_STONE_WALL.get());
        this.dropSelf(FloralBlocks.FLORAL_STONE_BRICKS.get());
        this.dropSelf(FloralBlocks.FLORAL_STONE_BRICK_STAIRS.get());
        this.add(FloralBlocks.FLORAL_STONE_BRICK_SLAB.get(), createSlabItemTable(FloralBlocks.FLORAL_STONE_BRICK_SLAB.get()));
        this.dropSelf(FloralBlocks.FLORAL_STONE_BRICK_WALL.get());
        this.dropSelf(FloralBlocks.COBBLED_FLORAL_STONE.get());
        this.dropSelf(FloralBlocks.COBBLED_FLORAL_STONE_STAIRS.get());
        this.add(FloralBlocks.COBBLED_FLORAL_STONE_SLAB.get(), createSlabItemTable(FloralBlocks.COBBLED_FLORAL_STONE_SLAB.get()));
        this.dropSelf(FloralBlocks.COBBLED_FLORAL_STONE_WALL.get());

        this.dropSelf(FloralBlocks.STEM_LOG.get());
        this.dropSelf(FloralBlocks.STEM_WOOD.get());
        this.dropSelf(FloralBlocks.STRIPPED_STEM_LOG.get());
        this.dropSelf(FloralBlocks.STRIPPED_STEM_WOOD.get());
        this.dropSelf(FloralBlocks.STEM_PLANKS.get());
        this.dropSelf(FloralBlocks.STEM_STAIRS.get());
        this.add(FloralBlocks.STEM_SLAB.get(), createSlabItemTable(FloralBlocks.STEM_SLAB.get()));
        this.dropSelf(FloralBlocks.STEM_FENCE.get());
        this.dropSelf(FloralBlocks.STEM_FENCE_GATE.get());
        this.dropSelf(FloralBlocks.STEM_BUTTON.get());
        this.dropSelf(FloralBlocks.STEM_PRESSURE_PLATE.get());
        this.dropSelf(FloralBlocks.STEM_TRAPDOOR.get());
        this.add(FloralBlocks.STEM_DOOR.get(), createDoorTable(FloralBlocks.STEM_DOOR.get()));
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return FloralBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}