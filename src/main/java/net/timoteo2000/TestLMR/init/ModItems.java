package net.timoteo2000.TestLMR.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.timoteo2000.TestLMR.item.ItemLMR;
import net.timoteo2000.TestLMR.item.ItemStoneChunk;
import net.timoteo2000.TestLMR.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
	public static final ItemLMR stoneChunk = new ItemStoneChunk();
	
	public static void init(){
		GameRegistry.registerItem(stoneChunk, "stoneChunk");
	}
}
