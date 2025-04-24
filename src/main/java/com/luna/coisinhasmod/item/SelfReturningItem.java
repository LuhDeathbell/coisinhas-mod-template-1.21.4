package com.luna.coisinhasmod.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class SelfReturningItem extends Item {
    public SelfReturningItem(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack getRecipeRemainder(ItemStack stack) {
        return stack.copy();
    }


}
