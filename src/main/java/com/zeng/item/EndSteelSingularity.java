package com.zeng.item;

import com.zeng.Main;
import net.minecraft.item.Item;

public class EndSteelSingularity extends Item {
    public EndSteelSingularity(){
        super();
        this.setRegistryName("endsteelsingularity");
        this.setUnlocalizedName(Main.MOD_ID+".EndSteelSingularity");
        this.setMaxStackSize(64);
    }
}
