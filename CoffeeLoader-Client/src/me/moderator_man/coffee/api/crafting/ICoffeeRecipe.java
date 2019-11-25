package me.moderator_man.coffee.api.crafting;

import me.moderator_man.coffee.impl.item.CoffeeItemStack;
import net.minecraft.src.ItemStack;

public interface ICoffeeRecipe
{
	public CoffeeItemStack getCoffeeStack();
	public ItemStack getStack();
	public Object[] getRecipe();
}
