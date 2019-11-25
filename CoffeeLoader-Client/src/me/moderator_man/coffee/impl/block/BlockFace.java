package me.moderator_man.coffee.impl.block;

import me.moderator_man.coffee.api.block.IBlockFace;

public enum BlockFace implements IBlockFace
{
	TOP(1),
	BOTTOM(0),
	LEFT(3),
	RIGHT(2),
	FRONT(5),
	BACK(4);
	
	private BlockFace(int id)
	{
		this.id = id;
	}
	
	public static BlockFace valueOf(int val)
	{
		for (BlockFace face : values())
		{
			if (face.getFaceId() == val)
				return face;
		}
		
		return TOP;
	}
	
	private int id;
	
	public int getFaceId()
	{
		return id;
	}
}
