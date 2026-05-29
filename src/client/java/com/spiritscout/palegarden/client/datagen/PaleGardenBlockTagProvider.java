package com.spiritscout.palegarden.client.datagen;

import com.spiritscout.palegarden.registry.PaleGardenBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class PaleGardenBlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public PaleGardenBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(output, registryLookup);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PLANKS)
                .add(PaleGardenBlocks.PALE_OAK_PLANKS);

        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
                .add(PaleGardenBlocks.PALE_OAK_STAIRS);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(PaleGardenBlocks.PALE_OAK_PLANKS)
                .add(PaleGardenBlocks.PALE_OAK_STAIRS);
    }
}
