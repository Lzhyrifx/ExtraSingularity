package com.zeng.item;

import com.zeng.Main;
import net.minecraft.item.Item;

public class ConstantanSingularity extends Item {
    public ConstantanSingularity(){
        super();
        this.setRegistryName("constantansingularity");
        this.setUnlocalizedName(Main.MOD_ID+".ConstantanSingularity");
        this.setMaxStackSize(64);
    }
}
