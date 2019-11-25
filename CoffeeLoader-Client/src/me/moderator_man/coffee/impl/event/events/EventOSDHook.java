package me.moderator_man.coffee.impl.event.events;

import me.moderator_man.coffee.impl.event.Event;
import me.moderator_man.coffee.impl.event.Type;

public class EventOSDHook extends Event
{
	public EventOSDHook()
	{
		super(Type.PRE);
	}
}
