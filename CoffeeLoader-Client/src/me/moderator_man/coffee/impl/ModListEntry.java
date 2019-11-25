package me.moderator_man.coffee.impl;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import org.lwjgl.opengl.GL11;

import me.moderator_man.coffee.api.ICoffeeMod;
import net.minecraft.client.Minecraft;
import net.minecraft.src.TexturePackBase;
import net.minecraft.src.TexturePackDefault;

public class ModListEntry extends TexturePackBase
{
	private int texturePackName = -1;
	private BufferedImage field_6490_f;
	
	public ModListEntry(ICoffeeMod mod)
	{
		try
		{
			this.texturePackFileName = mod.getName();
			this.firstDescriptionLine = mod.getVersion();
			this.secondDescriptionLine = mod.getDescription();
			field_6490_f = ImageIO.read((TexturePackDefault.class).getResource("/pack.png"));
		} catch (Exception ex) {
			System.out.println(String.format("Exception loading mod entry for '%s': %s", mod.getName(), ex.getMessage()));
		}
	}
	
	public void func_6484_b(Minecraft minecraft)
    {
        if(field_6490_f != null)
        {
            minecraft.renderEngine.deleteTexture(texturePackName);
        }
    }

    public void func_6483_c(Minecraft minecraft)
    {
        if(field_6490_f != null && texturePackName < 0)
        {
            texturePackName = minecraft.renderEngine.allocateAndSetupTexture(field_6490_f);
        }
        if(field_6490_f != null)
        {
            minecraft.renderEngine.bindTexture(texturePackName);
        } else
        {
            GL11.glBindTexture(3553 /*GL_TEXTURE_2D*/ /*GL_TEXTURE_2D*/, minecraft.renderEngine.getTexture("/gui/unknown_pack.png"));
        }
    }
}
