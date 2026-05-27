package com.spiritscout.palegarden.client.datagen;

import com.spiritscout.palegarden.registry.PaleGardenBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class PaleGardenModelProvider extends FabricModelProvider {

    public PaleGardenModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(PaleGardenBlocks.PALE_OAK_PLANKS);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        // Item models for our blocks are handled automatically by registerSimpleCubeAll above
        // This method is for pure items (sticks, swords, etc.) — we have none yet
    }
}