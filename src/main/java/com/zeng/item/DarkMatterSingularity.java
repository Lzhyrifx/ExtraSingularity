package com.zeng.item;

import com.zeng.Main;
import net.minecraft.item.Item;

public class DarkMatterSingularity extends Item {
    public DarkMatterSingularity(){
        super();
        this.setRegistryName("darkmattersingularity");
        this.setUnlocalizedName(Main.MOD_ID+".DarkMatterSingularity");
        this.setMaxStackSize(64);
    }
}
