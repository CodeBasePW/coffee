package me.moderator_man.coffee.impl.textures;

import java.awt.image.BufferedImage;

public class Texture
{
	private BufferedImage image;
	
	public Texture(BufferedImage image)
	{
		this.image = image;
	}
	
	public BufferedImage getBufferedImage()
	{
		return image;
	}
}
