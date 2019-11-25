package me.moderator_man.coffee.api;

import java.util.ArrayList;

public interface IModManager
{
	public void addMod(ICoffeeMod mod);
	public void removeMod(ICoffeeMod mod);
	public void removeMod(String name);
	public int getModCount();
	public ICoffeeMod getMod(int index);
	public ICoffeeMod getMod(String name);
	public ArrayList<ICoffeeMod> getAllMods();
}
