package com.zeng.item;

import com.zeng.Main;
import net.minecraft.item.Item;

public class SignalumSingularity extends Item {
    public SignalumSingularity(){
        super();
        this.setRegistryName("signalumsingularity");
        this.setUnlocalizedName(Main.MOD_ID+".SignalumSingularity");
        this.setMaxStackSize(64);
    }
}
