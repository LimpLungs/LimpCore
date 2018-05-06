package com.limplungs.limpcore.blocks;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import com.limplungs.limpcore.LimpCore;

public class BlockList 
{

	public static ArrayList<Block> BLOCKS = new ArrayList<Block>();
	public static ArrayList<ItemBlock> ITEMBLOCKS = new ArrayList<ItemBlock>();
	
	private static BlockData DATA_BLOCK_LIMPIUM;
	public static BlockBasic BLOCK_LIMPIUM;
	public static ItemBlock ITEMBLOCK_LIMPIUM;
	

	
	/**
	 *  BlockData Registry
	 *  Registered during the 'preInit' stage.
	 */
	public static void registerBlockData()
	{
		DATA_BLOCK_LIMPIUM = new BlockData("blocklimpium", LimpCore.MODID, 5F, 5F, "pickaxe", 2, Material.ROCK, LimpCore.tabLimpCore);
	}
	
	
	
	/**
	 *  Block Registry
	 *  Registered during the 'preInit' stage.
	 */
	public static void registerBlocks()
	{
		// copper hydroxyl carbonate (Malachite)
		BLOCKS.add(BLOCK_LIMPIUM = new BlockBasic(DATA_BLOCK_LIMPIUM));
	}

	
	
	/**
	 *  ItemBlock Registry
	 *  Registered during the 'preInit' stage.
	 */
	public static void registerItemBlocks()
	{
		ITEMBLOCKS.add(ITEMBLOCK_LIMPIUM = new ItemBlockBasic(BLOCK_LIMPIUM));
	}

	
	/**
	 *  Block Renderer
	 *  @param renderItem - RenderItem passed in to render items during 'init' stage.
	 */
	public static void renderBlocks(RenderItem renderItem) 
	{
		renderItem.getItemModelMesher().register(Item.getItemFromBlock(BLOCK_LIMPIUM), 0, new ModelResourceLocation(LimpCore.MODID + ":" + BLOCK_LIMPIUM.getName(), "inventory"));	
	}
}
