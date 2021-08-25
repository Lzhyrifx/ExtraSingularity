package com.zeng.item;

import com.zeng.Main;
import net.minecraft.item.Item;

public class ShadowiumSingularity extends Item {
    public ShadowiumSingularity(){
        super();
        this.setRegistryName("ShadowiumSingularity");
        this.setUnlocalizedName(Main.MOD_ID+".ShadowiumSingularity");
        this.setMaxStackSize(64);
    }
}
