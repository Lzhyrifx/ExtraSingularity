package com.zeng.item;

import com.zeng.Main;
import net.minecraft.item.Item;

public class AlubrassSingularity extends Item {
    public AlubrassSingularity(){
        super();
        this.setRegistryName("alubrasssingularity");
        this.setUnlocalizedName(Main.MOD_ID+".AlubrassSingularity");
        this.setMaxStackSize(64);
    }
}
