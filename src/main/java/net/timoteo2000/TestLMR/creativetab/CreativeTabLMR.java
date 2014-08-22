package net.timoteo2000.TestLMR.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.timoteo2000.TestLMR.init.ModItems;
import net.timoteo2000.TestLMR.reference.Reference;

public class CreativeTabLMR {
	public static final CreativeTabs LMR_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()){
		@Override
		public Item getTabIconItem(){
			return ModItems.stoneChunk;
		}
	};
}
