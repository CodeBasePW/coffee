package me.moderator_man.coffee.util;

import net.minecraft.src.Block;

public class Util
{
	public static Block[] convertEffectiveBlocks(int[] blockIDList)
	{
		Block[] blocks = new Block[blockIDList.length];
		for (int i = 0; i < blocks.length; i++)
		{
			blocks[i] = Block.blocksList[blockIDList[i]];
		}
		return blocks;
	}
}
