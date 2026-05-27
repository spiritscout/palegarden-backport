package com.spiritscout.palegarden;

import com.spiritscout.palegarden.registry.PaleGardenBlocks;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.item.ItemGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PaleGardenBackport implements ModInitializer {
	public static final String MOD_ID = "palegarden";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		PaleGardenBlocks.registerModBlocks();
		FlammableBlockRegistry.getDefaultInstance().add(PaleGardenBlocks.PALE_OAK_PLANKS, 5, 20);

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
			content.add(PaleGardenBlocks.PALE_OAK_PLANKS);
		});

		LOGGER.info("Hello Fabric world!");
	}
}