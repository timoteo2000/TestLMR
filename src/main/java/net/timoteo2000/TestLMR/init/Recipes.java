package net.timoteo2000.TestLMR.init;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {
	public static void init(){
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.stoneChunk, 4), //START
				"s s",
				" c ",
				"s s",
				'c',
				new ItemStack(Blocks.cobblestone),
				's',
				new ItemStack(Blocks.stone))); //END
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.cobblestoneBrick), //START
				new ItemStack(ModItems.stoneChunk),
				new ItemStack(ModItems.stoneChunk),
				new ItemStack(ModItems.stoneChunk),
				new ItemStack(ModItems.stoneChunk))); //END
	}
}
