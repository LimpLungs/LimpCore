package com.limplungs.limpcore.items;

import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import com.limplungs.limpcore.LimpCore;

public class ItemList 
{
	/**
	 *  Item Data
	 */
	private static ItemData dataDustCarbon = new ItemData(64, LimpCore.tabLimpCore, "dustCarbon");
	
	
	/**
	 *  Items
	 */
	public static ItemBasic dustCarbon;
	
	
	/**
	 *  Items Registry
	 *  Registered during the 'preInit' stage.
	 */
	public static void registerItems()
	{
		dustCarbon = new ItemBasic(dataDustCarbon);
	}

	
	/**
	 *  Items Renderer
	 *  @param renderItem - RenderItem passed in to render items during 'init' stage.
	 */
	public static void renderItems(RenderItem renderItem) 
	{
		renderItem.getItemModelMesher().register(dustCarbon, 0, new ModelResourceLocation(LimpCore.MODID + ":" + dustCarbon.getName(), "inventory"));	
	}
}
