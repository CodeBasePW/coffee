package net.minecraft.src;
// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.ArrayList;
import java.util.List;

import me.moderator_man.coffee.CoffeeLoader;

public class Session
{

    public Session(String s, String s1)
    {
        inventory = s;
        field_6543_c = s1;
    }

    public static List registeredBlocksList;
    public String inventory;
    public String field_6543_c;
    public String field_6542_d;

    static 
    {
        registeredBlocksList = new ArrayList();
        registeredBlocksList.add(Block.stone);
        registeredBlocksList.add(Block.cobblestone);
        registeredBlocksList.add(Block.brick);
        registeredBlocksList.add(Block.dirt);
        registeredBlocksList.add(Block.planks);
        registeredBlocksList.add(Block.wood);
        registeredBlocksList.add(Block.leaves);
        registeredBlocksList.add(Block.torchWood);
        registeredBlocksList.add(Block.stairSingle);
        registeredBlocksList.add(Block.glass);
        registeredBlocksList.add(Block.cobblestoneMossy);
        registeredBlocksList.add(Block.sapling);
        registeredBlocksList.add(Block.plantYellow);
        registeredBlocksList.add(Block.plantRed);
        registeredBlocksList.add(Block.mushroomBrown);
        registeredBlocksList.add(Block.mushroomRed);
        registeredBlocksList.add(Block.sand);
        registeredBlocksList.add(Block.gravel);
        registeredBlocksList.add(Block.sponge);
        registeredBlocksList.add(Block.cloth);
        registeredBlocksList.add(Block.oreCoal);
        registeredBlocksList.add(Block.oreIron);
        registeredBlocksList.add(Block.oreGold);
        registeredBlocksList.add(Block.blockSteel);
        registeredBlocksList.add(Block.blockGold);
        registeredBlocksList.add(Block.bookShelf);
        registeredBlocksList.add(Block.tnt);
        registeredBlocksList.add(Block.obsidian);
        
        //TODO: moderator_man
        int moddedBlocks = CoffeeLoader.getCoffeeLoader().getBlockRegistry().getAllBlocks().size();
        registeredBlocksList.addAll(CoffeeLoader.getCoffeeLoader().getBlockRegistry().getAllBlocks());
        
        System.out.println((new StringBuilder()).append(registeredBlocksList.size()).append(" blocks registered (").append(moddedBlocks).append(" modded, ").append(registeredBlocksList.size() - moddedBlocks).append(" vanilla)"));
    }
}
