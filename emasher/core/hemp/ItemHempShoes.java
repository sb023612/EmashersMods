package emasher.core.hemp;

import emasher.core.EmasherCore;
import emasher.core.CommonProxy;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.src.*;
import net.minecraftforge.common.*;

public class ItemHempShoes extends ItemArmor
{
	public ItemHempShoes(int par1, EnumArmorMaterial par2EnumArmorMaterial,
			int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
		
		this.setCreativeTab(EmasherCore.tabEmasher);
		//setIconIndex(64);
		setUnlocalizedName("hempShoes");
	}

	@Override
	public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, int layer)
	{
		return "emasher:hemp_1.png";
	}
	
	@Override
	public void registerIcons(IconRegister iconRegister)
	{
		itemIcon = iconRegister.registerIcon("emashercore:hempBoots");
	}
}
