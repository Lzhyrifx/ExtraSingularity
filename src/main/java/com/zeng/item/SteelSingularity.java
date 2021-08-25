package com.zeng.item;

import com.zeng.Main;
import net.minecraft.item.Item;

public class SteelSingularity extends Item {
    public SteelSingularity(){
        super();
        this.setRegistryName("steelsingularity");
        this.setUnlocalizedName(Main.MOD_ID+".SteelSingularity");
        this.setMaxStackSize(64);
    }
}
