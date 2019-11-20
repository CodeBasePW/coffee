package me.moderator_man.coffee.api.item;

import me.moderator_man.coffee.impl.block.CoffeeBlock;

public interface ICoffeeItem
{
	public void onAttack();
	public void onUse();
	public void onHitEntity();
	public void onHitBlock(int x, int y, int z);
	public void onDrop();
	public void onPickup();
	public void onCrafted();
	
	public boolean canHarvestBlock(CoffeeBlock block);
}
