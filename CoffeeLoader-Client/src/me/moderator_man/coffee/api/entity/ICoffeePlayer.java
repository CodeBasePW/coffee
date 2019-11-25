package me.moderator_man.coffee.api.entity;

public interface ICoffeePlayer
{
	public String getUsername();
	
	public int getHealth();
	public void setHealth(int health);
	public void sendMessage(String message);
	public void damage(int damage);
	public void kill();
	public void heal();
	public void heal(int health);
}
