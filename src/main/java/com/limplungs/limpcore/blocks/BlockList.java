package com.limplungs.limpcore.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

import com.limplungs.limpcore.LimpCore;

public class BlockList 
{
	/**
	 *  BlockData
	 */
	private static BlockData dataBlockLimpium = new BlockData(5F, 5F, "pickaxe", 2, "blockLimpium", Material.ROCK, LimpCore.tabLimpCore);
	
	
	/**
	 *  Blocks
	 */
	public static BlockBasic blockLimpium;
	
	
	/**
	 *  Block Registry
	 *  Registered during the 'preInit' stage.
	 */
	public static void registerBlocks()
	{
		// copper hydroxyl carbonate (Malachite)
		blockLimpium = new BlockBasic(dataBlockLimpium);
	}

	
	/**
	 *  Block Renderer
	 *  @param renderItem - RenderItem passed in to render items during 'init' stage.
	 */
	public static void renderBlocks(RenderItem renderItem) 
	{
		renderItem.getItemModelMesher().register(Item.getItemFromBlock(blockLimpium), 0, new ModelResourceLocation(LimpCore.MODID + ":" + blockLimpium.getName(), "inventory"));	
	}
}
