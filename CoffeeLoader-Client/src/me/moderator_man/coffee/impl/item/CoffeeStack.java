package me.moderator_man.coffee.impl.item;

import net.minecraft.src.ItemStack;

public class CoffeeStack
{
	private ItemStack stack;
	
	public CoffeeStack(CoffeeItem item, int stackSize)
	{
		stack = new ItemStack(item, stackSize);
	}
	
	public CoffeeStack(CoffeeItemTool item, int stackSize)
	{
		stack = new ItemStack(item, stackSize);
	}
	
	public ItemStack getStack()
	{
		return stack;
	}
}
