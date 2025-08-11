package net.mcacejr.floral.util;

import net.mcacejr.floral.FloralForge;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;

public class ModTags {

    public static class Blocks {

        private static TagKey<Block> createTag(String name)
        {
            return TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(FloralForge.MOD_ID, name));
        }

    }

    public static class Items {
        public static final TagKey<Item> STEM_LOGS = createTag("stem_logs");

        public static final TagKey<Item> FLOWER_TRIMMERS = createTag("flower_trimmers");

        public static final TagKey<Item> PETALS = createTag("petals");

        public static final TagKey<Item> WHITE_FLOWERS = createTag("white_flowers");
        public static final TagKey<Item> LIGHT_GRAY_FLOWERS = createTag("light_gray_flowers");
        public static final TagKey<Item> GRAY_FLOWERS = createTag("gray_flowers");
        public static final TagKey<Item> BLACK_FLOWERS = createTag("black_flowers");
        public static final TagKey<Item> RED_FLOWERS = createTag("red_flowers");
        public static final TagKey<Item> ORANGE_FLOWERS = createTag("orange_flowers");
        public static final TagKey<Item> BROWN_FLOWERS = createTag("brown_flowers");
        public static final TagKey<Item> YELLOW_FLOWERS = createTag("yellow_flowers");
        public static final TagKey<Item> LIME_FLOWERS = createTag("lime_flowers");
        public static final TagKey<Item> GREEN_FLOWERS = createTag("green_flowers");
        public static final TagKey<Item> CYAN_FLOWERS = createTag("cyan_flowers");
        public static final TagKey<Item> LIGHT_BLUE_FLOWERS = createTag("light_blue_flowers");
        public static final TagKey<Item> BLUE_FLOWERS = createTag("blue_flowers");
        public static final TagKey<Item> PURPLE_FLOWERS = createTag("purple_flowers");
        public static final TagKey<Item> MAGENTA_FLOWERS = createTag("magenta_flowers");
        public static final TagKey<Item> PINK_FLOWERS = createTag("pink_flowers");

        public static final TagKey<Item> TALL_RED_FLOWERS = createTag("tall_red_flowers");
        public static final TagKey<Item> TALL_YELLOW_FLOWERS = createTag("tall_yellow_flowers");
        public static final TagKey<Item> TALL_LIME_FLOWERS = createTag("tall_lime_flowers");
        public static final TagKey<Item> TALL_PURPLE_FLOWERS = createTag("tall_purple_flowers");
        public static final TagKey<Item> TALL_MAGENTA_FLOWERS = createTag("tall_magenta_flowers");
        public static final TagKey<Item> TALL_PINK_FLOWERS = createTag("tall_pink_flowers");

        private static TagKey<Item> createTag(String name)
        {
            return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(FloralForge.MOD_ID, name));
        }
    }

    public static class Biomes {
        public static final TagKey<Biome> BLACK_PETUNIA_BIOMES = createTag("black_petunia_biomes");
        public static final TagKey<Biome> RED_PETUNIA_BIOMES = createTag("red_petunia_biomes");
        public static final TagKey<Biome> PETUNIA_BUNCH_BIOMES = createTag("petunia_bunch_biomes");
        public static final TagKey<Biome> PURPLE_BELLFLOWER_BIOMES = createTag("purple_bellflower_biomes");
        public static final TagKey<Biome> LIME_BELLFLOWER_BIOMES = createTag("lime_bellflower_biomes");
        public static final TagKey<Biome> PURPLE_CHIMNEY_BELLFLOWER_BIOMES = createTag("purple_chimney_bellflower_biomes");
        public static final TagKey<Biome> LIME_CHIMNEY_BELLFLOWER_BIOMES = createTag("lime_chimney_bellflower_biomes");
        public static final TagKey<Biome> BELLFLOWER_BUNCH_BIOMES = createTag("bellflower_bunch_biomes");
        public static final TagKey<Biome> GREEN_CONEFLOWER_BIOMES = createTag("green_coneflower_biomes");
        public static final TagKey<Biome> FULL_TULIP_BUNCH_BIOMES = createTag("full_tulip_bunch_biomes");
        public static final TagKey<Biome> COLORLESS_TULIP_BUNCH_BIOMES = createTag("colorless_tulip_bunch_biomes");
        public static final TagKey<Biome> WARM_TULIP_BUNCH_BIOMES = createTag("warm_tulip_bunch_biomes");
        public static final TagKey<Biome> COLD_TULIP_BUNCH_BIOMES = createTag("cold_tulip_bunch_biomes");
        public static final TagKey<Biome> PURPLE_TULIP_BUNCH_BIOMES = createTag("purple_tulip_bunch_biomes");
        public static final TagKey<Biome> LIME_TULIP_BUNCH_BIOMES = createTag("lime_tulip_bunch_biomes");
        public static final TagKey<Biome> MAGENTA_CABARET_BIOMES = createTag("magenta_cabaret_biomes");
        public static final TagKey<Biome> GREEN_DAHLIA_BIOMES = createTag("green_dahlia_biomes");
        public static final TagKey<Biome> PURPLE_WOLFSBANE_BIOMES = createTag("purple_wolfsbane_biomes");


        private static TagKey<Biome> createTag(String name)
        {
            return TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath(FloralForge.MOD_ID, name));
        }
    }

}
