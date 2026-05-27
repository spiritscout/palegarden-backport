package com.spiritscout.palegarden.client;

import com.spiritscout.palegarden.client.datagen.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class PaleGardenBackportDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(PaleGardenModelProvider::new);
		pack.addProvider(PaleGardenLanguageProvider::new);
		pack.addProvider(PaleGardenLootTableProvider::new);
		pack.addProvider(PaleGardenBlockTagProvider::new);
		pack.addProvider(PaleGardenItemTagProvider::new);
	}
}