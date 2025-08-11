package net.mcacejr.floral.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class ArmorWithEffect extends ArmorItem {
    private final MobEffectInstance statusEffect;
    private int ticksUntilReapply;

    public ArmorWithEffect(ArmorMaterial material, Type type, Properties settings, MobEffectInstance statusEffect) {
        super(material, type, settings);
        this.statusEffect = statusEffect;
        this.ticksUntilReapply = 0;
    }

    @Override
    public void inventoryTick(@NotNull ItemStack stack, @NotNull Level world, @NotNull Entity entity, int slot, boolean selected) {
        if (this.ticksUntilReapply > 0) {
            this.ticksUntilReapply--;
        }
        else if (!world.isClientSide) {
            this.ticksUntilReapply = 201;
            if (entity instanceof Player player)  {
                if (isWearing(player)) {
                    player.addEffect(new MobEffectInstance(this.statusEffect));
                }
            }
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }

    private boolean isWearing(Player player) {
        for (int i = 0; i < 4; i++) {
            Item item = player.getInventory().getArmor(i).getItem();
            if (item instanceof ArmorItem armor) {
                if (armor.getMaterial() == this.material)
                    return true;
            }
        }
        return false;
    }
}