package me.moderator_man.coffee.impl.debug;

import me.moderator_man.coffee.impl.CoffeeMod;
import me.moderator_man.coffee.impl.crafting.CoffeeRecipe;
import me.moderator_man.coffee.impl.item.CoffeeItemTool;
import me.moderator_man.coffee.impl.item.CoffeeStack;
import me.moderator_man.coffee.impl.textures.Texture;
import net.minecraft.src.Block;

public class DebugMod extends CoffeeMod
{
	private final CoffeeItemTool debugItem = new DebugItem();
	
	public DebugMod()
	{
		super("debug", "testing mod", new String[] { "moderator_man", "Riceworld" }, "1.0", new String[] {});
	}
	
	public void load()
	{
		loader.getTextureManager().registerTexture("debug.debugItems", new Texture(loader.loadImage("/debugItems.png")));
		
		loader.getCraftingManager().registerRecipe(new CoffeeRecipe(new CoffeeStack(debugItem, 1), new Object[] { "#", Character.valueOf('#'), Block.dirt }));
	}
}
