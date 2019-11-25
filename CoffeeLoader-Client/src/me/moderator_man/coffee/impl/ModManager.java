package me.moderator_man.coffee.impl;

import java.util.ArrayList;

import me.moderator_man.coffee.api.ICoffeeMod;
import me.moderator_man.coffee.api.IModManager;

public class ModManager implements IModManager
{
	private ArrayList<ICoffeeMod> mods;
	
	public ModManager()
	{
		mods = new ArrayList<ICoffeeMod>();
	}
	
	public void addMod(ICoffeeMod mod)
	{
		mods.add(mod);
	}
	
	public void removeMod(ICoffeeMod mod)
	{
		mods.remove(mod);
	}
	
	public void removeMod(String name)
	{
		for (ICoffeeMod mod : mods)
			if (mod.getName() == name)
				mods.remove(mod);
	}
	
	public int getModCount()
	{
		return mods.size();
	}
	
	public ICoffeeMod getMod(int index)
	{
		return mods.get(index);
	}
	
	public ICoffeeMod getMod(String name)
	{
		for (ICoffeeMod mod : mods)
			if (mod.getName() == name)
				return mod;
		return null;
	}
	
	public ArrayList<ICoffeeMod> getAllMods()
	{
		return mods;
	}
}
