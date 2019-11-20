package me.moderator_man.coffee.impl.crafting;

import me.moderator_man.coffee.impl.item.CoffeeStack;
import net.minecraft.src.ItemStack;

public class CoffeeRecipe
{
	private CoffeeStack stack;
	private Object[] recipe;
	
	public CoffeeRecipe(CoffeeStack stack, Object[] recipe)
	{
		this.stack = stack;
		this.recipe = recipe;
	}
	
	public CoffeeStack getCoffeeStack()
	{
		return stack;
	}
	
	public ItemStack getStack()
	{
		return stack.getStack();
	}
	
	public Object[] getRecipe()
	{
		return recipe;
	}
}
