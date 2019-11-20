package me.moderator_man.coffee.api.item;

public interface ICoffeeItem
{
	public void onAttack();
	public void onUse();
	public void onHitEntity();
	public void onHitBlock(int x, int y, int z);
	public void onDrop();
	public void onPickup();
	public void onCrafted();
}
