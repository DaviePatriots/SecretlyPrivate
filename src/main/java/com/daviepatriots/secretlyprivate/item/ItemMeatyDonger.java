package com.daviepatriots.secretlyprivate.item;


import com.daviepatriots.secretlyprivate.creativetab.CreativeTabSP;
import com.daviepatriots.secretlyprivate.reference.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;


import java.util.List;


public class ItemMeatyDonger extends ItemFood
{

    public ItemMeatyDonger()
    {
        super(4, 1.0F, false);   //(Hunger_Shanks/2, Saturation_Multiplier, Will_Wolf_Eat?)
        this.setUnlocalizedName(Reference.MOD_ID + ":" + "meatyDonger");
        this.setMaxDamage(0);
        this.setMaxStackSize(64);
        canRepair = false;
        this.setCreativeTab(CreativeTabSP.LMRB_TAB);
        setTextureName(Reference.MOD_ID + ":" + "meatyDonger");
    }


    //Sets time it takes to eat
    @Override
    public int getMaxItemUseDuration(ItemStack par1ItemStack)
    {
        return 70;
    }

    //Adds tooltip
    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4)
    {
        list.add("You've got to be kidding me!");
    }


}
