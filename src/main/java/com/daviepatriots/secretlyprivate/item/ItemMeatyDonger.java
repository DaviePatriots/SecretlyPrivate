package com.daviepatriots.secretlyprivate.item;


import com.daviepatriots.secretlyprivate.creativetab.CreativeTabSP;
import com.daviepatriots.secretlyprivate.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;


import java.util.List;


public class ItemMeatyDonger extends ItemFood
{

    public ItemMeatyDonger()
    {
        super(4, 1.0F, false);   //(Hunger_Shanks/2, Saturation_Multiplier, Will_Wolf_Eat?)
        this.setUnlocalizedName("meatyDonger");
        this.setMaxDamage(0);
        this.setMaxStackSize(64);
        canRepair = false;
        this.setCreativeTab(CreativeTabSP.LMRB_TAB);
    }


    //Localization Override


    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }


    protected  String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }


    //Sets Time to Eat
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
