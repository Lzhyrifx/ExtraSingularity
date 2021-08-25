package com.zeng.item;

import com.zeng.Main;
import net.minecraft.item.Item;

public class VibrantAlloySingularity extends Item {
    public VibrantAlloySingularity(){
        super();
        this.setRegistryName("vibrantalloysingularity");
        this.setUnlocalizedName(Main.MOD_ID+".VibrantAlloySingularity");
        this.setMaxStackSize(64);
    }
}
