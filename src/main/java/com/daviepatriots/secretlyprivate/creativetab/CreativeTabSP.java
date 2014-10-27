package com.daviepatriots.secretlyprivate.creativetab;


import com.daviepatriots.secretlyprivate.init.ModItems;
import com.daviepatriots.secretlyprivate.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabSP
{
    public static final CreativeTabs LMRB_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.meatyDonger;
        }


    };

}
