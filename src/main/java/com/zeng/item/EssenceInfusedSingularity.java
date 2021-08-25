package com.zeng.item;

import com.zeng.Main;
import net.minecraft.item.Item;

public class EssenceInfusedSingularity extends Item {
    public EssenceInfusedSingularity(){
        super();
        this.setRegistryName("essenceinfusedsingularity");
        this.setUnlocalizedName(Main.MOD_ID+".EssenceInfusedSingularity");
        this.setMaxStackSize(64);
    }
}
