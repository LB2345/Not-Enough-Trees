package com.BubbleTeaM.NET.common.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class NETCreativeModeTabs {
    public static final CreativeModeTab TAB_NET = new CreativeModeTab("tab_net") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(NETItems.POPLAR_SAPLING.get());
        }
    };
}
