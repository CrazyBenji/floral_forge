package net.mcacejr.floral.effect;

import net.mcacejr.floral.FloralForge;
import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FloralMobEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, FloralForge.MOD_ID);

    public static final RegistryObject<MobEffect> DEATH_PRICK = MOB_EFFECTS.register("death_prick",
            DeathPrickMobEffect::new);

    public static void registerFloralMobEffects(IEventBus modEventBus) {
        MOB_EFFECTS.register(modEventBus);
    }

}
