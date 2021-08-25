package com.zeng.item;

import com.zeng.Main;
import net.minecraft.item.Item;

public class ConstructionAlloySingularity extends Item {
    public ConstructionAlloySingularity(){
        super();
        this.setRegistryName("constructionalloysingularity");
        this.setUnlocalizedName(Main.MOD_ID+".ConstructionAlloySingularity");
        this.setMaxStackSize(64);
    }
}
