package com.daviepatriots.secretlyprivate.init;


import com.daviepatriots.secretlyprivate.item.ItemMeatyDonger;
import com.daviepatriots.secretlyprivate.reference.Names;
import com.daviepatriots.secretlyprivate.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemFood;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemMeatyDonger meatyDonger = new ItemMeatyDonger();

    public static void init()
    {
        GameRegistry.registerItem(meatyDonger, Names.Items.MEATY_DONGER);
    }
}


