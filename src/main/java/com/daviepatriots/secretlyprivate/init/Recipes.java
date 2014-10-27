package com.daviepatriots.secretlyprivate.init;


import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;



public class Recipes
{
    public  static void init()
    {
        GameRegistry.addRecipe(new ItemStack(ModItems.meatyDonger), " d ", " d ", "ddd", 'd', new ItemStack(Items.rotten_flesh));

    }
}
