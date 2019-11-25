package me.moderator_man.coffee.impl.block;

import java.util.ArrayList;

import me.moderator_man.coffee.api.block.IBlockRegistry;
import me.moderator_man.coffee.api.block.ICoffeeBlock;

public class BlockRegistry implements IBlockRegistry
{
	public ArrayList<ICoffeeBlock> blocks;
	
	public BlockRegistry()
	{
		blocks = new ArrayList<ICoffeeBlock>();
	}
	
	public void registerBlock(ICoffeeBlock block)
	{
		blocks.add(block);
	}
	
	public ArrayList<ICoffeeBlock> getAllBlocks()
	{
		return blocks;
	}
}
