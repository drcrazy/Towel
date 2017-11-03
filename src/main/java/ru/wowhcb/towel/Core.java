package ru.wowhcb.towel;

import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ru.wowhcb.towel.proxy.CommonProxy;

@Mod(modid = Core.MODID, version = Core.VERSION, name = Core.MODNAME)
public class Core
{
    public static final String MODID = "towel";
    public static final String MODNAME = "BTM Towel";
    public static final String VERSION = "1.0.0";
    
    @Mod.Instance
    public static Core instance;
    
    @SidedProxy(clientSide="ru.wowhcb.towel.proxy.ClientProxy", serverSide="ru.wowhcb.towel.proxy.ServerProxy")
    public static CommonProxy proxy;
    
    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
    	logger = e.getModLog();
    	proxy.preInit(e);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
    	proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
    	 proxy.postInit(e);
    }
}
