package com.zeng.item;

import com.zeng.Main;
import net.minecraft.item.Item;

public class InvarSingularity extends Item {
    public InvarSingularity(){
        super();
        this.setRegistryName("invarsingularity");
        this.setUnlocalizedName(Main.MOD_ID+".InvarSingularity");
        this.setMaxStackSize(64);
    }
}
