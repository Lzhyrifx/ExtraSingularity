package com.zeng.item;

import com.zeng.Main;
import net.minecraft.item.Item;

public class EnergeticAlloySingularity extends Item {
    public EnergeticAlloySingularity(){
        super();
        this.setRegistryName("energeticalloysingularity");
        this.setUnlocalizedName(Main.MOD_ID+".EnergeticAlloySingularity");
        this.setMaxStackSize(64);
    }
}
