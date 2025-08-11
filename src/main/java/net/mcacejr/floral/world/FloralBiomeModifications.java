package net.mcacejr.floral.world;

import net.mcacejr.floral.FloralForge;
import net.mcacejr.floral.util.ModTags;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

public class FloralBiomeModifications {
    public static final ResourceKey<BiomeModifier> ADD_BLACK_PETUNIA = registerKey("add_black_petunia");
    public static final ResourceKey<BiomeModifier> ADD_RED_PETUNIA = registerKey("add_red_petunia");
    public static final ResourceKey<BiomeModifier> ADD_PETUNIA_BUNCH = registerKey("add_petunia_bunch");
    public static final ResourceKey<BiomeModifier> ADD_PURPLE_BELLFLOWER = registerKey("add_purple_bellflower");
    public static final ResourceKey<BiomeModifier> ADD_LIME_BELLFLOWER = registerKey("add_lime_bellflower");
    public static final ResourceKey<BiomeModifier> ADD_PURPLE_CHIMNEY_BELLFLOWER = registerKey("add_purple_chimney_bellflower");
    public static final ResourceKey<BiomeModifier> ADD_LIME_CHIMNEY_BELLFLOWER = registerKey("add_lime_chimney_bellflower");
    public static final ResourceKey<BiomeModifier> ADD_BELLFLOWER_BUNCH = registerKey("add_bellflower_bunch");
    public static final ResourceKey<BiomeModifier> ADD_GREEN_CONEFLOWER = registerKey("add_green_coneflower");
    public static final ResourceKey<BiomeModifier> ADD_FULL_TULIP_BUNCH = registerKey("add_full_tulip_bunch");
    public static final ResourceKey<BiomeModifier> ADD_COLORLESS_TULIP_BUNCH = registerKey("add_colorless_tulip_bunch");
    public static final ResourceKey<BiomeModifier> ADD_WARM_TULIP_BUNCH = registerKey("add_warm_tulip_bunch");
    public static final ResourceKey<BiomeModifier> ADD_COLD_TULIP_BUNCH = registerKey("add_cold_tulip_bunch");
    public static final ResourceKey<BiomeModifier> ADD_PURPLE_TULIP_BUNCH = registerKey("add_purple_tulip_bunch");
    public static final ResourceKey<BiomeModifier> ADD_LIME_TULIP_BUNCH = registerKey("add_lime_tulip_bunch");
    public static final ResourceKey<BiomeModifier> ADD_MAGENTA_CABARET = registerKey("add_magenta_cabaret");
    public static final ResourceKey<BiomeModifier> ADD_GREEN_DAHLIA = registerKey("add_green_dahlia");
    public static final ResourceKey<BiomeModifier> ADD_PURPLE_WOLFSBANE = registerKey("add_purple_wolfsbane");

    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(ADD_BLACK_PETUNIA, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.BLACK_PETUNIA_BIOMES),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.BLACK_PETUNIA_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_RED_PETUNIA, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.RED_PETUNIA_BIOMES),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.RED_PETUNIA_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_PETUNIA_BUNCH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.PETUNIA_BUNCH_BIOMES),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.PETUNIA_BUNCH_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_PURPLE_BELLFLOWER, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.PURPLE_BELLFLOWER_BIOMES),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.PURPLE_BELLFLOWER_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_LIME_BELLFLOWER, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.LIME_BELLFLOWER_BIOMES),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.LIME_BELLFLOWER_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_PURPLE_CHIMNEY_BELLFLOWER, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.PURPLE_CHIMNEY_BELLFLOWER_BIOMES),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.PURPLE_CHIMNEY_BELLFLOWER_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_LIME_CHIMNEY_BELLFLOWER, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.LIME_CHIMNEY_BELLFLOWER_BIOMES),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.LIME_CHIMNEY_BELLFLOWER_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_BELLFLOWER_BUNCH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.BELLFLOWER_BUNCH_BIOMES),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.BELLFLOWER_BUNCH_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_GREEN_CONEFLOWER, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.GREEN_CONEFLOWER_BIOMES),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.GREEN_CONEFLOWER_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_FULL_TULIP_BUNCH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.FULL_TULIP_BUNCH_BIOMES),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.FULL_TULIP_BUNCH_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_COLORLESS_TULIP_BUNCH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.COLORLESS_TULIP_BUNCH_BIOMES),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.COLORLESS_TULIP_BUNCH_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_WARM_TULIP_BUNCH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.WARM_TULIP_BUNCH_BIOMES),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.WARM_TULIP_BUNCH_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_COLD_TULIP_BUNCH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.COLD_TULIP_BUNCH_BIOMES),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.COLD_TULIP_BUNCH_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_PURPLE_TULIP_BUNCH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.PURPLE_TULIP_BUNCH_BIOMES),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.PURPLE_TULIP_BUNCH_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_LIME_TULIP_BUNCH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.LIME_TULIP_BUNCH_BIOMES),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.LIME_TULIP_BUNCH_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_MAGENTA_CABARET, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.MAGENTA_CABARET_BIOMES),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.MAGENTA_CABARET_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_GREEN_DAHLIA, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.GREEN_DAHLIA_BIOMES),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.GREEN_DAHLIA_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_PURPLE_WOLFSBANE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.PURPLE_WOLFSBANE_BIOMES),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.PURPLE_WOLFSBANE_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(FloralForge.MOD_ID, name));
    }
}
