package net.mcacejr.floral.item.custom;

import net.mcacejr.floral.FloralForge;
import net.mcacejr.floral.effect.DeathPrickMobEffect;
import net.mcacejr.floral.effect.FloralMobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import org.jetbrains.annotations.NotNull;

public class FloralBaneSword extends SwordItem {

    public FloralBaneSword(Tier toolMaterial, int attackDamage, float attackSpeed, Properties settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, @NotNull LivingEntity target, @NotNull LivingEntity attacker) {
        target.addEffect(new MobEffectInstance(FloralMobEffects.DEATH_PRICK.get(), 20 * 60 * 60 * 24));
        return super.hurtEnemy(stack, target, attacker);
    }

}
