package com.modding_journeys.examplemod;

import net.fabricmc.api.ModInitializer;

public class ExampleModFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {

        ExampleMod.init();
    }
}
