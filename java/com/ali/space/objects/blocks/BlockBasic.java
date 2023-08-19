package com.ali.space.objects.blocks;

import com.ali.space.SpaceFight_Main;
import com.ali.space.init.BlockInit;
import com.ali.space.init.ItemInit;
import com.ali.space.utils.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockBasic extends Block implements IHasModel{
	
	public BlockBasic(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(SpaceFight_Main.SpaceFightTab);
		setHardness(5.0F);
		setHarvestLevel(null, 2);
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(name));
	}

	public void registerModels() {
		SpaceFight_Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0);
	}

	@Override
	public boolean onEntityItemUpdate(World worldIn, EntityItem entityItem, EntityPlayer playerIn) {
		// TODO Auto-generated method stub
		return false;
	}

	public TileEntity createTileEntity(World worldIn, int meta) {
		// TODO Auto-generated method stub
		return null;
	}
}
