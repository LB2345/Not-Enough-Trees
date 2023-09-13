package com.BubbleTeaM.NET.common.worldgen.biome;

import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class NETBiomeRegistry {
    @SubscribeEvent
    public static void registerBiomes(RegistryEvent.Register<Biome> event) {
        IForgeRegistry<Biome> registry = event.getRegistry();
        registry.register(NETOverworldBiomes.ebonyGrove().setRegistryName(NETBiomes.EBONY_GROVE.location()));
        registry.register(NETOverworldBiomes.poplarValley().setRegistryName(NETBiomes.POPLAR_VALLEY.location()));
    }
}
