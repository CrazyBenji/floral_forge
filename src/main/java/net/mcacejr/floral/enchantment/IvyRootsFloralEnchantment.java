package net.mcacejr.floral.enchantment;


import net.mcacejr.floral.item.custom.CorpseBlossomSword;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantments;
import org.jetbrains.annotations.NotNull;

public class IvyRootsFloralEnchantment extends Enchantment {

    public IvyRootsFloralEnchantment() {
        super(Rarity.UNCOMMON, EnchantmentCategory.WEAPON, new EquipmentSlot[] {EquipmentSlot.MAINHAND, EquipmentSlot.OFFHAND});
    }

    @Override
    public int getMaxLevel() {
        return 2;
    }

    @Override
    public boolean checkCompatibility(@NotNull Enchantment other) {
        return super.checkCompatibility(other) && other != FloralEnchantments.WITHERING_TOUCH.get() &&
                other!= Enchantments.SHARPNESS &&
                other != Enchantments.SMITE &&
                other != Enchantments.BANE_OF_ARTHROPODS;
    }

    @Override
    public boolean canEnchant(ItemStack stack) {
        return stack.getItem() instanceof CorpseBlossomSword;
    }

}
