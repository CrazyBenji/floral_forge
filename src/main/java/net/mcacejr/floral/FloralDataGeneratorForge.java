package net.mcacejr.floral;

import net.mcacejr.floral.datagen.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = FloralForge.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class FloralDataGeneratorForge {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new FloralWorldGenProvider(packOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new FloralRecipeProviderForge(packOutput));
        generator.addProvider(event.includeServer(), FloralLootTableProvider.create(packOutput));
        generator.addProvider(event.includeServer(), new FloralAdvancementProviderForge(packOutput, lookupProvider, existingFileHelper));

        FloralBlockTagProviderForge blockTagGenerator = generator.addProvider(event.includeServer(),
                new FloralBlockTagProviderForge(packOutput, lookupProvider, existingFileHelper));
        generator.addProvider(event.includeServer(), new FloralItemTagProviderForge(packOutput, lookupProvider, blockTagGenerator.contentsGetter(), existingFileHelper));
        generator.addProvider(event.includeServer(), new FloralBiomeTagProviderForge(packOutput, lookupProvider, existingFileHelper));

        // Models are added manually from Fabric's DataGen due to fewer restrictions
    }
}
