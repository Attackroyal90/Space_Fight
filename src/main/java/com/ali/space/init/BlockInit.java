package com.ali.space.init;

import java.util.ArrayList;
import java.util.List;

import com.ali.space.objects.blocks.BlockBasic;
import com.ali.space.objects.blocks.FeldpathOreMod;
import com.ali.space.objects.blocks.InoxOreMod;
import com.ali.space.objects.blocks.PyroweneOreMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class BlockInit {
	public static List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block MOON_ROCK = new BlockBasic("moon_rock", Material.ROCK);
	
	//Ores
	public static final Block FELDPATH_ORE = new FeldpathOreMod("feldpath_ore", Material.ROCK);
	public static final Block PYROWENE_ORE = new PyroweneOreMod("pyrowene_ore", Material.ROCK);
	public static final Block INOX_ORE = new InoxOreMod("inox_ore", Material.ROCK);
}
