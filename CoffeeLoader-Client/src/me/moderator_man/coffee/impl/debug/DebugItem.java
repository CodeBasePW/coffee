package me.moderator_man.coffee.impl.debug;

import me.moderator_man.coffee.impl.block.CoffeeBlock;
import me.moderator_man.coffee.impl.item.CoffeeItemTool;
import net.minecraft.src.Block;

public class DebugItem extends CoffeeItemTool
{
	public DebugItem()
	{
		super("/debugItems.png", 95, 2, 3, new Block[] { Block.stone });
		iconIndex = 0;
	}
	
	public boolean canHarvestBlock(CoffeeBlock block)
	{
		
		
		return true;
	}
	
	public void onUse()
	{
		
	}
}