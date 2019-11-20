package me.moderator_man.coffee;

import java.io.File;
import java.io.FileFilter;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Iterator;
import java.util.ServiceLoader;

import me.moderator_man.coffee.impl.debug.DebugMod;
import me.moderator_man.coffee.impl.textures.TextureManager;

public class CoffeeLoader
{
	private static CoffeeLoader instance = new CoffeeLoader();
	
	public static CoffeeLoader getCoffeeLoader()
	{
		return instance;
	}
	
	private final String version = "1.0";
	
	private TextureManager textureManager;
	
	public CoffeeLoader()
	{
		textureManager = new TextureManager();
	}
	
	public String getVersion()
	{
		return version;
	}
	
	public TextureManager getTextureManager()
	{
		return textureManager;
	}
	
	public void loadMods()
	{
		try
		{
			File loc = new File("plugins");

			File[] flist = loc.listFiles(new FileFilter()
			{
				public boolean accept(File file)
				{
					return file.getPath().toLowerCase().endsWith(".jar");
				}
			});
			URL[] urls = new URL[flist.length];
			for (int i = 0; i < flist.length; i++)
				urls[i] = flist[i].toURI().toURL();
			URLClassLoader ucl = new URLClassLoader(urls);

			ServiceLoader<CoffeeMod> sl = ServiceLoader.load(CoffeeMod.class, ucl);
			Iterator<CoffeeMod> apit = sl.iterator();
			while (apit.hasNext())
			{
				CoffeeMod coffeeMod = apit.next();
				String name = coffeeMod.getName();
				StringBuilder sb = new StringBuilder();
				for (String author : coffeeMod.getAuthors())
					sb.append(author + ",");
				String authorsOG = sb.toString();
				String authors = authorsOG.substring(0, authorsOG.length() - 1);
				String version = coffeeMod.getVersion();
				coffeeMod.load();
				System.out.println(String.format("Found mod (name=%s,version=%s,authors=[%s])", name, version, authors));
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public void loadDebug(DebugMod debugMod)
	{
		try
		{
			debugMod.load();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
