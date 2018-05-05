package com.limplungs.limpcore.items;

import java.util.ArrayList;

import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

import com.limplungs.limpcore.LimpCore;

public class ItemList 
{
	public static ArrayList<Item> ITEMS = new ArrayList<Item>();
	
	private static ItemData DATA_DUST_CARBON;
	public static ItemBasic DUST_CARBON;
	
	
	
	public static void registerItemData()
	{
		// Items
		DATA_DUST_CARBON = new ItemData(64, LimpCore.tabLimpCore, "dustcarbon");
	}
	
	
	/**
	 *  Items Registry
	 *  Registered during the 'preInit' stage.
	 */
	public static void registerItems()
	{
		// Items
		ITEMS.add(DUST_CARBON = new ItemBasic(DATA_DUST_CARBON));
	}

	
	/**
	 *  Items Renderer
	 *  @param renderItem - RenderItem passed in to render items during 'init' stage.
	 */
	public static void renderItems(RenderItem renderItem) 
	{
		renderItem.getItemModelMesher().register(DUST_CARBON, 0, new ModelResourceLocation(LimpCore.MODID + ":" + DUST_CARBON.getName(), "inventory"));	
	}
}
