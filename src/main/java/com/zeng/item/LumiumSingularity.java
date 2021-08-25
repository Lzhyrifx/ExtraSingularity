package com.zeng.item;

import com.zeng.Main;
import net.minecraft.item.Item;

public class LumiumSingularity extends Item {
    public LumiumSingularity(){
        super();
        this.setRegistryName("lumiumsingularity");
        this.setUnlocalizedName(Main.MOD_ID+".LumiumSingularity");
        this.setMaxStackSize(64);
    }
}
