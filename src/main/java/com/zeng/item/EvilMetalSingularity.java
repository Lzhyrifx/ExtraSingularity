package com.zeng.item;

import com.zeng.Main;
import net.minecraft.item.Item;

public class EvilMetalSingularity extends Item {
    public EvilMetalSingularity(){
        super();
        this.setRegistryName("evilmetalsingularity");
        this.setUnlocalizedName(Main.MOD_ID+".EvilMetalSingularity");
        this.setMaxStackSize(64);
    }
}
