package com.BubbleTeaM.NET.client.model;

import com.BubbleTeaM.NET.common.entity.NETBoat;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.resources.ResourceLocation;

public class NETModelLayers {

    private static ModelLayerLocation createLocation(String p_171301_, String p_171302_) {
        return new ModelLayerLocation(new ResourceLocation("net", p_171301_), p_171302_);
    }
    public static ModelLayerLocation createNETBoatModelName(NETBoat.Type p_171290_) {
        return createLocation("boat/" + p_171290_.getName(), "main");
    }
}
