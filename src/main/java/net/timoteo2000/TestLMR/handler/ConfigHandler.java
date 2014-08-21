package net.timoteo2000.TestLMR.handler;

import java.io.File;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;
import net.timoteo2000.TestLMR.reference.Reference;

public class ConfigHandler {
	
	public static Configuration config;
	public static boolean testValue = false;
	
	public static void init(File configFile){
		if(config == null){
			config = new Configuration(configFile);
			loadConfig();
		}
	}
	
	
	private static void loadConfig(){
		testValue = config.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "test");
		if(config.hasChanged()){
			config.save();
		}
	}
	
	@SubscribeEvent
	public void onConfigChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event){
		if(event.modID.equals(Reference.MOD_ID)){
			//Resync configs
			loadConfig();
		}
	}
}
