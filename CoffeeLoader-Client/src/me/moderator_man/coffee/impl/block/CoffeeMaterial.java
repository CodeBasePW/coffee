package me.moderator_man.coffee.impl.block;

import net.minecraft.src.Material;

public class CoffeeMaterial extends Material
{
	public CoffeeMaterial()
    {
    }

    public boolean getIsLiquid()
    {
        return false;
    }

    public boolean func_878_a()
    {
        return true;
    }

    public boolean getCanBlockGrass()
    {
        return true;
    }

    public boolean func_880_c()
    {
        return true;
    }

    private CoffeeMaterial setBurning()
    {
        canBurn = true;
        return this;
    }

    public boolean getBurning()
    {
        return canBurn;
    }

    public static final CoffeeMaterial air = new CoffeeMaterialTransparent();
    public static final CoffeeMaterial ground = new CoffeeMaterial();
    public static final CoffeeMaterial wood = (new CoffeeMaterial()).setBurning();
    public static final CoffeeMaterial rock = new CoffeeMaterial();
    public static final CoffeeMaterial iron = new CoffeeMaterial();
    public static final CoffeeMaterial water = new CoffeeMaterialLiquid();
    public static final CoffeeMaterial lava = new CoffeeMaterialLiquid();
    public static final CoffeeMaterial leaves = (new CoffeeMaterial()).setBurning();
    public static final CoffeeMaterial plants = new CoffeeMaterialLogic();
    public static final CoffeeMaterial sponge = new CoffeeMaterial();
    public static final CoffeeMaterial cloth = (new CoffeeMaterial()).setBurning();
    public static final CoffeeMaterial fire = new CoffeeMaterialTransparent();
    public static final CoffeeMaterial sand = new CoffeeMaterial();
    public static final CoffeeMaterial circuits = new CoffeeMaterialLogic();
    public static final CoffeeMaterial glass = new CoffeeMaterial();
    public static final CoffeeMaterial tnt = (new CoffeeMaterial()).setBurning();
    public static final CoffeeMaterial unused = new CoffeeMaterial();
    public static final CoffeeMaterial ice = new CoffeeMaterial();
    public static final CoffeeMaterial snow = new CoffeeMaterialLogic();
    public static final CoffeeMaterial builtSnow = new CoffeeMaterial();
    public static final CoffeeMaterial cactus = new CoffeeMaterial();
    public static final CoffeeMaterial clay = new CoffeeMaterial();
    public static final CoffeeMaterial pumpkin = new CoffeeMaterial();
    public static final CoffeeMaterial field_4260_x = new CoffeeMaterial();
    private boolean canBurn;
}
