package com.zeng.item;

import com.zeng.Main;
import net.minecraft.item.Item;

public class BoundSingularity extends Item {
    public BoundSingularity(){
        super();
        this.setRegistryName("boundsingularity");
        this.setUnlocalizedName(Main.MOD_ID+".BoundSingularity");
        this.setMaxStackSize(64);
    }
}
