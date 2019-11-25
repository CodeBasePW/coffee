package me.moderator_man.coffee.impl.entity;

import me.moderator_man.coffee.api.entity.ICoffeeEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.src.EntityLiving;

public class CoffeeEntity extends EntityLiving implements ICoffeeEntity
{
	public CoffeeEntity()
	{
		super(Minecraft.getMinecraft().theWorld);
	}
	
	public boolean canBeCollidedWith()
	{
		return isCollidable();
	}
	
	public boolean canBePushed()
	{
		return isPushable();
	}
	
	public boolean isCollidable()
	{
		return !isDead;
	}
	
	public boolean isPushable()
	{
		return !isDead;
	}
	
	public void eventUpdate() {}
	public void eventEntityUpdate() {}
}
