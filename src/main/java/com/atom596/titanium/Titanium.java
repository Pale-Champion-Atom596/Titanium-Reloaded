package com.atom596.titanium;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Titanium implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("titanium");

	@Override
	public void onInitialize() {

		LOGGER.info("Titanium successfully loaded");

		TitaniumItems.registerItems();
		TitaniumBlocks.registerBlocks();
	}
}
