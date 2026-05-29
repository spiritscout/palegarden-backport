package com.spiritscout.palegarden.client.datagen;

import com.spiritscout.palegarden.registry.PaleGardenBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class PaleGardenLanguageProvider extends FabricLanguageProvider {

    public PaleGardenLanguageProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(output, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(PaleGardenBlocks.PALE_OAK_PLANKS, "Pale Oak Planks");
        translationBuilder.add(PaleGardenBlocks.PALE_OAK_STAIRS, "Pale Oak Stairs");
        translationBuilder.add(PaleGardenBlocks.PALE_OAK_SLAB, "Pale Oak Slab");
    }
}