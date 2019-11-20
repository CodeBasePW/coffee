package me.moderator_man.coffee.impl.textures;

import java.util.HashMap;

public class TextureManager
{
	private HashMap<String, Texture> textures;
	
	public TextureManager()
	{
		textures = new HashMap<String, Texture>();
	}
	
	public void registerTexture(String key, Texture texture)
	{
		textures.put(key, texture);
	}
	
	public void unregisterTexture(String key)
	{
		textures.remove(key);
	}
	
	public Texture getTexture(String key)
	{
		return textures.get(key);
	}
}
