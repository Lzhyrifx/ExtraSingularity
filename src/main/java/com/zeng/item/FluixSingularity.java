package com.zeng.item;

import com.zeng.Main;
import net.minecraft.item.Item;

public class FluixSingularity extends Item {
    public FluixSingularity(){
        super();
        this.setRegistryName("fluixsingularity");
        this.setUnlocalizedName(Main.MOD_ID+".FluixSingularity");
        this.setMaxStackSize(64);
    }
}
