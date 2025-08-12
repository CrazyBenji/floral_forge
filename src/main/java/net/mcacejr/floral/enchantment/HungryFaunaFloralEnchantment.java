package net.mcacejr.floral.enchantment;

import net.mcacejr.floral.item.custom.CorpseBlossomSword;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;

public class HungryFaunaFloralEnchantment extends Enchantment {
    public HungryFaunaFloralEnchantment() {
        super(Rarity.UNCOMMON, FloralEnchantments.CORPSE_BLOSSOM_CATEGORY, new EquipmentSlot[] {EquipmentSlot.MAINHAND, EquipmentSlot.OFFHAND});
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }

    @Override
    public boolean canEnchant(ItemStack stack) {
        return stack.getItem() instanceof CorpseBlossomSword;
    }

}
