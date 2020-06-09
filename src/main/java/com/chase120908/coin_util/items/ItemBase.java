package com.chase120908.coin_util.items;

import com.chase120908.coin_util.Main;
import com.chase120908.coin_util.init.ModItems;
import com.chase120908.coin_util.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{
	public ItemBase (String name) 
	{
		setUnlocalizedName (name);
		setRegistryName (name);
		setCreativeTab(CreativeTabs.MISC);
		
		ModItems.ITEMS.add(this); 
	}
	
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "Inventory");
	}
}
