package com.ali.space.objects.blocks.machines.press;

import java.util.Map;
import java.util.Map.Entry;

import com.ali.space.init.BlockInit;
import com.ali.space.init.ItemInit;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class HydraulicPressRecipes {
	private static final HydraulicPressRecipes INSTANCE = new HydraulicPressRecipes();
	private final Table<ItemStack, ItemStack, ItemStack> pressingList = HashBasedTable.<ItemStack, ItemStack, ItemStack>create();
	private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();
	
	public static HydraulicPressRecipes getInstance()
	{
		return INSTANCE;
	}
	
	private HydraulicPressRecipes() 
	{
		addPressingRecipe(new ItemStack(Blocks.PISTON), new ItemStack(ItemInit.INOX_INGOT), new ItemStack(BlockInit.PYROWENE_ORE), 5.0F);
	}

	
	public void addPressingRecipe(ItemStack input1, ItemStack input2, ItemStack result, float experience) 
	{
		if(getPressingResult(input1, input2) != ItemStack.EMPTY) return;
		this.pressingList.put(input1, input2, result);
		this.experienceList.put(result, Float.valueOf(experience));
	}
	
	public ItemStack getPressingResult(ItemStack input1, ItemStack input2) 
	{
		for(Entry<ItemStack, Map<ItemStack, ItemStack>> entry : this.pressingList.columnMap().entrySet()) 
		{
			if(this.compareItemStacks(input1, (ItemStack)entry.getKey())) 
			{
				for(Entry<ItemStack, ItemStack> ent : entry.getValue().entrySet()) 
				{
					if(this.compareItemStacks(input2, (ItemStack)ent.getKey())) 
					{
						return (ItemStack)ent.getValue();
					}
				}
			}
		}
		return ItemStack.EMPTY;
	}
	
	private boolean compareItemStacks(ItemStack stack1, ItemStack stack2)
	{
		return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
	}
	
	public Table<ItemStack, ItemStack, ItemStack> getDualSmeltingList() 
	{
		return this.pressingList;
	}
	
	public float getPressingExperience(ItemStack stack)
	{
		for (Entry<ItemStack, Float> entry : this.experienceList.entrySet()) 
		{
			if(this.compareItemStacks(stack, (ItemStack)entry.getKey())) 
			{
				return ((Float)entry.getValue()).floatValue();
			}
		}
		return 0.0F;
	}
}
