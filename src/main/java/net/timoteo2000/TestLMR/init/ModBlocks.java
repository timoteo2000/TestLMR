package net.timoteo2000.TestLMR.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.timoteo2000.TestLMR.block.BlockCobblestoneBrick;
import net.timoteo2000.TestLMR.block.BlockLMR;
import net.timoteo2000.TestLMR.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
	
	public static final BlockLMR cobblestoneBrick = new BlockCobblestoneBrick();
	
	public static void init(){
		GameRegistry.registerBlock(cobblestoneBrick, "cobblestoneBrick");
	}

}
