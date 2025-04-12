package com.luna.coisinhasmod.item;

import com.luna.coisinhasmod.CoisinhasMod;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModUtils {
    public static RegistryKey<Item> createRegKey(String path) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(CoisinhasMod.MOD_ID, path));
    }
    public static  Item.Settings createFoodSettings (String name, FoodComponent food) {
        return new Item.Settings()
                .food(food)
                .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(CoisinhasMod.MOD_ID, name)));
    }
}
