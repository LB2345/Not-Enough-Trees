package com.BubbleTeaM.NET.common.entity;

import com.BubbleTeaM.NET.NETMod;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class NETEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, NETMod.MOD_ID);


    public static final RegistryObject<EntityType<NETBoat>> BOAT = createEntity("boat", EntityType.Builder.<NETBoat>of(NETBoat::new, MobCategory.MISC).sized(1.375F, 0.5625F));


    public static <E extends Entity> RegistryObject<EntityType<E>> createEntity(String id, EntityType.Builder<E> entityType) {
        return ENTITIES.register(id, () -> entityType.build(NETMod.MOD_ID + ":" + id));
    }
    public static void register(IEventBus eventBus) {
        ENTITIES.register(eventBus);
    }
}
