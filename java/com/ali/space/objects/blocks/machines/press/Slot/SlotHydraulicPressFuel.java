package com.ali.space.objects.blocks.machines.press.Slot;

import com.ali.space.objects.blocks.machines.press.TileEntityHydraulicPress;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotHydraulicPressFuel extends Slot{
	
	public SlotHydraulicPressFuel(IInventory inventory, int index, int x, int y) {
		super(inventory, index, x, y);
	}
	
	@Override
	public boolean isItemValid(ItemStack stack) {
		return TileEntityHydraulicPress.isItemFuel(stack);
	}
	
	@Override
	public int getItemStackLimit(ItemStack stack) {
		return super.getItemStackLimit(stack);
	}
}
