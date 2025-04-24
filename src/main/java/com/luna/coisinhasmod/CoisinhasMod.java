package com.luna.coisinhasmod;

import com.luna.coisinhasmod.block.ModBlocks;
import com.luna.coisinhasmod.datagen.ModModelProvider;
import com.luna.coisinhasmod.item.ModItemGroups;
import com.luna.coisinhasmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CoisinhasMod implements ModInitializer {
	public static final String MOD_ID = "coisinhasmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();

		CompostingChanceRegistry.INSTANCE.add(ModItems.LETTUCE, 0.2f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.LETTUCE_SEEDS, 0.1f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.TOMATO, 0.5f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.TOMATO_SEEDS, 0.25f);


	}
}