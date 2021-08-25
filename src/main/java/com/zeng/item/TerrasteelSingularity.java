package com.zeng.item;

import com.zeng.Main;
import net.minecraft.item.Item;

public class TerrasteelSingularity extends Item {
    public TerrasteelSingularity(){
        super();
        this.setRegistryName("terrasteelsingularity");
        this.setUnlocalizedName(Main.MOD_ID+".TerrasteelSingularity");
        this.setMaxStackSize(64);
    }
}
