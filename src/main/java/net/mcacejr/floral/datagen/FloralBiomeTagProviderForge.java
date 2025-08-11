package net.mcacejr.floral.datagen;

import net.mcacejr.floral.FloralForge;
import net.mcacejr.floral.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.BiomeTagsProvider;
import net.minecraft.world.level.biome.Biomes;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class FloralBiomeTagProviderForge extends BiomeTagsProvider {
    public FloralBiomeTagProviderForge(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, FloralForge.MOD_ID    , existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        this.tag(ModTags.Biomes.BLACK_PETUNIA_BIOMES)
                .add(Biomes.DARK_FOREST);
        this.tag(ModTags.Biomes.RED_PETUNIA_BIOMES)
                .add(Biomes.PLAINS);
        this.tag(ModTags.Biomes.PETUNIA_BUNCH_BIOMES)
                .add(Biomes.DARK_FOREST);
        this.tag(ModTags.Biomes.PURPLE_BELLFLOWER_BIOMES)
                .add(Biomes.MEADOW)
                .add(Biomes.OLD_GROWTH_SPRUCE_TAIGA);
        this.tag(ModTags.Biomes.LIME_BELLFLOWER_BIOMES)
                .add(Biomes.MEADOW)
                .add(Biomes.FOREST);
        this.tag(ModTags.Biomes.PURPLE_CHIMNEY_BELLFLOWER_BIOMES)
                .add(Biomes.MEADOW);
        this.tag(ModTags.Biomes.LIME_CHIMNEY_BELLFLOWER_BIOMES)
                .add(Biomes.MEADOW);
        this.tag(ModTags.Biomes.BELLFLOWER_BUNCH_BIOMES)
                .add(Biomes.MEADOW);
        this.tag(ModTags.Biomes.GREEN_CONEFLOWER_BIOMES)
                .add(Biomes.SAVANNA_PLATEAU);
        this.tag(ModTags.Biomes.FULL_TULIP_BUNCH_BIOMES)
                .add(Biomes.FLOWER_FOREST)
                .add(Biomes.PLAINS);
        this.tag(ModTags.Biomes.COLORLESS_TULIP_BUNCH_BIOMES)
                .add(Biomes.MEADOW)
                .add(Biomes.SWAMP);
        this.tag(ModTags.Biomes.WARM_TULIP_BUNCH_BIOMES)
                .add(Biomes.SAVANNA)
                .add(Biomes.SAVANNA_PLATEAU)
                .add(Biomes.WINDSWEPT_SAVANNA);
        this.tag(ModTags.Biomes.COLD_TULIP_BUNCH_BIOMES)
                .add(Biomes.OLD_GROWTH_SPRUCE_TAIGA)
                .add(Biomes.OLD_GROWTH_PINE_TAIGA)
                .add(Biomes.TAIGA);
        this.tag(ModTags.Biomes.PURPLE_TULIP_BUNCH_BIOMES)
                .add(Biomes.MEADOW)
                .add(Biomes.FOREST);
        this.tag(ModTags.Biomes.LIME_TULIP_BUNCH_BIOMES)
                .add(Biomes.SWAMP)
                .add(Biomes.SPARSE_JUNGLE);
        this.tag(ModTags.Biomes.MAGENTA_CABARET_BIOMES)
                .add(Biomes.PLAINS)
                .add(Biomes.MEADOW)
                .add(Biomes.FLOWER_FOREST);
        this.tag(ModTags.Biomes.GREEN_DAHLIA_BIOMES)
                .add(Biomes.TAIGA)
                .add(Biomes.OLD_GROWTH_PINE_TAIGA)
                .add(Biomes.BIRCH_FOREST)
                .add(Biomes.OLD_GROWTH_BIRCH_FOREST);
        this.tag(ModTags.Biomes.PURPLE_WOLFSBANE_BIOMES)
                .add(Biomes.OLD_GROWTH_BIRCH_FOREST)
                .add(Biomes.DARK_FOREST)
                .add(Biomes.OLD_GROWTH_SPRUCE_TAIGA);
    }
}
