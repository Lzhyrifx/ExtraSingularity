package com.zeng.item;

import com.zeng.Main;
import net.minecraft.item.Item;

public class RedMatterSingularity extends Item {
    public RedMatterSingularity(){
        super();
        this.setRegistryName("redmattersingularity");
        this.setUnlocalizedName(Main.MOD_ID+".RedMatterSingularity");
        this.setMaxStackSize(64);
    }
}
