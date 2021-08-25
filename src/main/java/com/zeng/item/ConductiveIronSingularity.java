package com.zeng.item;

import com.zeng.Main;
import net.minecraft.item.Item;

public class ConductiveIronSingularity extends Item {
    public ConductiveIronSingularity(){
        super();
        this.setRegistryName("conductiveironsingularity");
        this.setUnlocalizedName(Main.MOD_ID+".ConductiveIronSingularity");
        this.setMaxStackSize(64);
    }
}
