package me.moderator_man.coffee.impl.event.events;

import me.moderator_man.coffee.impl.entity.CoffeePlayer;
import me.moderator_man.coffee.impl.event.Event;
import me.moderator_man.coffee.impl.event.Type;

public class EventPlayerDeath extends Event
{
	public CoffeePlayer player;
	
	public EventPlayerDeath(CoffeePlayer player)
	{
		super(Type.PRE);
		this.player = player;
	}
}
