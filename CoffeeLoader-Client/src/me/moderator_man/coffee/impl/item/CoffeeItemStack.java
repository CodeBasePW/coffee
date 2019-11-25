package me.moderator_man.coffee.impl.item;

import me.moderator_man.coffee.api.item.ICoffeeItemStack;
import me.moderator_man.coffee.impl.block.CoffeeBlock;
import net.minecraft.src.ItemStack;

public class CoffeeItemStack implements ICoffeeItemStack
{
	private ItemStack stack;
	
	public CoffeeItemStack(CoffeeItem item, int stackSize)
	{
		stack = new ItemStack(item, stackSize);
	}
	
	public CoffeeItemStack(CoffeeItemTool item, int stackSize)
	{
		stack = new ItemStack(item, stackSize);
	}
	
	public CoffeeItemStack(CoffeeBlock block, int stackSize)
	{
		stack = new ItemStack(block, stackSize);
	}
	
	public ItemStack getStack()
	{
		return stack;
	}
}
