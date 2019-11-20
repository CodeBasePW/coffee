package me.moderator_man.coffee.impl.player;

import me.moderator_man.coffee.api.player.ICoffeePlayer;
import me.moderator_man.coffee.impl.item.CoffeeItem;
import net.minecraft.src.EntityLiving;

public abstract class CoffeePlayer implements ICoffeePlayer
{
	private String username;
	private int health;
	
	public CoffeePlayer(String username)
	{
		this.username = username;
		this.health = 20;
	}
	
	public String getUsername()
	{
		return username;
	}
	
	public int getHealth()
	{
		return health;
	}
	
	public void setHealth(int health)
	{
		this.health = health;
	}
	
	public void onDeath() {}
	public void onRespawn() {}
	public void onDamaged() {}
	public void onAttackEntity(EntityLiving entity, CoffeeItem item) {}
	public void onDropItem(CoffeeItem item) {}
	public void onUseItem(CoffeeItem item) {}
	public boolean canAttackEntity(EntityLiving entity) { return false; }
}
