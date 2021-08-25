package com.zeng.item;

import com.zeng.Main;
import net.minecraft.item.Item;

public class WyvernMetalSingularity extends Item {
    public WyvernMetalSingularity(){
        super();
        this.setRegistryName("wyvernmetalsingularity");
        this.setUnlocalizedName(Main.MOD_ID+".WyvernMetalSingularity");
        this.setMaxStackSize(64);
    }
}
