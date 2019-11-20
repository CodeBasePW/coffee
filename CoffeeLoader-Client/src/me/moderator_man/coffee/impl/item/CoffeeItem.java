package me.moderator_man.coffee.impl.item;

import me.moderator_man.coffee.CoffeeLoader;
import me.moderator_man.coffee.api.item.ICoffeeItem;
import me.moderator_man.coffee.impl.textures.Texture;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;

public abstract class CoffeeItem extends Item implements ICoffeeItem
{
	protected static CoffeeLoader loader = CoffeeLoader.getCoffeeLoader();
	
	private Texture texture;
	
	public CoffeeItem(Texture texture, int id)
	{
		super(id);
		this.texture = texture;
	}
	
	public boolean onItemUse(ItemStack itemstack, EntityPlayer entityplayer, World world, int i, int j, int k, int l)
	{
		onUse();
		return false;
	}
	
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
    {
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

	
	public void onAttack() {}
	public void onUse() {}
	public void onHitEntity() {}
	public void onHitBlock(int x, int y, int z) {}
	
	public Texture getTexture()
	{
		return texture;
	}
	
	public void onDrop() {}
	
	public void onPickup() {}
	
	public void onCrafted() {}
}
