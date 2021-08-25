package com.zeng.item;

import com.zeng.Main;
import net.minecraft.item.Item;

public class SoulariumSingularity extends Item {
    public SoulariumSingularity(){
        super();
        this.setRegistryName("soulariumsingularity");
        this.setUnlocalizedName(Main.MOD_ID+".SoulariumSingularity");
        this.setMaxStackSize(64);
    }
}
