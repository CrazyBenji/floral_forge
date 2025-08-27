package net.mcacejr.floral.datagen;

import net.mcacejr.floral.FloralForge;
import net.mcacejr.floral.block.FloralBlocks;
import net.mcacejr.floral.item.FloralItems;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.FrameType;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeAdvancementProvider;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class FloralAdvancementProviderForge extends ForgeAdvancementProvider {

    public FloralAdvancementProviderForge(PackOutput output, CompletableFuture<HolderLookup.Provider> registries, ExistingFileHelper existingFileHelper) {
        super(output, registries, existingFileHelper, List.of(new FloralAdvancementGenerator()));
    }

    public static class FloralAdvancementGenerator implements AdvancementGenerator {
        public static final List<Block> FLOWERS = List.of(
                FloralBlocks.BLACK_PETUNIA.get(),
                FloralBlocks.RED_PETUNIA.get(),
                Blocks.SPORE_BLOSSOM,
                FloralBlocks.PURPLE_BELLFLOWER.get(),
                FloralBlocks.PURPLE_CHIMNEY_BELLFLOWER.get(),
                FloralBlocks.GREEN_CONEFLOWER.get(),
                FloralBlocks.LIGHT_GRAY_TULIP.get(),
                FloralBlocks.GRAY_TULIP.get(),
                FloralBlocks.BLACK_TULIP.get(),
                FloralBlocks.BROWN_TULIP.get(),
                FloralBlocks.YELLOW_TULIP.get(),
                FloralBlocks.LIME_TULIP.get(),
                FloralBlocks.GREEN_TULIP.get(),
                FloralBlocks.CYAN_TULIP.get(),
                FloralBlocks.LIGHT_BLUE_TULIP.get(),
                FloralBlocks.BLUE_TULIP.get(),
                FloralBlocks.PURPLE_TULIP.get(),
                FloralBlocks.MAGENTA_TULIP.get(),
                FloralBlocks.GREEN_DAHLIA.get(),
                FloralBlocks.MAGENTA_CABARET.get(),
                FloralBlocks.LIME_BELLFLOWER.get(),
                FloralBlocks.LIME_CHIMNEY_BELLFLOWER.get(),
                FloralBlocks.PURPLE_WOLFSBANE.get(),
                Blocks.PINK_PETALS,
                Blocks.SUNFLOWER,
                Blocks.LILAC,
                Blocks.PEONY,
                Blocks.ROSE_BUSH,
                Blocks.DANDELION,
                Blocks.POPPY,
                Blocks.BLUE_ORCHID,
                Blocks.ALLIUM,
                Blocks.AZURE_BLUET,
                Blocks.RED_TULIP,
                Blocks.ORANGE_TULIP,
                Blocks.WHITE_TULIP,
                Blocks.PINK_TULIP,
                Blocks.OXEYE_DAISY,
                Blocks.CORNFLOWER,
                Blocks.LILY_OF_THE_VALLEY,
                Blocks.WITHER_ROSE,
                Blocks.TORCHFLOWER
        );

        public Advancement getAdvancement(String id) {
            return Advancement.Builder.advancement().build(ResourceLocation.fromNamespaceAndPath("minecraft", id));
        }

        @Override
        public void generate(HolderLookup.@NotNull Provider provider, @NotNull Consumer<Advancement> consumer, @NotNull ExistingFileHelper existingFileHelper) {
            Advancement getFlowerTrimmers = Advancement.Builder.advancement()
                    .parent(getAdvancement("husbandry/root"))
                    .display(
                            FloralItems.FLOWER_TRIMMER.get(),
                            Component.translatable("advancements.husbandry.get_flower_trimmers.title"),
                            Component.translatable("advancements.husbandry.get_flower_trimmers.description"),
                            null,
                            FrameType.TASK,
                            true,
                            true,
                            false
                    )
                    .addCriterion("flower_trimmers", InventoryChangeTrigger.TriggerInstance.hasItems(FloralItems.FLOWER_TRIMMER.get()))
                    .save(consumer, FloralForge.MOD_ID + ":husbandry/get_flower_trimmers");

            Advancement getDeadheader = Advancement.Builder.advancement()
                    .parent(getFlowerTrimmers)
                    .display(
                            FloralItems.DEADHEADER.get(),
                            Component.translatable("advancements.husbandry.get_deadheader.title"),
                            Component.translatable("advancements.husbandry.get_deadheader.description"),
                            null,
                            FrameType.CHALLENGE,
                            true,
                            true,
                            true
                    )
                    .addCriterion("deadheader", InventoryChangeTrigger.TriggerInstance.hasItems(FloralItems.DEADHEADER.get()))
                    .save(consumer, FloralForge.MOD_ID + ":husbandry/get_deadheader");

            Advancement getCorpseBlossom = Advancement.Builder.advancement()
                    .parent(getFlowerTrimmers)
                    .display(
                            FloralItems.CORPSE_BLOSSOM.get(),
                            Component.translatable("advancements.husbandry.get_corpse_blossom.title"),
                            Component.translatable("advancements.husbandry.get_corpse_blossom.description"),
                            null,
                            FrameType.TASK,
                            true,
                            true,
                            false
                    )
                    .addCriterion("corpse_blossom", InventoryChangeTrigger.TriggerInstance.hasItems(FloralItems.CORPSE_BLOSSOM.get()))
                    .save(consumer, FloralForge.MOD_ID + ":husbandry/get_corpse_blossom");

            Advancement getFloralBane = Advancement.Builder.advancement()
                    .parent(getFlowerTrimmers)
                    .display(
                            FloralItems.FLORAL_BANE.get(),
                            Component.translatable("advancements.husbandry.get_floral_bane.title"),
                            Component.translatable("advancements.husbandry.get_floral_bane.description"),
                            null,
                            FrameType.TASK,
                            true,
                            true,
                            false
                    )
                    .addCriterion("floral_bane", InventoryChangeTrigger.TriggerInstance.hasItems(FloralItems.FLORAL_BANE.get()))
                    .save(consumer, FloralForge.MOD_ID + ":husbandry/get_floral_bane");

            Advancement getAllFlowers = addFlowers(Advancement.Builder.advancement()
                    .parent(getAdvancement("husbandry/root"))
                    .display(
                            Items.POPPY,
                            Component.translatable("advancements.husbandry.get_all_flowers.title"),
                            Component.translatable("advancements.husbandry.get_all_flowers.description"),
                            null,
                            FrameType.CHALLENGE,
                            true,
                            true,
                            false
                    ),
                    FLOWERS.stream())
                    .save(consumer, FloralForge.MOD_ID + ":husbandry/get_all_flowers");
        }

        private static Advancement.Builder addFlowers(Advancement.Builder builder, Stream<Block> flowers) {
            flowers.forEach(flower ->
                    builder.addCriterion(flower.getDescriptionId(), InventoryChangeTrigger.TriggerInstance.hasItems(flower)));

            return builder;
        }
    }
}
