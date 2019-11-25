package me.moderator_man.coffee.api.inventory;

import net.minecraft.src.ItemStack;

public interface IInventory
{
	public abstract int getSizeInventory();
    public abstract ItemStack getStackInSlot(int i);
    public abstract ItemStack decrStackSize(int i, int j);
    public abstract void setInventorySlotContents(int i, ItemStack itemstack);
    public abstract String getInvName();
    public abstract int getInventoryStackLimit();
    public abstract void onInventoryChanged();
}
