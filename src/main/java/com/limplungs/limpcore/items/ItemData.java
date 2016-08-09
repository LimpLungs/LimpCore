package com.limplungs.limpcore.items;

import com.limplungs.limpcore.LimpCore;

import net.minecraft.creativetab.CreativeTabs;

public class ItemData 
{
	protected int stackSize = 64;
	
	protected String name = "NewItem";
	protected String unlocalizedName = (LimpCore.MODID + "_" + name);
	protected CreativeTabs creativeTab = LimpCore.tabLimpCore;
	
	public ItemData(int stackSize, CreativeTabs tab, String name)
	{
		this.stackSize = stackSize;
		this.creativeTab = tab;
		this.name = name;
		this.unlocalizedName = (LimpCore.MODID + "_" + name);
	}
}
