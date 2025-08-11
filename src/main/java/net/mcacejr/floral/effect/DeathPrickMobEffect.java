package net.mcacejr.floral.effect;


import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import org.jetbrains.annotations.NotNull;

public class DeathPrickMobEffect extends MobEffect {

    int cooldown = -1;

    public DeathPrickMobEffect() {
        super(MobEffectCategory.HARMFUL,0x47542d);
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }

    @Override
    public void applyEffectTick(@NotNull LivingEntity entity, int amplifier) {

        if (cooldown < 0) {

            entity.hurt(entity.damageSources().magic(), 1 << amplifier);

            cooldown = 100;

        } else {

            cooldown--;

        }



    }

}
