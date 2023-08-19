package com.ali.space;

import com.ali.space.creativetabs.SpaceFightTab;
import com.ali.space.proxy.CommonProxy;
import com.ali.space.utils.Reference;
import com.ali.space.utils.handlers.RegistryHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class SpaceFight_Main {
	
	@Instance
	public static SpaceFight_Main instance;
	
	
	public static final CreativeTabs SpaceFightTab = new SpaceFightTab("space");
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.SERVER)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		RegistryHandler.preInitRegistries(event);
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		RegistryHandler.initRegistries(event);
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		RegistryHandler.postInitRegistries(event);
	}
	
	@EventHandler
	public static void serverInit(FMLServerStartingEvent event) {
		RegistryHandler.serverRegistries(event);
	}
}
