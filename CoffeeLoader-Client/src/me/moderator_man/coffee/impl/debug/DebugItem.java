package me.moderator_man.coffee.impl.debug;

import me.moderator_man.coffee.impl.block.CoffeeBlocks;
import me.moderator_man.coffee.impl.item.CoffeeItemTool;
import net.minecraft.client.Minecraft;

public class DebugItem extends CoffeeItemTool
{
	public DebugItem()
	{
		super("/debugItems.png", 95, 1000, 1000, new int[]
		{
			CoffeeBlocks.STONE.getBlockID(),
			CoffeeBlocks.WOOD.getBlockID(),
			CoffeeBlocks.DIRT.getBlockID(),
			CoffeeBlocks.GRASS.getBlockID(),
			CoffeeBlocks.SAND.getBlockID(),
			CoffeeBlocks.LEAVES.getBlockID(),
			CoffeeBlocks.COBBLESTONE.getBlockID(),
			CoffeeBlocks.BEDROCK.getBlockID()
		});
		iconIndex = 0;
	}
	
	public boolean canHarvestBlock(int blockID)
	{
		return true;
	}
	
	public void onUse()
	{
		Minecraft.getMinecraft().ingameGUI.addChatMessage("gamer time");
	}
}