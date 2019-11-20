package me.moderator_man.coffee.impl.item;

import me.moderator_man.coffee.CoffeeLoader;
import me.moderator_man.coffee.api.item.ICoffeeItem;
import me.moderator_man.coffee.impl.textures.Texture;
import net.minecraft.src.Item;

public abstract class CoffeeItem extends Item implements ICoffeeItem
{
	protected static CoffeeLoader loader = CoffeeLoader.getCoffeeLoader();
	
	private Texture texture;
	
	public CoffeeItem(Texture texture, int id)
	{
		super(id);
		this.texture = texture;
	}
	
	public void onAttack() {}
	public void onUse() {}
	
	public Texture getTexture()
	{
		return texture;
	}
	
	public void onDrop() {}
	
	public void onPickup() {}
	
	public void onCrafted() {}
}
