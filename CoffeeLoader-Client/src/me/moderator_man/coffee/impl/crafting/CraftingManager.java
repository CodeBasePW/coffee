package me.moderator_man.coffee.impl.crafting;

import java.util.ArrayList;

import me.moderator_man.coffee.api.ICraftingManager;
import me.moderator_man.coffee.api.crafting.ICoffeeRecipe;

public class CraftingManager implements ICraftingManager
{
	private ArrayList<ICoffeeRecipe> recipes;
	
	public CraftingManager()
	{
		recipes = new ArrayList<ICoffeeRecipe>();
	}
	
	public void registerRecipe(ICoffeeRecipe recipe)
	{
		recipes.add(recipe);
	}
	
	public ArrayList<ICoffeeRecipe> getAllRecipes()
	{
		return recipes;
	}
}
