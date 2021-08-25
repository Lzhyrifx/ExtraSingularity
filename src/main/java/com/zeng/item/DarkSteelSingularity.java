package com.zeng.item;

import com.zeng.Main;
import net.minecraft.item.Item;

public class DarkSteelSingularity extends Item {
    public DarkSteelSingularity(){
        super();
        this.setRegistryName("darksteelsingularity");
        this.setUnlocalizedName(Main.MOD_ID+".DarkSteelSingularity");
        this.setMaxStackSize(64);
    }
}
