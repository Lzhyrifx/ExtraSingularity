package com.zeng.item;

import com.zeng.Main;
import net.minecraft.item.Item;

public class AlumiteSingularity extends Item {
    public AlumiteSingularity(){
        super();
        this.setRegistryName("alumitesingularity");
        this.setUnlocalizedName(Main.MOD_ID+".AlumiteSingularity");
        this.setMaxStackSize(64);
    }
}
