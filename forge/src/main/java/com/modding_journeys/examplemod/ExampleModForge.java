package com.modding_journeys.examplemod;

import com.modding_journeys.ender_pearl_staff.core.registry.ModRegistryForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Constants.MOD_ID)
public class ExampleModForge {
    
    public ExampleModForge() {
    
        ExampleMod.init();

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModRegistryForge.register(modEventBus);
    }
}
