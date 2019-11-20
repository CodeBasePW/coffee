package me.moderator_man.coffee.api.player;

import me.moderator_man.coffee.impl.item.CoffeeItem;
import net.minecraft.src.EntityLiving;

public interface ICoffeePlayer
{
	public String getUsername();
	
	public int getHealth();
	public void setHealth(int health);
	
	public void onDeath();
	public void onRespawn();
	public void onDamaged();
	public void onAttackEntity(EntityLiving entity, CoffeeItem item);
	public void onDropItem(CoffeeItem item);
	public void onUseItem(CoffeeItem item);
	public boolean canAttackEntity(EntityLiving entity);
}
