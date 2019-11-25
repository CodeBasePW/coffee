package me.moderator_man.coffee.api.entity;

public interface ICoffeeEntity
{
	public boolean isCollidable();
	public boolean isPushable();
	public void eventUpdate();
	public void eventEntityUpdate();
}
