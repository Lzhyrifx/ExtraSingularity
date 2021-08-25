package com.zeng.item;

import com.zeng.Main;
import net.minecraft.item.Item;

public class EnderiumSingularity extends Item {
    public EnderiumSingularity(){
        super();
        this.setRegistryName("enderiumsingularity");
        this.setUnlocalizedName(Main.MOD_ID+".EnderiumSingularity");
        this.setMaxStackSize(64);
    }
}
