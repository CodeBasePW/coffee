package me.moderator_man.coffee;

public class CoffeeMod implements ICoffeeMod
{
	protected static CoffeeLoader loader = CoffeeLoader.getCoffeeLoader();
	
	private String name;
	private String[] authors;
	private String version;
	private String[] dependencies;
	
	public CoffeeMod(String name, String[] authors, String version, String[] dependencies)
	{
		this.name = name;
		this.authors = authors;
		this.version = version;
		this.dependencies = dependencies;
	}
	
	public void load() {}
	
	public String getName()
	{
		return name;
	}
	
	public String[] getAuthors()
	{
		return authors;
	}
	
	public String getVersion()
	{
		return version;
	}
	
	public String[] getDependencies()
	{
		return dependencies;
	}
}
