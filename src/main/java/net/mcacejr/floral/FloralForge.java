package net.mcacejr.floral;

import net.mcacejr.floral.block.FloralBlocks;
import net.mcacejr.floral.enchantment.FloralEnchantments;
import net.mcacejr.floral.effect.FloralMobEffects;
import net.mcacejr.floral.item.FloralCreativeModeTabs;
import net.mcacejr.floral.item.FloralItems;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(FloralForge.MOD_ID)
public class FloralForge
{
    public static final String MOD_ID = "floral";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public FloralForge(FMLJavaModLoadingContext context)
    {
        IEventBus modEventBus = context.getModEventBus();

        FloralItems.registerFloralItems(modEventBus);
        FloralBlocks.registerFloralBlocks(modEventBus);
        FloralCreativeModeTabs.registerFloralCreativeModeTabs(modEventBus);
        FloralMobEffects.registerFloralMobEffects(modEventBus);
        FloralEnchantments.registerFloralEnchantments(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(FloralBlocks.BLACK_PETUNIA.getId(), FloralBlocks.POTTED_BLACK_PETUNIA);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(FloralBlocks.RED_PETUNIA.getId(), FloralBlocks.POTTED_RED_PETUNIA);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(FloralBlocks.PURPLE_BELLFLOWER.getId(), FloralBlocks.POTTED_PURPLE_BELLFLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(FloralBlocks.GREEN_CONEFLOWER.getId(), FloralBlocks.POTTED_GREEN_CONEFLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(FloralBlocks.LIGHT_GRAY_TULIP.getId(), FloralBlocks.POTTED_LIGHT_GRAY_TULIP);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(FloralBlocks.GRAY_TULIP.getId(), FloralBlocks.POTTED_GRAY_TULIP);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(FloralBlocks.BLACK_TULIP.getId(), FloralBlocks.POTTED_BLACK_TULIP);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(FloralBlocks.BROWN_TULIP.getId(), FloralBlocks.POTTED_BROWN_TULIP);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(FloralBlocks.YELLOW_TULIP.getId(), FloralBlocks.POTTED_YELLOW_TULIP);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(FloralBlocks.LIME_TULIP.getId(), FloralBlocks.POTTED_LIME_TULIP);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(FloralBlocks.GREEN_TULIP.getId(), FloralBlocks.POTTED_GREEN_TULIP);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(FloralBlocks.CYAN_TULIP.getId(), FloralBlocks.POTTED_CYAN_TULIP);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(FloralBlocks.LIGHT_BLUE_TULIP.getId(), FloralBlocks.POTTED_LIGHT_BLUE_TULIP);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(FloralBlocks.BLUE_TULIP.getId(), FloralBlocks.POTTED_BLUE_TULIP);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(FloralBlocks.PURPLE_TULIP.getId(), FloralBlocks.POTTED_PURPLE_TULIP);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(FloralBlocks.MAGENTA_TULIP.getId(), FloralBlocks.POTTED_MAGENTA_TULIP);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(FloralBlocks.GREEN_DAHLIA.getId(), FloralBlocks.POTTED_GREEN_DAHLIA);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(FloralBlocks.MAGENTA_CABARET.getId(), FloralBlocks.POTTED_MAGENTA_CABARET);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(FloralBlocks.LIME_BELLFLOWER.getId(), FloralBlocks.POTTED_LIME_BELLFLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(FloralBlocks.PURPLE_WOLFSBANE.getId(), FloralBlocks.POTTED_PURPLE_WOLFSBANE);
        });
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
