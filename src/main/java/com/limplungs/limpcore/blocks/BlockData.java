package com.limplungs.limpcore.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import com.limplungs.limpcore.LimpCore;

public class BlockData 
{
	protected float hardness = 0.0F;
	protected float resistance = 0.0F;
	protected String tool = "pickaxe";
	protected int level = 0;
	
	protected String name = "NewBlock";
	protected String unlocalizedName = (LimpCore.MODID + "_" + name);
	protected Material material = Material.ROCK;
	protected CreativeTabs creativeTab = LimpCore.tabLimpCore;
	
	public BlockData(String name, String modname, float hard, float resist, String tool, int level, Material mat, CreativeTabs tab)
	{
		this.hardness = hard;
		this.resistance = resist;
		this.tool = tool;
		this.level = level;
		this.name = name;
		this.material = mat;
		this.creativeTab = tab;
		
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
