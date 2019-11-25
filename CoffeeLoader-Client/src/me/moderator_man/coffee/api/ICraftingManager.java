package me.moderator_man.coffee.api;

import java.util.ArrayList;

import me.moderator_man.coffee.api.crafting.ICoffeeRecipe;

public interface ICraftingManager
{
	public void registerRecipe(ICoffeeRecipe recipe);
	public ArrayList<ICoffeeRecipe> getAllRecipes();
}
