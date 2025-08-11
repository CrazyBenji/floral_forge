package net.mcacejr.floral.world;


import net.mcacejr.floral.FloralForge;
import net.mcacejr.floral.block.FloralBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;

public class ModConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> BLACK_PETUNIA_KEY = registerKey("black_petunia");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RED_PETUNIA_KEY = registerKey("red_petunia");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PETUNIA_BUNCH_KEY = registerKey("petunia_bunch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PURPLE_BELLFLOWER_KEY = registerKey("purple_bellflower");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LIME_BELLFLOWER_KEY = registerKey("lime_bellflower");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PURPLE_CHIMNEY_BELLFLOWER_KEY = registerKey("purple_chimney_bellflower");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LIME_CHIMNEY_BELLFLOWER_KEY = registerKey("lime_chimney_bellflower");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BELLFLOWER_BUNCH_KEY = registerKey("bellflower_bunch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GREEN_CONEFLOWER_KEY = registerKey("green_coneflower");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FULL_TULIP_BUNCH_KEY = registerKey("full_tulip_bunch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> COLORLESS_TULIP_BUNCH_KEY = registerKey("colorless_tulip_bunch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WARM_TULIP_BUNCH_KEY = registerKey("warm_tulip_bunch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> COLD_TULIP_BUNCH_KEY = registerKey("cold_tulip_bunch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PURPLE_TULIP_BUNCH_KEY = registerKey("purple_tulip_bunch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LIME_TULIP_BUNCH_KEY = registerKey("lime_tulip_bunch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MAGENTA_CABARET_KEY = registerKey("magenta_cabaret");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GREEN_DAHLIA_KEY = registerKey("green_dahlia");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PURPLE_WOLFSBANE_KEY = registerKey("purple_wolfsbane");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {

        register(context,
                BLACK_PETUNIA_KEY,
                Feature.FLOWER,
                simpleRandomPatchConfiguration(
                        new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
                                .add(FloralBlocks.BLACK_PETUNIA.get().defaultBlockState(), 1)),
                        16
                )
        );

        register(context,
                RED_PETUNIA_KEY,
                Feature.FLOWER,
                simpleRandomPatchConfiguration(
                        new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
                                .add(FloralBlocks.RED_PETUNIA.get().defaultBlockState(), 1)),
                        16
                )
        );

        register(context,
                PETUNIA_BUNCH_KEY,
                Feature.FLOWER,
                simpleRandomPatchConfiguration(
                        new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
                                .add(FloralBlocks.RED_PETUNIA.get().defaultBlockState(), 1)
                                .add(FloralBlocks.BLACK_PETUNIA.get().defaultBlockState(), 2)),
                        16
                )
        );

        register(context,
                PURPLE_BELLFLOWER_KEY,
                Feature.FLOWER,
                simpleRandomPatchConfiguration(
                        new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
                                .add(FloralBlocks.PURPLE_BELLFLOWER.get().defaultBlockState(), 1)),
                        16
                )
        );

        register(context,
                LIME_BELLFLOWER_KEY,
                Feature.FLOWER,
                simpleRandomPatchConfiguration(
                        new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
                                .add(FloralBlocks.LIME_BELLFLOWER.get().defaultBlockState(), 1)),
                        16
                )
        );

        register(context,
                PURPLE_CHIMNEY_BELLFLOWER_KEY,
                Feature.FLOWER,
                simpleRandomPatchConfiguration(
                        new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
                                .add(FloralBlocks.PURPLE_CHIMNEY_BELLFLOWER.get().defaultBlockState(), 1)),
                        16
                )
        );

        register(context,
                LIME_CHIMNEY_BELLFLOWER_KEY,
                Feature.FLOWER,
                simpleRandomPatchConfiguration(
                        new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
                                .add(FloralBlocks.LIME_CHIMNEY_BELLFLOWER.get().defaultBlockState(), 1)),
                        16
                )
        );

        register(context,
                BELLFLOWER_BUNCH_KEY,
                Feature.FLOWER,
                simpleRandomPatchConfiguration(
                        new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
                                .add(FloralBlocks.LIME_BELLFLOWER.get().defaultBlockState(), 2)
                                .add(FloralBlocks.LIME_CHIMNEY_BELLFLOWER.get().defaultBlockState(), 1)
                                .add(FloralBlocks.PURPLE_BELLFLOWER.get().defaultBlockState(), 2)
                                .add(FloralBlocks.PURPLE_CHIMNEY_BELLFLOWER.get().defaultBlockState(), 1)),
                        32
                )
        );

        register(context,
                GREEN_CONEFLOWER_KEY,
                Feature.FLOWER,
                simpleRandomPatchConfiguration(
                        new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
                                .add(FloralBlocks.GREEN_CONEFLOWER.get().defaultBlockState(), 1)),
                        16
                )
        );

        register(context,
                FULL_TULIP_BUNCH_KEY,
                Feature.FLOWER,
                simpleRandomPatchConfiguration(
                        new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
                                .add(Blocks.WHITE_TULIP.defaultBlockState(), 1)
                                .add(FloralBlocks.LIGHT_GRAY_TULIP.get().defaultBlockState(), 1)
                                .add(FloralBlocks.GRAY_TULIP.get().defaultBlockState(), 1)
                                .add(FloralBlocks.BLACK_TULIP.get().defaultBlockState(), 1)
                                .add(Blocks.RED_TULIP.defaultBlockState(), 1)
                                .add(FloralBlocks.BROWN_TULIP.get().defaultBlockState(), 1)
                                .add(Blocks.ORANGE_TULIP.defaultBlockState(), 1)
                                .add(FloralBlocks.YELLOW_TULIP.get().defaultBlockState(), 1)
                                .add(FloralBlocks.LIME_TULIP.get().defaultBlockState(), 1)
                                .add(FloralBlocks.GREEN_TULIP.get().defaultBlockState(), 1)
                                .add(FloralBlocks.CYAN_TULIP.get().defaultBlockState(), 1)
                                .add(FloralBlocks.LIGHT_BLUE_TULIP.get().defaultBlockState(), 1)
                                .add(FloralBlocks.BLUE_TULIP.get().defaultBlockState(), 1)
                                .add(FloralBlocks.PURPLE_TULIP.get().defaultBlockState(), 1)
                                .add(FloralBlocks.MAGENTA_TULIP.get().defaultBlockState(), 1)
                                .add(Blocks.PINK_TULIP.defaultBlockState(), 1)),
                        36
                )
        );

        register(context,
                COLORLESS_TULIP_BUNCH_KEY,
                Feature.FLOWER,
                simpleRandomPatchConfiguration(
                        new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
                                .add(Blocks.WHITE_TULIP.defaultBlockState(), 1)
                                .add(FloralBlocks.LIGHT_GRAY_TULIP.get().defaultBlockState(), 1)
                                .add(FloralBlocks.GRAY_TULIP.get().defaultBlockState(), 1)
                                .add(FloralBlocks.BLACK_TULIP.get().defaultBlockState(), 1)),
                        32
                )
        );

        register(context,
                WARM_TULIP_BUNCH_KEY,
                Feature.FLOWER,
                simpleRandomPatchConfiguration(
                        new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
                                .add(Blocks.RED_TULIP.defaultBlockState(), 1)
                                .add(FloralBlocks.BROWN_TULIP.get().defaultBlockState(), 1)
                                .add(Blocks.ORANGE_TULIP.defaultBlockState(), 1)
                                .add(FloralBlocks.YELLOW_TULIP.get().defaultBlockState(), 1)),
                        32
                )
        );

        register(context,
                COLD_TULIP_BUNCH_KEY,
                Feature.FLOWER,
                simpleRandomPatchConfiguration(
                        new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
                                .add(FloralBlocks.BLUE_TULIP.get().defaultBlockState(), 1)
                                .add(FloralBlocks.LIGHT_BLUE_TULIP.get().defaultBlockState(), 1)
                                .add(FloralBlocks.CYAN_TULIP.get().defaultBlockState(), 1)),
                        24
                )
        );

        register(context,
                PURPLE_TULIP_BUNCH_KEY,
                Feature.FLOWER,
                simpleRandomPatchConfiguration(
                        new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
                                .add(FloralBlocks.PURPLE_TULIP.get().defaultBlockState(), 1)
                                .add(FloralBlocks.MAGENTA_TULIP.get().defaultBlockState(), 1)
                                .add(Blocks.PINK_TULIP.defaultBlockState(), 1)),
                        24
                )
        );

        register(context,
                LIME_TULIP_BUNCH_KEY,
                Feature.FLOWER,
                simpleRandomPatchConfiguration(
                        new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
                                .add(FloralBlocks.LIME_TULIP.get().defaultBlockState(), 1)
                                .add(FloralBlocks.GREEN_TULIP.get().defaultBlockState(), 1)),
                        20
                )
        );

        register(context,
                MAGENTA_CABARET_KEY,
                Feature.FLOWER,
                simpleRandomPatchConfiguration(
                        new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
                                .add(FloralBlocks.MAGENTA_CABARET.get().defaultBlockState(), 1)),
                        16
                )
        );

        register(context,
                GREEN_DAHLIA_KEY,
                Feature.FLOWER,
                simpleRandomPatchConfiguration(
                        new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
                                .add(FloralBlocks.GREEN_DAHLIA.get().defaultBlockState(), 1)),
                        16
                )
        );

        register(context,
                PURPLE_WOLFSBANE_KEY,
                Feature.FLOWER,
                simpleRandomPatchConfiguration(
                        new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
                                .add(FloralBlocks.PURPLE_WOLFSBANE.get().defaultBlockState(), 1)),
                        16
                )
        );

    }

    private static RandomPatchConfiguration simpleRandomPatchConfiguration(BlockStateProvider block, int tries) {
        return FeatureUtils.simpleRandomPatchConfiguration(tries, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(block)));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(FloralForge.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}
