package me.moderator_man.coffee.api.block;

import java.util.ArrayList;

public interface IBlockRegistry
{
	public void registerBlock(ICoffeeBlock block);
	public ArrayList<ICoffeeBlock> getAllBlocks();
}
