package me.moderator_man.coffee.api.block;

import me.moderator_man.coffee.impl.block.BlockFace;

public interface ICoffeeBlock
{
	public float getHardness();
	public boolean canBurn();
	public void onClick();
	public void onUse();
	public int getTextureForSide(BlockFace face);
	public int getBlockID();
	public int getIconIndex();
	public String getBlockTextureSheet();
	public String getItemTextureSheet();
}
