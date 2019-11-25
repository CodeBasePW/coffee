package me.moderator_man.coffee.impl.block;

import java.util.Random;

import me.moderator_man.coffee.api.block.ICoffeeBlock;
import net.minecraft.src.Block;
import net.minecraft.src.IBlockAccess;

public abstract class CoffeeBlock extends Block implements ICoffeeBlock
{
	private String blockTextureSheet;
	private String itemTextureSheet;
	
	public CoffeeBlock(String blockTextureSheet, String itemTextureSheet, int blockID, CoffeeMaterial blockMaterial)
	{
		super(blockID, blockMaterial);
		hasCustomSheet = true;
		customSheet = blockTextureSheet;
		
		this.blockTextureSheet = blockTextureSheet;
		this.itemTextureSheet = itemTextureSheet;
	}
	
	public int getBlockTexture(IBlockAccess iblockaccess, int x, int y, int z, int face)
	{
		return getTextureForSide(BlockFace.valueOf(face));
	}
	
	public float getHardness()
	{
		return blockHardness;
	}
	
	public boolean canBurn()
	{
		return blockMaterial.getBurning();
	}
	
	public void onClick() {}
	public void onUse() {}
	
	public int getTextureForSide(BlockFace face)
	{
		return CoffeeBlocks.BEDROCK.getBlockIndexInTexture();
	}
	
	public int getBlockID()
	{
		return blockID;
	}
	
	public String getBlockTextureSheet()
	{
		return blockTextureSheet;
	}
	
	public String getItemTextureSheet()
	{
		return itemTextureSheet;
	}
}
