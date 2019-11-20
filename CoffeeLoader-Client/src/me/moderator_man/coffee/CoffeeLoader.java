package me.moderator_man.coffee;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileFilter;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Iterator;
import java.util.ServiceLoader;

import javax.imageio.ImageIO;

import me.moderator_man.coffee.impl.CoffeeMod;
import me.moderator_man.coffee.impl.ModManager;
import me.moderator_man.coffee.impl.crafting.CraftingManager;
import me.moderator_man.coffee.impl.debug.DebugMod;
import me.moderator_man.coffee.impl.textures.TextureManager;
import net.minecraft.src.Block;
import net.minecraft.src.EntityMobs;
import net.minecraft.src.Item;
import net.minecraft.src.ItemBlock;
import net.minecraft.src.Render;

public class CoffeeLoader
{
	private static CoffeeLoader instance = new CoffeeLoader();
	
	public static CoffeeLoader getCoffeeLoader()
	{
		return instance;
	}
	
	private final String version = "1.0";
	
	private TextureManager textureManager;
	private ModManager modManager;
	private CraftingManager craftingManager;
	
	public CoffeeLoader()
	{
		textureManager = new TextureManager();
		modManager = new ModManager();
		craftingManager = new CraftingManager();
	}
	
	public void onEnable(String[] args)
	{
		String dir = "mods";
		
		File fDir = new File(dir);
		if (!fDir.exists())
			fDir.mkdir();
		else if (!fDir.isDirectory()) {
			System.out.println("The mods directory specified isn't a real directory. Loading can't continue.");
			return;
		}
		
		for (int i = 0; i < args.length; i++)
		{
			if (args[i].equalsIgnoreCase("-dir") && args[i + 1] != null)
			{
				dir = args[i + 1];
			}
			
			if (args[i].equalsIgnoreCase("-debug"))
			{
				loadDebug(new DebugMod());
			}
		}
		
		loadMods(dir);
	}
	
	public void registerEntityRender(Class<? extends EntityMobs> entity, Render render) {}
	
	public void registerBlocK(Block block, String name)
	{
		int id = block.blockID;
		ItemBlock itemblock = new ItemBlock(id - 256);
		if (Block.blocksList[id] != null && Item.itemsList[id] == null)
			Item.itemsList[id] = itemblock;
	}
	
	public BufferedImage loadImage(String name)
	{
		try
		{
			return ImageIO.read(CoffeeLoader.class.getResourceAsStream(name));
		} catch (Exception ex) {
			System.out.println(String.format("Image loading failed for '%s': %s", name, ex.getMessage()));
			return null;
		}
	}
	
	public String getVersion()
	{
		return version;
	}
	
	public TextureManager getTextureManager()
	{
		return textureManager;
	}
	
	public ModManager getModManager()
	{
		return modManager;
	}
	
	public CraftingManager getCraftingManager()
	{
		return craftingManager;
	}
	
	public void loadMods(String dir)
	{
		try
		{
			File loc = new File(dir);

			File[] flist = loc.listFiles(new FileFilter()
			{
				public boolean accept(File file)
				{
					return file.getPath().toLowerCase().endsWith(".jar");
				}
			});
			if (flist == null || flist.length < 1)
			{
				System.out.println("No mods found");
				return;
			}
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
				modManager.addMod(coffeeMod);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public void loadDebug(DebugMod debugMod)
	{
		try
		{
			StringBuilder sb = new StringBuilder();
			for (String author : debugMod.getAuthors())
				sb.append(author + ",");
			String authorsOG = sb.toString();
			String authors = authorsOG.substring(0, authorsOG.length() - 1);
			debugMod.load();
			System.out.println(String.format("Loaded debug mod (name=%s,version=%s,authors=[%s])", debugMod.getName(), debugMod.getVersion(), authors));
			modManager.addMod(debugMod);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
