package com.zeng.item;

import com.zeng.Main;
import net.minecraft.item.Item;

public class EnergiumSingularity extends Item {
    public EnergiumSingularity(){
        super();
        this.setRegistryName("energiumsingularity");
        this.setUnlocalizedName(Main.MOD_ID+".EnergiumSingularity");
        this.setMaxStackSize(64);
    }
}
