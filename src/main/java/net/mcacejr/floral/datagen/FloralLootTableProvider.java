package net.mcacejr.floral.datagen;

import net.mcacejr.floral.datagen.loot.FloralBlockLootTables;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Set;

public class FloralLootTableProvider {
    public static LootTableProvider create(PackOutput output) {
        return new LootTableProvider(output, Set.of(), List.of(
                new LootTableProvider.SubProviderEntry(FloralBlockLootTables::new, LootContextParamSets.BLOCK)
        ));
    }

}
