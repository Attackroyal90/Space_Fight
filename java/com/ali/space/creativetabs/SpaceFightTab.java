package com.ali.space.creativetabs;

import com.ali.space.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class SpaceFightTab extends CreativeTabs{

	public SpaceFightTab(String label) {
		super(label);
		this.setBackgroundImageName(label+".png");
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ItemInit.FELDPATH_INGOT);
	}

}
