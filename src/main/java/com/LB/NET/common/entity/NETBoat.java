package com.BubbleTeaM.NET.common.entity;

import com.BubbleTeaM.NET.common.block.NETBlocks;
import com.BubbleTeaM.NET.common.item.NETItems;
import com.BubbleTeaM.NET.mixin.BoatAccess;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.Tag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundAddEntityPacket;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.IndirectEntityDamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.network.NetworkHooks;

import java.util.Arrays;

public class NETBoat extends Boat {
    private static final EntityDataAccessor<Integer> DATA_ID_TYPE = SynchedEntityData.defineId(NETBoat.class, EntityDataSerializers.INT);

    public NETBoat(EntityType<? extends Boat> p_i50129_1_, Level p_i50129_2_) {
        super(p_i50129_1_, p_i50129_2_);
        this.blocksBuilding = true;
    }

    public NETBoat(Level p_i1705_1_, double p_i1705_2_, double p_i1705_4_, double p_i1705_6_) {
        this(NETEntities.BOAT.get(), p_i1705_1_);
        this.setPos(p_i1705_2_, p_i1705_4_, p_i1705_6_);
        this.setDeltaMovement(Vec3.ZERO);
        this.xo = p_i1705_2_;
        this.yo = p_i1705_4_;
        this.zo = p_i1705_6_;
    }

    public Item getDropItem() {
        return switch (this.getModBoatType()) {
            case POPLAR -> NETItems.POPLAR_BOAT.get();
        };
    }

    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(DATA_ID_TYPE, Type.POPLAR.ordinal());
    }

    public void setType(Type pBoatType) {
        this.entityData.set(DATA_ID_TYPE, pBoatType.ordinal());
    }

    public Type getModBoatType() {
        return Type.byId(this.entityData.get(DATA_ID_TYPE));
    }

    public static enum Type {
        POPLAR(NETBlocks.POPLAR_PLANKS.get(), "poplar");

        private final String name;
        private final Block planks;

        private Type(Block p_i48146_3_, String p_i48146_4_) {
            this.name = p_i48146_4_;
            this.planks = p_i48146_3_;
        }

        public String getName() {
            return this.name;
        }

        public Block getPlanks() {
            return this.planks;
        }

        public String toString() {
            return this.name;
        }

        public static Type byId(int pId) {
            Type[] aboatentity$type = values();
            if (pId < 0 || pId >= aboatentity$type.length) {
                pId = 0;
            }

            return aboatentity$type[pId];
        }

        public static Type byName(String pName) {
            Type[] aboatentity$type = values();

            for(int i = 0; i < aboatentity$type.length; ++i) {
                if (aboatentity$type[i].getName().equals(pName)) {
                    return aboatentity$type[i];
                }
            }

            return aboatentity$type[0];
        }
    }

    @Override
    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }
}

