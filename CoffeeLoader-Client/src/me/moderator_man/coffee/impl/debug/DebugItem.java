package me.moderator_man.coffee.impl.debug;

import me.moderator_man.coffee.impl.item.CoffeeItem;

public class DebugItem extends CoffeeItem
{
	public DebugItem()
	{
		super(loader.getTextureManager().getTexture("debug.debugItem"), 95);
		
		damage = 100;
	}
	
	public void onAttack() {}
	
	public void onUse() {}
}
