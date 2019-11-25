package me.moderator_man.coffee.impl.item;

import me.moderator_man.coffee.CoffeeLoader;
import me.moderator_man.coffee.api.item.ICoffeeItem;
import net.minecraft.src.Block;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;

public abstract class CoffeeItem extends Item implements ICoffeeItem
{
	protected static CoffeeLoader loader = CoffeeLoader.getCoffeeLoader();
	
	public CoffeeItem(String texture, int id)
	{
		super(id);
		hasCustomSheet = true;
		customSheet = texture;
	}
	
	public CoffeeItem setStackSize(int stackSize)
	{
		maxStackSize = stackSize;
		return this;
	}
	
	public boolean onItemUse(ItemStack itemstack, EntityPlayer entityplayer, World world, int i, int j, int k, int l)
	{
		onUse();
		return false;
	}
	
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
    {
		System.out.println("CoffeeItem#onItemRightClick");
		onUse();
        return itemstack;
    }
	
	public void hitEntity(ItemStack itemstack, EntityLiving entityliving)
    {
		onHitEntity();
    }
	
	public void hitBlock(ItemStack itemstack, int i, int j, int k, int l)
    {
		onHitBlock(i, j, k);
    }
	
	public boolean canHarvestBlock(Block block) { return canHarvestBlock(block.blockID); }
	
	public boolean canHarvestBlock(int blockID) { return false; }
	
	public void onAttack() {}
	
	public void onUse() {}
	
	public void onHitEntity() {}
	public void onHitBlock(int x, int y, int z) {}
	
	public void onDrop() {}
	
	public void onPickup() {}
	
	public void onCrafted() {}
}
