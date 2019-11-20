package me.moderator_man.coffee.impl.crafting;

import java.util.ArrayList;

public class CraftingManager
{
	private ArrayList<CoffeeRecipe> recipes;
	
	public CraftingManager()
	{
		recipes = new ArrayList<CoffeeRecipe>();
	}
	
	public void registerRecipe(CoffeeRecipe recipe)
	{
		recipes.add(recipe);
	}
	
	public ArrayList<CoffeeRecipe> getAllRecipes()
	{
		return recipes;
	}
}
