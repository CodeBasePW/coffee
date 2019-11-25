package me.moderator_man.coffee.impl.item;

import me.moderator_man.coffee.api.item.ICoffeeItem;
import me.moderator_man.coffee.util.Util;
import net.minecraft.src.Block;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ItemTool;
import net.minecraft.src.World;

public abstract class CoffeeItemTool extends ItemTool implements ICoffeeItem
{
	public CoffeeItemTool(String texture, int id, int maxDamage, int ingredientQuality, int blocksEffectiveAgainst[])
	{
		super(id, maxDamage, ingredientQuality, Util.convertEffectiveBlocks(blocksEffectiveAgainst));
		hasCustomSheet = true;
		customSheet = texture;
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
	
	public void onAttack() {}
	public void onUse() {}
	public void onHitEntity() {}
	public void onHitBlock(int x, int y, int z) {}
	public void onDrop() {}
	public void onPickup() {}
	public void onCrafted() {}
	
	public boolean canHarvestBlock(Block block) { return canHarvestBlock(block.blockID); }
	
	public boolean canHarvestBlock(int blockID) { return false; }
}
