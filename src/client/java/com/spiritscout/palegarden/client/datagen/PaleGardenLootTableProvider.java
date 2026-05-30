package com.spiritscout.palegarden.client.datagen;

import com.spiritscout.palegarden.registry.PaleGardenBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class PaleGardenLootTableProvider extends FabricBlockLootTableProvider {

    public PaleGardenLootTableProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(output, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(PaleGardenBlocks.PALE_OAK_PLANKS);
        addDrop(PaleGardenBlocks.PALE_OAK_STAIRS);
        addDrop(PaleGardenBlocks.PALE_OAK_SLAB, slabDrops(PaleGardenBlocks.PALE_OAK_SLAB));
        addDrop(PaleGardenBlocks.PALE_OAK_FENCE);
        addDrop(PaleGardenBlocks.PALE_OAK_FENCE_GATE);
        addDrop(PaleGardenBlocks.PALE_OAK_PRESSURE_PLATE);
        addDrop(PaleGardenBlocks.PALE_OAK_BUTTON);
    }
}