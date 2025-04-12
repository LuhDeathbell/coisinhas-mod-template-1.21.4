package com.luna.coisinhasmod.item;

import com.luna.coisinhasmod.CoisinhasMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item NATURAL_SANDWICH = registerItem("natural_sandwich", new Item(new Item.Settings().food(ModFoodComponents.NATURAL_SANDWICH).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(CoisinhasMod.MOD_ID,"natural_sandwich")))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(CoisinhasMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CoisinhasMod.LOGGER.info("Registering Mod Items for " + CoisinhasMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(NATURAL_SANDWICH);
        });
    }
}
