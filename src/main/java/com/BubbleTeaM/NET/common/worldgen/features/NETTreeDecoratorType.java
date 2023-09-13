package com.BubbleTeaM.NET.common.worldgen.features;

import com.BubbleTeaM.NET.NETMod;
import com.mojang.serialization.Codec;
import net.minecraft.world.level.levelgen.feature.treedecorators.AlterGroundDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class NETTreeDecoratorType {
    public static final DeferredRegister<TreeDecoratorType<?>> TREE_DECORATOR_TYPES =
            DeferredRegister.create(ForgeRegistries.TREE_DECORATOR_TYPES, NETMod.MOD_ID);

    public static final RegistryObject<TreeDecoratorType<LichenDecorator>> LICHEN = register("lichen", LichenDecorator.CODEC);

    public static <P extends TreeDecorator> RegistryObject<TreeDecoratorType<P>> register(String name, Codec<P> codec) {
        return TREE_DECORATOR_TYPES.register(name, () ->  new TreeDecoratorType<>(codec));
    }

    public static void register(IEventBus eventBus) {
        TREE_DECORATOR_TYPES.register(eventBus);
    }
}
