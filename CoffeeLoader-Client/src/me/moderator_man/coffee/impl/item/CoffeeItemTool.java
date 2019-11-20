package me.moderator_man.coffee.impl.item;

import me.moderator_man.coffee.api.item.ICoffeeItem;
import me.moderator_man.coffee.impl.block.CoffeeBlock;
import net.minecraft.src.Block;
import net.minecraft.src.ItemTool;

public abstract class CoffeeItemTool extends ItemTool implements ICoffeeItem
{
	public CoffeeItemTool(String texture, int id, int maxDamage, int ingredientQuality, Block blocksEffectiveAgainst[])
	{
		super(id, maxDamage, ingredientQuality, blocksEffectiveAgainst);
		hasCustomSheet = true;
		customSheet = texture;
	}
	
	public void onAttack() {}
	public void onUse() {}
	public void onHitEntity() {}
	public void onHitBlock(int x, int y, int z) {}
	public void onDrop() {}
	public void onPickup() {}
	public void onCrafted() {}
	
	public boolean canHarvestBlock(CoffeeBlock block) { return false; }
}
