package com.zeng.item;

import com.zeng.Main;
import net.minecraft.item.Item;

public class ElectrumSingularity extends Item {
    public ElectrumSingularity(){
        super();
        this.setRegistryName("electrumsingularity");
        this.setUnlocalizedName(Main.MOD_ID+".ElectrumSingularity");
        this.setMaxStackSize(64);
    }
}
