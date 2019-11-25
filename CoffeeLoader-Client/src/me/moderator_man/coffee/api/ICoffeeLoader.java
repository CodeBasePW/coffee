package me.moderator_man.coffee.api;

import me.moderator_man.coffee.api.block.IBlockRegistry;
import me.moderator_man.coffee.api.event.IEventManager;
import me.moderator_man.coffee.api.util.IResourceConverter;

public interface ICoffeeLoader
{
	public void onEnable(String[] args);
	
	public IModManager getModManager();
	public ICraftingManager getCraftingManager();
	public IResourceConverter getResourceConverter();
	public IEventManager getEventManager();
	public IBlockRegistry getBlockRegistry();
}
