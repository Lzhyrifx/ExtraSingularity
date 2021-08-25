package com.zeng.item;

import com.zeng.Main;
import net.minecraft.item.Item;

public class PigironSingularity extends Item {
    public PigironSingularity(){
        super();
        this.setRegistryName("pigironsingularity");
        this.setUnlocalizedName(Main.MOD_ID+".PigironSingularity");
        this.setMaxStackSize(64);
    }
}
