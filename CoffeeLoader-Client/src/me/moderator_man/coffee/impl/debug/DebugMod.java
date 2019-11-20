package me.moderator_man.coffee.impl.debug;

import me.moderator_man.coffee.CoffeeMod;
import me.moderator_man.coffee.impl.textures.Texture;

public class DebugMod extends CoffeeMod
{
	public DebugMod()
	{
		super("debug", new String[] { "moderator_man", "Riceworld" }, "-1", new String[] {});
	}
	
	public void load()
	{
		loader.getTextureManager().registerTexture("debug.debugItem", new Texture(null));
	}
}
