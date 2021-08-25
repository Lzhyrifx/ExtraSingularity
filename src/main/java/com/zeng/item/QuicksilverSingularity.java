package com.zeng.item;

import com.zeng.Main;
import net.minecraft.item.Item;

public class QuicksilverSingularity extends Item {
    public QuicksilverSingularity(){
        super();
        this.setRegistryName("quicksilversingularity");
        this.setUnlocalizedName(Main.MOD_ID+".QuicksilverSingularity");
        this.setMaxStackSize(64);
    }
}
