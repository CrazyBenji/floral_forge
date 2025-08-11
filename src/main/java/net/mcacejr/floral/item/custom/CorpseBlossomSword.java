package net.mcacejr.floral.item.custom;

import net.mcacejr.floral.enchantment.FloralEnchantments;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import org.jetbrains.annotations.NotNull;

public class CorpseBlossomSword extends SwordItem {

    @Override
    public boolean hurtEnemy(@NotNull ItemStack stack, @NotNull LivingEntity target, @NotNull LivingEntity attacker) {

        int hungerLevel = EnchantmentHelper.getTagEnchantmentLevel(FloralEnchantments.HUNGRY_FAUNA.get(), stack);
        if (hungerLevel > 0) {

            target.addEffect(new MobEffectInstance(MobEffects.HUNGER, 30 * 20, hungerLevel - 1));

        }

        int witherLevel = EnchantmentHelper.getTagEnchantmentLevel(FloralEnchantments.WITHERING_TOUCH.get(), stack);
        if (witherLevel > 0) {

            target.addEffect(new MobEffectInstance(MobEffects.WITHER, 30 * 20, witherLevel - 1));

        }

        int poisoningLevel = EnchantmentHelper.getTagEnchantmentLevel(FloralEnchantments.IVY_ROOTS.get(), stack);
        if (poisoningLevel > 0) {

            target.addEffect(new MobEffectInstance(MobEffects.POISON, 30 * 20, poisoningLevel - 1));

        }

        return super.hurtEnemy(stack, target, attacker);

    }

    public CorpseBlossomSword(Tier toolMaterial, int attackDamage, float attackSpeed, Properties settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }
}
