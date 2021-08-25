package com.zeng.item;

import com.zeng.Main;
import net.minecraft.item.Item;

public class ElementiumSingularity extends Item {
    public ElementiumSingularity(){
        super();
        this.setRegistryName("elementiumsingularity");
        this.setUnlocalizedName(Main.MOD_ID+".ElementiumSingularity");
        this.setMaxStackSize(64);
    }
}
