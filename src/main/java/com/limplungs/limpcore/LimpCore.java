package com.limplungs.limpcore;

import com.limplungs.limpcore.blocks.BlockList;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = LimpCore.MODID, version = LimpCore.VERSION)
public class LimpCore
{
    public static final String MODID = "limpcore";
    public static final String VERSION = "2.0dev1"; 
    
    @EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
    	BlockList.registerBlocks();
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		if(event.getSide() == Side.CLIENT)
		{
			RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();

			BlockList.renderBlocks(renderItem);
		}
	}
	
	public static CreativeTabs tabLimpCore = new CreativeTabs("tabLimpCore")
	{
		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem()
		{
			return new ItemStack(Blocks.ANVIL).getItem();
		}
	};
}
