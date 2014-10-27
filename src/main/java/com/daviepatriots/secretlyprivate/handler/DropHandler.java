package com.daviepatriots.secretlyprivate.handler;


import com.daviepatriots.secretlyprivate.init.ModItems;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

import java.util.Random;

public class DropHandler
{
    public static Random random;
    public static int dropped;

    @SubscribeEvent
    public void onEntityDrop(LivingDropsEvent event)
    {
        random = new Random();
        dropped = random.nextInt(2) + 1;

        if(event.entityLiving instanceof EntityZombie)
        {
            event.entityLiving.entityDropItem(new ItemStack(ModItems.meatyDonger), dropped);
        }

    }

}