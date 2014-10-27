package com.daviepatriots.secretlyprivate;

import com.daviepatriots.secretlyprivate.client.handler.KeyInputEventHandler;
import com.daviepatriots.secretlyprivate.handler.ConfigurationHandler;
import com.daviepatriots.secretlyprivate.handler.DropHandler;
import com.daviepatriots.secretlyprivate.init.ModItems;
import com.daviepatriots.secretlyprivate.init.Recipes;
import com.daviepatriots.secretlyprivate.proxy.IProxy;
import com.daviepatriots.secretlyprivate.reference.Reference;
import com.daviepatriots.secretlyprivate.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid= Reference.MOD_ID, name= Reference.MOD_NAME, version= Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)

public class SecretlyPrivate
{
    @Mod.Instance(Reference.MOD_ID)
    public static com.daviepatriots.secretlyprivate.SecretlyPrivate instance;

    @SidedProxy(clientSide= Reference.CLIENT_PROXY_CLASS, serverSide= Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance() .bus() .register(new ConfigurationHandler());

        proxy.registerKeyBindings();

        ModItems.init();

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());
        Recipes.init();
        MinecraftForge.EVENT_BUS.register(new DropHandler());


    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Complete!");
    }
}
