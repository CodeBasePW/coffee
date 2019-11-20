package me.moderator_man.coffee.impl.block;

import me.moderator_man.coffee.api.block.ICoffeeBlock;
import net.minecraft.src.Block;
import net.minecraft.src.IBlockAccess;

public class CoffeeBlock extends Block implements ICoffeeBlock
{
	private String texture;
	
	public CoffeeBlock(String texture, int blockID, CoffeeMaterial blockMaterial)
	{
		super(blockID, blockMaterial);
		this.texture = texture;
	}
	
	public int getBlockTexture(IBlockAccess iblockaccess, int x, int y, int z, int face)
	{
		return blockIndexInTexture;
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
}
