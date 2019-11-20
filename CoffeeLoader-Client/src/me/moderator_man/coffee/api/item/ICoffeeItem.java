package me.moderator_man.coffee.api.item;

public interface ICoffeeItem
{
	public void onAttack();
	public void onUse();
	public void onDrop();
	public void onPickup();
	public void onCrafted();
}
