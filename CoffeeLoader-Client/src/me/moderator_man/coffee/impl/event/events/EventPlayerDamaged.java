package me.moderator_man.coffee.impl.event.events;

import me.moderator_man.coffee.impl.entity.CoffeePlayer;
import me.moderator_man.coffee.impl.event.Event;
import me.moderator_man.coffee.impl.event.Type;

public class EventPlayerDamaged extends Event
{
	public CoffeePlayer player;
	public int damage;
	
	public EventPlayerDamaged(CoffeePlayer player, int damage)
	{
		super(Type.PRE);
		this.player = player;
		this.damage = damage;
	}
}
