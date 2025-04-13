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

    public static final Item NATURAL_SANDWICH = registerItem("natural_sandwich", new Item(ModUtils.createFoodSettings("natural_sandwich", ModFoodComponents.NATURAL_SANDWICH)));
    public static final Item COXINHA = registerItem("coxinha", new Item(ModUtils.createFoodSettings("coxinha", ModFoodComponents.COXINHA)));
    public static final Item EMPTY_CAN = registerItem("empty_can", new Item(new Item.Settings().registryKey(ModUtils.createRegKey("empty_can"))));
    public static final Item GREEN_ENERGY_DRINK = registerItem("green_energy_drink", new Item(ModUtils.createPotionSettings("green_energy_drink", ModFoodComponents.GREEN_ENERGY_DRINK, ModConsumableComponents.GREEN_ENERGY_DRINK).useRemainder(EMPTY_CAN)));
    public static final Item BLUE_ENERGY_DRINK = registerItem("blue_energy_drink", new Item(ModUtils.createPotionSettings("blue_energy_drink", ModFoodComponents.BLUE_ENERGY_DRINK, ModConsumableComponents.BLUE_ENERGY_DRINK).useRemainder(EMPTY_CAN)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(CoisinhasMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CoisinhasMod.LOGGER.info("Registering Mod Items for " + CoisinhasMod.MOD_ID);

        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
        //    entries.add(NATURAL_SANDWICH);
        //});
    }
}
