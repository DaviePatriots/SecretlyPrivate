package com.daviepatriots.secretlyprivate.item;



import com.daviepatriots.secretlyprivate.creativetab.CreativeTabSP;
import com.daviepatriots.secretlyprivate.reference.Reference;
import net.minecraft.item.ItemPickaxe;


public class ItemObsidiPick extends ItemPickaxe
{

    public ItemObsidiPick(ToolMaterial mat, String name)
    {
        super(mat);
        this.maxStackSize = 1;
        setCreativeTab(CreativeTabSP.LMRB_TAB);
        setUnlocalizedName(Reference.MOD_ID + ":" + "obsidiPick");


    }


}
