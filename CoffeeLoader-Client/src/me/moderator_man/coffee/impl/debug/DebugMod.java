package me.moderator_man.coffee.impl.debug;

import me.moderator_man.coffee.impl.CoffeeMod;
import me.moderator_man.coffee.impl.block.CoffeeBlock;
import me.moderator_man.coffee.impl.crafting.CoffeeRecipe;
import me.moderator_man.coffee.impl.event.EventTarget;
import me.moderator_man.coffee.impl.event.events.EventPlayerDamaged;
import me.moderator_man.coffee.impl.item.CoffeeItemStack;
import me.moderator_man.coffee.impl.item.CoffeeItemTool;
import net.minecraft.src.Block;

public class DebugMod extends CoffeeMod
{
	private final CoffeeItemTool debugItem = new DebugItem();
	private final CoffeeBlock debugBlock = new DebugBlock();
	
	public DebugMod()
	{
		super("debug", "testing mod", new String[] { "moderator_man", "Riceworld" }, "1.0", new String[] {});
		
		loader.getEventManager().register(this);
	}
	
	public void load()
	{
		loader.getBlockRegistry().registerBlock(debugBlock);
		
		loader.getCraftingManager().registerRecipe(new CoffeeRecipe(new CoffeeItemStack(debugItem, 1), new Object[] { "#", Character.valueOf('#'), Block.dirt }));
		
		loader.getCraftingManager().registerRecipe(new CoffeeRecipe(new CoffeeItemStack(debugBlock, 64), new Object[] { "#", Character.valueOf('#'), Block.cobblestone }));
	}
	
	@EventTarget
	public void onPlayerDamaged(EventPlayerDamaged event)
	{
		event.setCancelled(true);
		event.player.sendMessage("");
	}
}
