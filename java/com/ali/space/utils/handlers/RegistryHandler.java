package com.ali.space.utils.handlers;

import com.ali.space.SpaceFight_Main;
import com.ali.space.commands.CommandTeleportDimension;
import com.ali.space.init.BiomeInit;
import com.ali.space.init.BlockInit;
import com.ali.space.init.DimensionInit;
import com.ali.space.init.ItemInit;
import com.ali.space.utils.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

@EventBusSubscriber
public class RegistryHandler {
	
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
	}

	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
		TileEntityHandler.regsiterTileEntities();
	}
	
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) {
		for(Item item : ItemInit.ITEMS) {
			if(item instanceof IHasModel) {
				((IHasModel)item).registerModels();
			}
		}
		
		for(Block block : BlockInit.BLOCKS) {
			if(block instanceof IHasModel) {
				((IHasModel)block).registerModels();
			}
		}
		
	}
	
	public static void preInitRegistries(FMLPreInitializationEvent event) {
		DimensionInit.registerDimensions();
		BiomeInit.registerBiomes();
	}
	
    public static void initRegistries(FMLInitializationEvent event) {
		RecipesHandler.RegisterRecipes();
		NetworkRegistry.INSTANCE.registerGuiHandler(SpaceFight_Main.instance, new GuiHandler());
	}
    
    public static void postInitRegistries(FMLPostInitializationEvent event) {
		
	}

	public static void serverRegistries(FMLServerStartingEvent event) {
		event.registerServerCommand(new CommandTeleportDimension());
		
	}
	
}
