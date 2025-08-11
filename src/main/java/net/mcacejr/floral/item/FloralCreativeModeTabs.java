package net.mcacejr.floral.item;

import net.mcacejr.floral.FloralForge;
import net.mcacejr.floral.block.FloralBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class FloralCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FloralForge.MOD_ID);

    public static final RegistryObject<CreativeModeTab> FLORAL_TAB = CREATIVE_MODE_TABS.register("floral_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(FloralItems.FLORAL_CROWN.get()))
            .title(Component.translatable("itemgroup.floral_tab"))
                    .displayItems((displayContext, entries) -> {

                        entries.accept(FloralItems.FLORAL_CROWN.get());

                        entries.accept(FloralBlocks.BLACK_PETUNIA.get());
                        entries.accept(FloralBlocks.RED_PETUNIA.get());
                        entries.accept(FloralBlocks.PURPLE_BELLFLOWER.get());
                        entries.accept(FloralBlocks.PURPLE_CHIMNEY_BELLFLOWER.get());
                        entries.accept(FloralBlocks.GREEN_CONEFLOWER.get());
                        entries.accept(FloralBlocks.BLUE_AUBRIETAS.get());

                        entries.accept(FloralBlocks.LIGHT_GRAY_TULIP.get());
                        entries.accept(FloralBlocks.GRAY_TULIP.get());
                        entries.accept(FloralBlocks.BLACK_TULIP.get());
                        entries.accept(FloralBlocks.BROWN_TULIP.get());
                        entries.accept(FloralBlocks.YELLOW_TULIP.get());
                        entries.accept(FloralBlocks.LIME_TULIP.get());
                        entries.accept(FloralBlocks.GREEN_TULIP.get());
                        entries.accept(FloralBlocks.CYAN_TULIP.get());
                        entries.accept(FloralBlocks.LIGHT_BLUE_TULIP.get());
                        entries.accept(FloralBlocks.BLUE_TULIP.get());
                        entries.accept(FloralBlocks.PURPLE_TULIP.get());
                        entries.accept(FloralBlocks.MAGENTA_TULIP.get());

                        entries.accept(FloralBlocks.GREEN_DAHLIA.get());
                        entries.accept(FloralBlocks.MAGENTA_CABARET.get());
                        entries.accept(FloralBlocks.LIME_BELLFLOWER.get());
                        entries.accept(FloralBlocks.LIME_CHIMNEY_BELLFLOWER.get());
                        entries.accept(FloralBlocks.PURPLE_WOLFSBANE.get());

                        entries.accept(FloralBlocks.THICK_STALK.get());
                        entries.accept(FloralBlocks.THICK_VINES.get());
                        entries.accept(FloralBlocks.PINK_ALCEA.get());

                        entries.accept(FloralItems.FLOWER_BLEND.get());

                        entries.accept(FloralItems.PETUNIA_LANCE.get());
                        entries.accept(FloralItems.CORPSE_BLOSSOM.get());
                        entries.accept(FloralItems.FLOWER_TRIMMER.get());
                        entries.accept(FloralItems.DEADHEADER.get());
                        entries.accept(FloralItems.FLORAL_BANE.get());

                        entries.accept(FloralItems.WHITE_PETAL.get());
                        entries.accept(FloralItems.LIGHT_GRAY_PETAL.get());
                        entries.accept(FloralItems.GRAY_PETAL.get());
                        entries.accept(FloralItems.BLACK_PETAL.get());
                        entries.accept(FloralItems.RED_PETAL.get());
                        entries.accept(FloralItems.ORANGE_PETAL.get());
                        entries.accept(FloralItems.BROWN_PETAL.get());
                        entries.accept(FloralItems.YELLOW_PETAL.get());
                        entries.accept(FloralItems.LIME_PETAL.get());
                        entries.accept(FloralItems.GREEN_PETAL.get());
                        entries.accept(FloralItems.CYAN_PETAL.get());
                        entries.accept(FloralItems.LIGHT_BLUE_PETAL.get());
                        entries.accept(FloralItems.BLUE_PETAL.get());
                        entries.accept(FloralItems.PURPLE_PETAL.get());
                        entries.accept(FloralItems.MAGENTA_PETAL.get());
                        entries.accept(FloralItems.PINK_PETAL.get());
                        entries.accept(FloralItems.WITHERED_PETAL.get());
                        entries.accept(FloralItems.BONES_BANE_PETAL.get());

                        entries.accept(FloralBlocks.WEEPING_ROOTS.get());
                        entries.accept(FloralBlocks.TWISTING_ROOTS.get());
                        entries.accept(FloralBlocks.WARDEN_PRIMROSE.get());
                        entries.accept(FloralBlocks.ROCKY_SEDUM.get());
                        entries.accept(FloralBlocks.STEM_LILY.get());
                        entries.accept(FloralBlocks.BONES_BANE.get());
                        entries.accept(FloralBlocks.CHORUS_TULIP.get());
                        entries.accept(FloralBlocks.WHITE_OVERFLOWING_BELLFLOWER.get());

                        entries.accept(FloralItems.TWISTED_WART.get());

                        entries.accept(FloralBlocks.FLORAL_STONE.get());
                        entries.accept(FloralBlocks.FLORAL_STONE_STAIRS.get());
                        entries.accept(FloralBlocks.FLORAL_STONE_SLAB.get());
                        entries.accept(FloralBlocks.FLORAL_STONE_WALL.get());
                        entries.accept(FloralBlocks.FLORAL_STONE_BRICKS.get());
                        entries.accept(FloralBlocks.FLORAL_STONE_BRICK_STAIRS.get());
                        entries.accept(FloralBlocks.FLORAL_STONE_BRICK_SLAB.get());
                        entries.accept(FloralBlocks.FLORAL_STONE_BRICK_WALL.get());
                        entries.accept(FloralBlocks.COBBLED_FLORAL_STONE.get());
                        entries.accept(FloralBlocks.COBBLED_FLORAL_STONE_STAIRS.get());
                        entries.accept(FloralBlocks.COBBLED_FLORAL_STONE_SLAB.get());
                        entries.accept(FloralBlocks.COBBLED_FLORAL_STONE_WALL.get());

                        entries.accept(FloralBlocks.STEM_LOG.get());
                        entries.accept(FloralBlocks.STEM_WOOD.get());
                        entries.accept(FloralBlocks.STRIPPED_STEM_LOG.get());
                        entries.accept(FloralBlocks.STRIPPED_STEM_WOOD.get());
                        entries.accept(FloralBlocks.STEM_PLANKS.get());
                        entries.accept(FloralBlocks.STEM_STAIRS.get());
                        entries.accept(FloralBlocks.STEM_SLAB.get());
                        entries.accept(FloralBlocks.STEM_FENCE.get());
                        entries.accept(FloralBlocks.STEM_FENCE_GATE.get());
                        entries.accept(FloralBlocks.STEM_TRAPDOOR.get());
                        entries.accept(FloralBlocks.STEM_DOOR.get());
                        entries.accept(FloralBlocks.STEM_BUTTON.get());
                        entries.accept(FloralBlocks.STEM_PRESSURE_PLATE.get());

                    }).build());

    public static void registerFloralCreativeModeTabs(IEventBus modEventBus) {
        FloralForge.LOGGER.info("Registering Item Groups for "+ FloralForge.MOD_ID);
        CREATIVE_MODE_TABS.register(modEventBus);

    }


}
