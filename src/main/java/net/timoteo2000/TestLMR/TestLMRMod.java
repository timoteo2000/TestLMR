package net.timoteo2000.TestLMR;


import net.minecraftforge.common.config.Configuration;
import net.timoteo2000.TestLMR.client.handler.KeyInputEventHandler;
import net.timoteo2000.TestLMR.handler.ConfigHandler;
import net.timoteo2000.TestLMR.init.ModBlocks;
import net.timoteo2000.TestLMR.init.ModItems;
import net.timoteo2000.TestLMR.init.Recipes;
import net.timoteo2000.TestLMR.proxy.IProxy;
import net.timoteo2000.TestLMR.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;


@Mod(modid=Reference.MOD_ID,name=Reference.MOD_NAME,version=Reference.VERSION, guiFactory=Reference.GUI_FACTORY)
public class TestLMRMod {
	
	@Mod.Instance(Reference.MOD_ID)
	public static TestLMRMod instance;
	
	@SidedProxy(clientSide=Reference.CLIENT_PROXY,serverSide=Reference.SERVER_PROXY)
	public static IProxy proxy;
	 
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
		 ConfigHandler.init(event.getSuggestedConfigurationFile());
		 FMLCommonHandler.instance().bus().register(new ConfigHandler());
		 
		 ModItems.init();
		 
		 ModBlocks.init();
		 
		 Recipes.init();
		 
		 proxy.registerKeyBindings();
	}
	@Mod.EventHandler
	public void init(FMLInitializationEvent event){
		 FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());
	}
	 
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
		 
	}
	
	
}
