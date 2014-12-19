package com.amccloy.letsMod;

import com.amccloy.letsMod.configuration.ConfigurationHandler;
import com.amccloy.letsMod.proxy.IProxy;
import com.amccloy.letsMod.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.MOD_VERSION)
public class letsMod {

    @Mod.Instance(Reference.MOD_ID)
    public static letsMod instance;

    @SidedProxy(clientSide=Reference.CLIENT_PROXY_CLASS, serverSide=Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    //Handle pre-initialisation
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        //init config handler with default suggested config file
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
    }

    //Handle initialisation
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    //Handle post init
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
