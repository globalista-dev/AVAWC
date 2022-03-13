package com.globalista.avawc;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AVAWC implements ModInitializer {

	public static String MOD_ID = "avawc";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("AVAWC has been loaded");
	}
}
