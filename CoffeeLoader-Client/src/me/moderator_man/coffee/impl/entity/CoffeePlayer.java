package me.moderator_man.coffee.impl.entity;

import me.moderator_man.coffee.api.entity.ICoffeePlayer;
import me.moderator_man.coffee.impl.event.events.EventPlayerDamaged;
import me.moderator_man.coffee.impl.event.events.EventPlayerDeath;
import me.moderator_man.coffee.impl.event.events.EventPlayerRespawn;
import net.minecraft.client.Minecraft;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityPlayer;

public abstract class CoffeePlayer extends EntityPlayer implements ICoffeePlayer
{
	private String username;
	
	public CoffeePlayer(String username)
	{
		super(Minecraft.getMinecraft().theWorld);
		this.username = username;
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
	
	public void sendMessage(String message)
	{
		//TODO: the server implementation would be a little different, but because this is the client-side, we simply add the message to their chat box.
		Minecraft.getMinecraft().ingameGUI.addChatMessage(message);
	}
	
	public void onUpdate() {}
	
	public void onLivingUpdate() {}
	
	public void onDeath(Entity entity)
	{
		EventPlayerDeath event = new EventPlayerDeath(this);
		event.call();
		if (!event.isCancelled())
			super.onDeath(entity);
	}
	
	public void onRespawn()
	{
		new EventPlayerRespawn(this).call();
	}
	
	public void damageEntity(int damage)
	{
		EventPlayerDamaged event = new EventPlayerDamaged(this, damage);
		event.call();
		if (!event.isCancelled())
			super.damageEntity(damage);
	}
}
