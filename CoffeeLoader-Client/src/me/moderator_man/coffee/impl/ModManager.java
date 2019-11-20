package me.moderator_man.coffee.impl;

import java.util.ArrayList;

public class ModManager
{
	private ArrayList<CoffeeMod> mods;
	
	public ModManager()
	{
		mods = new ArrayList<CoffeeMod>();
	}
	
	public void addMod(CoffeeMod mod)
	{
		mods.add(mod);
	}
	
	public void removeMod(CoffeeMod mod)
	{
		mods.remove(mod);
	}
	
	public void removeMod(String name)
	{
		for (CoffeeMod mod : mods)
			if (mod.getName() == name)
				mods.remove(mod);
	}
	
	public int getModCount()
	{
		return mods.size();
	}
	
	public CoffeeMod getMod(int index)
	{
		return mods.get(index);
	}
	
	public CoffeeMod getMod(String name)
	{
		for (CoffeeMod mod : mods)
			if (mod.getName() == name)
				return mod;
		return null;
	}
	
	public ArrayList<CoffeeMod> getAllMods()
	{
		return mods;
	}
}
