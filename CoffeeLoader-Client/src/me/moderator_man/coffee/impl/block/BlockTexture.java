package me.moderator_man.coffee.impl.block;

import java.awt.image.BufferedImage;

public class BlockTexture
{
	private BufferedImage front;
	private BufferedImage back;
	private BufferedImage left;
	private BufferedImage right;
	private BufferedImage top;
	private BufferedImage bottom;
	private BufferedImage all;
	
	public BlockTexture() {}
	
	public BlockTexture(BufferedImage all)
	{
		this.all = all;
	}
	
	public BlockTexture(BufferedImage front, BufferedImage back, BufferedImage left, BufferedImage right, BufferedImage top, BufferedImage bottom)
	{
		this.front = front;
		this.back = back;
		this.left = left;
		this.right = right;
		this.top = top;
		this.bottom = bottom;
	}
	
	public BlockTexture setFront(BufferedImage front)
	{
		this.front = front;
		return this;
	}
	
	public BlockTexture setBack(BufferedImage back)
	{
		this.back = back;
		return this;
	}
	
	public BlockTexture setLeft(BufferedImage left)
	{
		this.left = left;
		return this;
	}
	
	public BlockTexture setRight(BufferedImage right)
	{
		this.right = right;
		return this;
	}
	
	public BlockTexture setTop(BufferedImage top)
	{
		this.top = top;
		return this;
	}
	
	public BlockTexture setBottom(BufferedImage bottom)
	{
		this.bottom = bottom;
		return this;
	}
	
	public BlockTexture setAll(BufferedImage all)
	{
		this.all = all;
		return this;
	}
	
	public BufferedImage getFront()
	{
		return front;
	}
	
	public BufferedImage getBack()
	{
		return back;
	}
	
	public BufferedImage getLeft()
	{
		return left;
	}
	
	public BufferedImage getRight()
	{
		return right;
	}
	
	public BufferedImage getTop()
	{
		return top;
	}
	
	public BufferedImage getBottom()
	{
		return bottom;
	}
	
	public BufferedImage getAll()
	{
		return all;
	}
}
