package com.zeng.item;

import com.zeng.Main;
import net.minecraft.item.Item;

public class EnchantedMetalSingularity extends Item {
    public EnchantedMetalSingularity(){
        super();
        this.setRegistryName("enchantedmetalsingularity");
        this.setUnlocalizedName(Main.MOD_ID+".EnchantedMetalSingularity");
        this.setMaxStackSize(64);
    }
}
