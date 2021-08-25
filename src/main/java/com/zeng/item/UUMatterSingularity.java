package com.zeng.item;

import com.zeng.Main;
import net.minecraft.item.Item;

public class UUMatterSingularity extends Item {
    public UUMatterSingularity(){
        super();
        this.setRegistryName("uumattersingularity");
        this.setUnlocalizedName(Main.MOD_ID+".UUMatterSingularity");
        this.setMaxStackSize(64);
    }
}
