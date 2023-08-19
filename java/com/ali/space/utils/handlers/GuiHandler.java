package com.ali.space.utils.handlers;

import com.ali.space.objects.blocks.machines.press.ContainerHydraulicPress;
import com.ali.space.objects.blocks.machines.press.GuiHydraulicPress;
import com.ali.space.objects.blocks.machines.press.TileEntityHydraulicPress;
import com.ali.space.utils.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler{

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == Reference.GUI_HYDRAULIC_PRESS) return new ContainerHydraulicPress(player.inventory, (TileEntityHydraulicPress)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == Reference.GUI_HYDRAULIC_PRESS) return new GuiHydraulicPress(player.inventory, (TileEntityHydraulicPress)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}

}
