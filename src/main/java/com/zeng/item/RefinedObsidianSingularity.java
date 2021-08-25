package com.zeng.item;

import com.zeng.Main;
import net.minecraft.item.Item;

public class RefinedObsidianSingularity extends Item {
    public RefinedObsidianSingularity(){
        super();
        this.setRegistryName("refinedobsidiansingularity");
        this.setUnlocalizedName(Main.MOD_ID+".RefinedObsidianSingularity");
        this.setMaxStackSize(64);
    }
}
