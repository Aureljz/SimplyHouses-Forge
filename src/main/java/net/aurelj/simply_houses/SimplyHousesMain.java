package net.aurelj.simply_houses;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("simply_houses")
public class SimplyHousesMain
{
    public SimplyHousesMain()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    }
}
