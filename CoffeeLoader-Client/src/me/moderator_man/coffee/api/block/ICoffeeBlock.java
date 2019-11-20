package me.moderator_man.coffee.api.block;

import me.moderator_man.coffee.impl.block.BlockTexture;

public interface ICoffeeBlock
{
	public BlockTexture getTexture();
	public String getName();
	public int getHardness();
	public boolean canBurn();
	public void onClick();
	public void onUse();
}
