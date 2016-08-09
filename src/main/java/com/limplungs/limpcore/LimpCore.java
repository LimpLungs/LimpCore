package com.limplungs.limpcore;

import com.limplungs.limpcore.blocks.BlockList;
import com.limplungs.limpcore.items.ItemList;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
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
    	ItemList.registerItems();
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		if(event.getSide() == Side.CLIENT)
		{
			RenderItem renderer = Minecraft.getMinecraft().getRenderItem();

			BlockList.renderBlocks(renderer);
			ItemList.renderItems(renderer);
		}
	}
	
	public static CreativeTabs tabLimpCore = new CreativeTabs("tabLimpCore")
	{
		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem()
		{
			return ItemList.dustCarbon;
		}
	};
}
