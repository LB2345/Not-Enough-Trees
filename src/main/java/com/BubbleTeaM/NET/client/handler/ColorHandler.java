package com.BubbleTeaM.NET.client.handler;

import com.BubbleTeaM.NET.NETMod;
import com.BubbleTeaM.NET.common.block.NETBlocks;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = NETMod.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ColorHandler
{
    @SubscribeEvent
    public static void registerItemColors(ColorHandlerEvent.Item event)
    {
        event.getItemColors().register((stack, tintIndex) -> {
                    BlockState state = ((BlockItem)stack.getItem()).getBlock().defaultBlockState();
                    return event.getBlockColors().getColor(state, null, null, tintIndex); },
                NETBlocks.POPLAR_LEAVES.get());
    }

    @SubscribeEvent
    public static void registerBlockColors(ColorHandlerEvent.Block event)
    {
        //Foliage Coloring
        event.getBlockColors().register((state, world, pos, tintIndex) ->
                        world != null && pos != null ? BiomeColors.getAverageFoliageColor(world, pos) : FoliageColor.getDefaultColor(),
                NETBlocks.POPLAR_LEAVES.get());
    }
}