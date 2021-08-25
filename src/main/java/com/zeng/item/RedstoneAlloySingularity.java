package com.zeng.item;

import com.zeng.Main;
import net.minecraft.item.Item;

public class RedstoneAlloySingularity extends Item {
    public RedstoneAlloySingularity(){
        super();
        this.setRegistryName("redstonealloysingularity");
        this.setUnlocalizedName(Main.MOD_ID+".RedstoneAlloySingularity");
        this.setMaxStackSize(64);
    }
}
