package net.mcacejr.floral.item.custom;

import net.mcacejr.floral.enchantment.HungryFaunaFloralEnchantment;
import net.mcacejr.floral.enchantment.IvyRootsFloralEnchantment;
import net.mcacejr.floral.enchantment.WitheringTouchFloralEnchantment;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.enchantment.Enchantment;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class CorpseBlossomSword extends SwordItem {

    @Override
    public boolean hurtEnemy(@NotNull ItemStack stack, @NotNull LivingEntity target, @NotNull LivingEntity attacker) {

        Map<Enchantment, Integer> currentEnchantments = attacker.getMainHandItem().getAllEnchantments();

        for (Map.Entry<Enchantment, Integer> ench : currentEnchantments.entrySet()) {
            if (ench.getKey() instanceof HungryFaunaFloralEnchantment) {
                target.addEffect(new MobEffectInstance(MobEffects.HUNGER, 30 * 20, ench.getValue() - 1));
            }
            if (ench.getKey() instanceof WitheringTouchFloralEnchantment) {
                target.addEffect(new MobEffectInstance(MobEffects.WITHER, 30 * 20, ench.getValue() - 1));
            }
            if (ench.getKey() instanceof IvyRootsFloralEnchantment) {
                target.addEffect(new MobEffectInstance(MobEffects.POISON, 30 * 20, ench.getValue() - 1));
            }
        }

        return super.hurtEnemy(stack, target, attacker);

    }

    public CorpseBlossomSword(Tier toolMaterial, int attackDamage, float attackSpeed, Properties settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }
}
