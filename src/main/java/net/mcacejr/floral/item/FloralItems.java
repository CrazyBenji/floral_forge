package net.mcacejr.floral.item;

import net.mcacejr.floral.FloralForge;
import net.mcacejr.floral.item.custom.*;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class FloralItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FloralForge.MOD_ID);

    public static final RegistryObject<Item> FLORAL_CROWN = registerItem("floral_crown",
            () -> new ArmorWithEffect(FloralArmorMaterials.FLORAL, ArmorItem.Type.HELMET,
                    new Item.Properties(), FloralArmorMaterials.FLORAL_ARMOR_EFFECT));

    public static final RegistryObject<Item> PETUNIA_LANCE = registerItem("petunia_lance",
            () -> new SwordItem(FloralTiers.PETUNIA, 3, -1.8f, new Item.Properties()));

    public static final RegistryObject<Item> CORPSE_BLOSSOM = registerItem("corpse_blossom",
            () -> new CorpseBlossomSword(FloralTiers.PETUNIA, 2, -1.8f, new Item.Properties()));

    public static final RegistryObject<Item> FLOWER_BLEND = registerItem("flower_blend",
            () -> new FlowerBlendItem(new Item.Properties()));

    public static final RegistryObject<Item> FLOWER_TRIMMER = registerItem("flower_trimmer",
            () -> new CraftingSword(Tiers.IRON, 0, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> DEADHEADER = registerItem("deadheader",
            () -> new CraftingSword(FloralTiers.DEADHEADER, 7, -3.2f, new Item.Properties()));

    public static final RegistryObject<Item> FLORAL_BANE = registerItem("floral_bane",
            () -> new FloralBaneSword(FloralTiers.PETUNIA, 2, -2.0f, new Item.Properties()));

    public static final RegistryObject<Item> WHITE_PETAL = registerItem("white_petal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_GRAY_PETAL = registerItem("light_gray_petal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GRAY_PETAL = registerItem("gray_petal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLACK_PETAL = registerItem("black_petal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RED_PETAL = registerItem("red_petal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_PETAL = registerItem("orange_petal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BROWN_PETAL = registerItem("brown_petal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_PETAL = registerItem("yellow_petal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIME_PETAL = registerItem("lime_petal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GREEN_PETAL = registerItem("green_petal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CYAN_PETAL = registerItem("cyan_petal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_BLUE_PETAL = registerItem("light_blue_petal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLUE_PETAL = registerItem("blue_petal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_PETAL = registerItem("purple_petal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAGENTA_PETAL = registerItem("magenta_petal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PINK_PETAL = registerItem("pink_petal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WITHERED_PETAL = registerItem("withered_petal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BONES_BANE_PETAL = registerItem("bones_bane_petal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TWISTED_WART = registerItem("twisted_wart",
            () -> new Item(new Item.Properties()));

    public static <T extends Item> RegistryObject<Item> registerItem(String name, Supplier<T> item) {
        return ITEMS.register(name, item);
    }

    public static void registerFloralItems(IEventBus modEventBus) {
        FloralForge.LOGGER.info("Registering Mod Items" + FloralForge.MOD_ID);
        ITEMS.register(modEventBus);
    }

}
