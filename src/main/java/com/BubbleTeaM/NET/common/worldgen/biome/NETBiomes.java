package com.BubbleTeaM.NET.common.worldgen.biome;

import com.BubbleTeaM.NET.NETMod;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;

public class NETBiomes {
    public static final ResourceKey<Biome> EBONY_GROVE = register("ebony_grove");
    public static final ResourceKey<Biome> POPLAR_VALLEY = register("poplar_valley");

    private static ResourceKey<Biome> register(String name)
    {
        return ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation(NETMod.MOD_ID, name));
    }
}
