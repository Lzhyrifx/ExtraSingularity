package com.zeng.item;

import com.zeng.Main;
import net.minecraft.item.Item;

public class MirionSingularity extends Item {
    public MirionSingularity(){
        super();
        this.setRegistryName("mirionsingularity");
        this.setUnlocalizedName(Main.MOD_ID+".MirionSingularity");
        this.setMaxStackSize(64);
    }
}
