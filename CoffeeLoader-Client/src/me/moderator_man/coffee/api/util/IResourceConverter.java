package me.moderator_man.coffee.api.util;

public interface IResourceConverter
{
	public void onEnable();
	public String convertResource(String resource);
	public String get(String url);
}
