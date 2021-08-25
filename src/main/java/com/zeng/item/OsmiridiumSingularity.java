package com.zeng.item;

import com.zeng.Main;
import net.minecraft.item.Item;

public class OsmiridiumSingularity extends Item {
    public OsmiridiumSingularity(){
        super();
        this.setRegistryName("osmiridiumsingularity");
        this.setUnlocalizedName(Main.MOD_ID+".OsmiridiumSingularity");
        this.setMaxStackSize(64);
    }
}
