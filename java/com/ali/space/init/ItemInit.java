package com.ali.space.init;

import java.util.ArrayList;
import java.util.List;

import com.ali.space.objects.items.ItemBase;
import com.ali.space.objects.items.armor.ArmorMod;
import com.ali.space.objects.items.tools.ItemAxeMod;
import com.ali.space.objects.items.tools.ItemPickaxeMod;
import com.ali.space.objects.items.tools.ItemShovelMod;
import com.ali.space.objects.items.tools.ItemSwordMod;
import com.ali.space.utils.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit {
	public static List<Item> ITEMS = new ArrayList<Item>();
	
	//ToolMaterials
	public static final ToolMaterial FELDPATH_TOOL = EnumHelper.addToolMaterial("Space Tool", 5, 500, 25.0f, 5.0f, 10);
	public static final ToolMaterial PYROWENE_TOOL = EnumHelper.addToolMaterial("Space Tool", 6, 750, 30.0f, 6.5f, 15);
	
	//ArmorMaterials
	public static final ArmorMaterial PYROWENE_ARMOR = EnumHelper.addArmorMaterial("Space Armor", Reference.MODID + ":pyrowene", 100, new int[] {3, 6, 5, 2}, 18, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1.5f);
	
	//---Matériaux
	public static final Item FELDPATH_INGOT = new ItemBase("feldpath_ingot");
	public static final Item PYROWENE_CRYSTAL = new ItemBase("pyrowene_crystal");
	public static final Item SEAT = new ItemBase("seat");
	public static final Item INOX_INGOT = new ItemBase("inox_ingot");
	
	
	//---Outils
	//En feldpath
	public static final Item FELDPATH_PICKAXE = new ItemPickaxeMod("feldpath_pickaxe", FELDPATH_TOOL);
	public static final Item FELDPATH_SHOVEL = new ItemShovelMod("feldpath_shovel", FELDPATH_TOOL);
	public static final Item FELDPATH_AXE = new ItemAxeMod("feldpath_axe", FELDPATH_TOOL);
	public static final Item FELDPATH_SWORD = new ItemSwordMod("feldpath_sword", FELDPATH_TOOL);
	
	//En pyrowene
	public static final Item PYROWENE_PICKAXE = new ItemPickaxeMod("pyrowene_pickaxe", PYROWENE_TOOL);
	public static final Item PYROWENE_SHOVEL = new ItemShovelMod("pyrowene_shovel", PYROWENE_TOOL);
	public static final Item PYROWENE_AXE = new ItemAxeMod("pyrowene_axe", PYROWENE_TOOL);
	public static final Item PYROWENE_SWORD = new ItemSwordMod("pyrowene_sword", PYROWENE_TOOL);
	
	
	//---Armures
	//En pyrowene
	public static final Item PYROWENE_HELMET = new ArmorMod("pyrowene_helmet", PYROWENE_ARMOR, 1, EntityEquipmentSlot.HEAD);
	public static final Item PYROWENE_CHESTPLATE = new ArmorMod("pyrowene_chestplate", PYROWENE_ARMOR, 1, EntityEquipmentSlot.CHEST);
	public static final Item PYROWENE_LEGGINGS = new ArmorMod("pyrowene_leggings", PYROWENE_ARMOR, 2, EntityEquipmentSlot.LEGS);
	public static final Item PYROWENE_BOOTS = new ArmorMod("pyrowene_boots", PYROWENE_ARMOR, 1, EntityEquipmentSlot.FEET);
	
}
 