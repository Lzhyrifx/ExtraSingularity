package com.zeng.item;

import com.zeng.Main;
import net.minecraft.item.Item;

public class ElectricalSteelSingularity extends Item {
    public ElectricalSteelSingularity(){
        super();
        this.setRegistryName("ElectricalSteelSingularity");
        this.setUnlocalizedName(Main.MOD_ID+".ElectricalSteelSingularity");
        this.setMaxStackSize(64);
    }
}
