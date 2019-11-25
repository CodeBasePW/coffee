package me.moderator_man.coffee.impl.debug;

import me.moderator_man.coffee.impl.block.BlockFace;
import me.moderator_man.coffee.impl.block.CoffeeBlock;
import me.moderator_man.coffee.impl.block.CoffeeBlocks;
import me.moderator_man.coffee.impl.block.CoffeeMaterial;

public class DebugBlock extends CoffeeBlock
{
	public DebugBlock()
	{
		super("/debugBlocks.png", "/debugItems.png", 96, CoffeeMaterial.rock);
	}
	
	public int getIconIndex()
	{
		return 0;
	}
	
	public int getTextureForSide(BlockFace face)
	{
		return CoffeeBlocks.BEDROCK.getBlockIndexInTexture();
	}
}
