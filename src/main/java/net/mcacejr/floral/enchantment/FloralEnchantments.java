package net.mcacejr.floral.enchantment;


import net.mcacejr.floral.FloralForge;
import net.mcacejr.floral.item.custom.CorpseBlossomSword;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FloralEnchantments {
    public static final DeferredRegister<Enchantment> ENCHANTMENTS = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, FloralForge.MOD_ID);

    public static final RegistryObject<Enchantment> IVY_ROOTS = ENCHANTMENTS.register("ivy_roots", IvyRootsFloralEnchantment::new);
    public static final RegistryObject<Enchantment> HUNGRY_FAUNA = ENCHANTMENTS.register("hungry_fauna", HungryFaunaFloralEnchantment::new);
    public static final RegistryObject<Enchantment> WITHERING_TOUCH = ENCHANTMENTS.register("withering_touch", WitheringTouchFloralEnchantment::new);

    public static final EnchantmentCategory CORPSE_BLOSSOM_CATEGORY = EnchantmentCategory.create("corpse_blossom", item -> item instanceof CorpseBlossomSword);

    public static void registerFloralEnchantments(IEventBus modEventBus) {
        FloralForge.LOGGER.info("Registering enchantments for" + FloralForge.MOD_ID);
        ENCHANTMENTS.register(modEventBus);
    }

}
