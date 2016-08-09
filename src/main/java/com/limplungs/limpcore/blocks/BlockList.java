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
	private static BlockData dataBlockBasic = new BlockData(5F, 5F, "pickaxe", 2, "blockBasic", Material.ROCK, LimpCore.tabLimpCore);
	
	
	/**
	 *  Blocks
	 */
	public static BlockBasic blockBasic;
	
	
	/**
	 *  Block Registry
	 */
	public static void registerBlocks()
	{
		blockBasic = new BlockBasic(dataBlockBasic);
	}

	
	/**
	 *  Block Renderer
	 *  @param renderItem - RenderItem passed in to render items during postInit stage.
	 */
	public static void renderBlocks(RenderItem renderItem) 
	{
		renderItem.getItemModelMesher().register(Item.getItemFromBlock(blockBasic), 0, new ModelResourceLocation(LimpCore.MODID + ":" + blockBasic.getName(), "inventory"));	
	}
}
