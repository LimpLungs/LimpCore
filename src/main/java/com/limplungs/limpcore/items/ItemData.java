package com.limplungs.limpcore.items;

import com.limplungs.limpcore.LimpCore;

import net.minecraft.creativetab.CreativeTabs;

public class ItemData 
{
	protected int stackSize = 64;
	
	protected String name = "NewItem";
	protected String unlocalizedName = (LimpCore.MODID + "_" + name);
	protected CreativeTabs creativeTab = LimpCore.tabLimpCore;
	
	/*
	 * String modname - Mod.MODID
	 */
	public ItemData(String name, String modname, int stackSize, CreativeTabs tab)
	{
		this.stackSize = stackSize;
		this.creativeTab = tab;
		this.name = name;
		
		if (modname == null)
		{
			this.unlocalizedName = (LimpCore.MODID + "_" + name);
		}
		else
		{
			this.unlocalizedName = (modname + "_" + name);
		}
	}
}
