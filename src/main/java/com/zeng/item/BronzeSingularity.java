package com.zeng.item;

import com.zeng.Main;
import net.minecraft.item.Item;

public class BronzeSingularity extends Item {
    public BronzeSingularity(){
        super();
        this.setRegistryName("bronzesingularity");
        this.setUnlocalizedName(Main.MOD_ID+".BronzeSingularity");
        this.setMaxStackSize(64);
    }
}
