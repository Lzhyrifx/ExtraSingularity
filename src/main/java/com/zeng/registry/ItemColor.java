package com.zeng.registry;

import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;

public class ItemColor implements IItemColor{
    @Override
    public int colorMultiplier(@Nonnull ItemStack stack, int tintIndex) {
        return color;
    }
    ItemColor(int color){
        this.color=color;
    }
    private final int color;
}
