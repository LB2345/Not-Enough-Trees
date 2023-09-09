package com.BubbleTeaM.NET.common.block.entity;

import com.BubbleTeaM.NET.NETMod;
import com.BubbleTeaM.NET.common.block.NETBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class NETBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, NETMod.MOD_ID);


    public static final RegistryObject<BlockEntityType<NETSignBlockEntity>> SIGN_BLOCK_ENTITIES =
            BLOCK_ENTITIES.register("sign_block_entity", () ->
                    BlockEntityType.Builder.of(NETSignBlockEntity::new,
                            NETBlocks.POPLAR_WALL_SIGN.get(),
                            NETBlocks.POPLAR_SIGN.get(),
                            NETBlocks.ENDBURST_WALL_SIGN.get(),
                            NETBlocks.ENDBURST_SIGN.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
