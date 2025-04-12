package com.luna.coisinhasmod;

import com.luna.coisinhasmod.item.ModItemGroups;
import com.luna.coisinhasmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CoisinhasMod implements ModInitializer {
	public static final String MOD_ID = "coisinhasmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
	}
}