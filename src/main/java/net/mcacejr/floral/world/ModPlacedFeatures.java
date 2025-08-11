package net.mcacejr.floral.world;

import net.mcacejr.floral.FloralForge;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModPlacedFeatures {

    public static final ResourceKey<PlacedFeature> BLACK_PETUNIA_PLACED_KEY = registerKey("black_petunia_placed");

    public static final ResourceKey<PlacedFeature> RED_PETUNIA_PLACED_KEY = registerKey("red_petunia_placed");

    public static final ResourceKey<PlacedFeature> PETUNIA_BUNCH_PLACED_KEY = registerKey("petunia_bunch_placed");

    public static final ResourceKey<PlacedFeature> PURPLE_BELLFLOWER_PLACED_KEY = registerKey("purple_bellflower_placed");

    public static final ResourceKey<PlacedFeature> LIME_BELLFLOWER_PLACED_KEY = registerKey("lime_bellflower_placed");

    public static final ResourceKey<PlacedFeature> PURPLE_CHIMNEY_BELLFLOWER_PLACED_KEY = registerKey("purple_chimney_bellflower_placed");

    public static final ResourceKey<PlacedFeature> LIME_CHIMNEY_BELLFLOWER_PLACED_KEY = registerKey("lime_chimney_bellflower_placed");

    public static final ResourceKey<PlacedFeature> BELLFLOWER_BUNCH_PLACED_KEY = registerKey("bellflower_bunch_placed");

    public static final ResourceKey<PlacedFeature> GREEN_CONEFLOWER_PLACED_KEY = registerKey("green_coneflower_placed");

    public static final ResourceKey<PlacedFeature> FULL_TULIP_BUNCH_PLACED_KEY = registerKey("full_tulip_bunch_placed");

    public static final ResourceKey<PlacedFeature> COLORLESS_TULIP_BUNCH_PLACED_KEY = registerKey("colorless_tulip_bunch_placed");

    public static final ResourceKey<PlacedFeature> WARM_TULIP_BUNCH_PLACED_KEY = registerKey("warm_tulip_bunch_placed");

    public static final ResourceKey<PlacedFeature> COLD_TULIP_BUNCH_PLACED_KEY = registerKey("cold_tulip_bunch_placed");

    public static final ResourceKey<PlacedFeature> PURPLE_TULIP_BUNCH_PLACED_KEY = registerKey("purple_tulip_bunch_placed");

    public static final ResourceKey<PlacedFeature> LIME_TULIP_BUNCH_PLACED_KEY = registerKey("lime_tulip_bunch_placed");

    public static final ResourceKey<PlacedFeature> MAGENTA_CABARET_PLACED_KEY = registerKey("magenta_cabaret_placed");

    public static final ResourceKey<PlacedFeature> GREEN_DAHLIA_PLACED_KEY = registerKey("green_dahlia_placed");

    public static final ResourceKey<PlacedFeature> PURPLE_WOLFSBANE_PLACED_KEY = registerKey("purple_wolfsbane_placed");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, BLACK_PETUNIA_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BLACK_PETUNIA_KEY),
                RarityFilter.onAverageOnceEvery(16),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP,
                BiomeFilter.biome()
        );

        register(context, RED_PETUNIA_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.RED_PETUNIA_KEY),
                RarityFilter.onAverageOnceEvery(16),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP,
                BiomeFilter.biome()
        );

        register(context, PETUNIA_BUNCH_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.PETUNIA_BUNCH_KEY),
                RarityFilter.onAverageOnceEvery(16),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP,
                BiomeFilter.biome()
        );

        register(context, PURPLE_BELLFLOWER_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.PURPLE_BELLFLOWER_KEY),
                RarityFilter.onAverageOnceEvery(16),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP,
                BiomeFilter.biome()
        );

        register(context, PURPLE_CHIMNEY_BELLFLOWER_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.PURPLE_CHIMNEY_BELLFLOWER_KEY),
                RarityFilter.onAverageOnceEvery(16),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP,
                BiomeFilter.biome()
        );

        register(context, LIME_BELLFLOWER_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.LIME_BELLFLOWER_KEY),
                RarityFilter.onAverageOnceEvery(16),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP,
                BiomeFilter.biome()
        );

        register(context, LIME_CHIMNEY_BELLFLOWER_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.LIME_CHIMNEY_BELLFLOWER_KEY),
                RarityFilter.onAverageOnceEvery(16),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP,
                BiomeFilter.biome()
        );

        register(context, BELLFLOWER_BUNCH_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BELLFLOWER_BUNCH_KEY),
                RarityFilter.onAverageOnceEvery(16),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP,
                BiomeFilter.biome()
        );

        register(context, GREEN_CONEFLOWER_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.GREEN_CONEFLOWER_KEY),
                RarityFilter.onAverageOnceEvery(16),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP,
                BiomeFilter.biome()
        );

        register(context, FULL_TULIP_BUNCH_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.FULL_TULIP_BUNCH_KEY),
                RarityFilter.onAverageOnceEvery(16),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP,
                BiomeFilter.biome()
        );

        register(context, COLORLESS_TULIP_BUNCH_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.COLORLESS_TULIP_BUNCH_KEY),
                RarityFilter.onAverageOnceEvery(16),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP,
                BiomeFilter.biome()
        );

        register(context, WARM_TULIP_BUNCH_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.WARM_TULIP_BUNCH_KEY),
                RarityFilter.onAverageOnceEvery(16),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP,
                BiomeFilter.biome()
        );

        register(context, COLD_TULIP_BUNCH_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.COLD_TULIP_BUNCH_KEY),
                RarityFilter.onAverageOnceEvery(16),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP,
                BiomeFilter.biome()
        );

        register(context, PURPLE_TULIP_BUNCH_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.PURPLE_TULIP_BUNCH_KEY),
                RarityFilter.onAverageOnceEvery(16),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP,
                BiomeFilter.biome()
        );

        register(context, LIME_TULIP_BUNCH_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.LIME_TULIP_BUNCH_KEY),
                RarityFilter.onAverageOnceEvery(16),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP,
                BiomeFilter.biome()
        );

        register(context, MAGENTA_CABARET_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.MAGENTA_CABARET_KEY),
                RarityFilter.onAverageOnceEvery(16),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP,
                BiomeFilter.biome()
        );

        register(context, GREEN_DAHLIA_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.GREEN_DAHLIA_KEY),
                RarityFilter.onAverageOnceEvery(16),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP,
                BiomeFilter.biome()
        );

        register(context, PURPLE_WOLFSBANE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.PURPLE_WOLFSBANE_KEY),
                RarityFilter.onAverageOnceEvery(16),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP,
                BiomeFilter.biome()
        );
    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(FloralForge.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 PlacementModifier... modifiers) {
        context.register(key, new PlacedFeature(configuration, List.of(modifiers)));
    }

}
