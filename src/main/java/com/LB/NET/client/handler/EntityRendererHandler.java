package com.BubbleTeaM.NET.client.handler;

import com.BubbleTeaM.NET.NETMod;
import com.BubbleTeaM.NET.client.model.NETModelLayers;
import com.BubbleTeaM.NET.client.render.NETBoatRenderer;
import com.BubbleTeaM.NET.common.block.entity.NETBlockEntities;
import com.BubbleTeaM.NET.common.block.entity.NETSignBlockEntity;
import com.BubbleTeaM.NET.common.entity.NETBoat;
import com.BubbleTeaM.NET.common.entity.NETEntities;
import net.minecraft.client.model.BoatModel;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = NETMod.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EntityRendererHandler
{
    @SubscribeEvent
    public static void onRegisterRenderers(EntityRenderersEvent.RegisterRenderers event) {
        // Register boat layer definitions
        LayerDefinition boatLayerDefinition = BoatModel.createBodyModel();

        for (NETBoat.Type type : NETBoat.Type.values()) {
            ForgeHooksClient.registerLayerDefinition(NETModelLayers.createNETBoatModelName(type), () -> boatLayerDefinition);
        }
        // Register block entity renderers
        event.registerBlockEntityRenderer((BlockEntityType<NETSignBlockEntity>)NETBlockEntities.SIGN_BLOCK_ENTITIES.get(), SignRenderer::new);

        // Register entity renderers
        event.registerEntityRenderer((EntityType<NETBoat>) NETEntities.BOAT.get(), NETBoatRenderer::new);
    }
}
