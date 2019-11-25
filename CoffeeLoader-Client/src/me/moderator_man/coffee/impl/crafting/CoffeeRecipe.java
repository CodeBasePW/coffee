package me.moderator_man.coffee.impl.crafting;

import me.moderator_man.coffee.api.crafting.ICoffeeRecipe;
import me.moderator_man.coffee.impl.item.CoffeeItemStack;
import net.minecraft.src.ItemStack;

public class CoffeeRecipe implements ICoffeeRecipe
{
	private CoffeeItemStack stack;
	private Object[] recipe;
	
	public CoffeeRecipe(CoffeeItemStack stack, Object[] recipe)
	{
		this.stack = stack;
		this.recipe = recipe;
	}
	
	public CoffeeItemStack getCoffeeStack()
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
