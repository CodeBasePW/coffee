package me.moderator_man.coffee.api.block;

public interface ICoffeeBlock
{
	public float getHardness();
	public boolean canBurn();
	public void onClick();
	public void onUse();
}
