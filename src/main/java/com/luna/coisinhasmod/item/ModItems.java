package com.luna.coisinhasmod.item;

import com.luna.coisinhasmod.CoisinhasMod;
import com.luna.coisinhasmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.BlockItem;
import net.minecraft.item.GlassBottleItem;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import static net.minecraft.item.Items.BOWL;
import static net.minecraft.item.Items.GLASS_BOTTLE;

public class ModItems {

    public static final Item NATURAL_SANDWICH = registerItem("natural_sandwich", new Item(new Item.Settings().registryKey(ModUtils.createRegKey("natural_sandwich")).maxCount(4).food(ModFoodComponents.NATURAL_SANDWICH, ModConsumableComponents.SNACK)));
    public static final Item COXINHA = registerItem("coxinha", new Item(ModUtils.createFoodSettings("coxinha", ModFoodComponents.COXINHA)));
    public static final Item EMPTY_CAN = registerItem("empty_can", new Item(new Item.Settings().registryKey(ModUtils.createRegKey("empty_can"))));
    public static final Item GREEN_ENERGY_DRINK = registerItem("green_energy_drink", new Item(ModUtils.createPotionSettings("green_energy_drink", ModFoodComponents.GREEN_ENERGY_DRINK, ModConsumableComponents.GREEN_ENERGY_DRINK).useRemainder(EMPTY_CAN).maxCount(1)));
    public static final Item BLUE_ENERGY_DRINK = registerItem("blue_energy_drink", new Item(ModUtils.createPotionSettings("blue_energy_drink", ModFoodComponents.BLUE_ENERGY_DRINK, ModConsumableComponents.BLUE_ENERGY_DRINK).useRemainder(EMPTY_CAN).maxCount(1)));
    public static final Item RAW_COXINHA = registerItem("raw_coxinha", new Item(new Item.Settings().registryKey(ModUtils.createRegKey("raw_coxinha"))));
    public static final Item RAW_CHICKEN_CROISSANT = registerItem("raw_chicken_croissant", new Item(new Item.Settings().registryKey(ModUtils.createRegKey("raw_chicken_croissant"))));
    public static final Item RAW_CHEESE_CROISSANT = registerItem("raw_cheese_croissant", new Item(new Item.Settings().registryKey(ModUtils.createRegKey("raw_cheese_croissant"))));
    public static final Item CHICKEN_CROISSANT = registerItem("chicken_croissant", new Item(ModUtils.createFoodSettings("chicken_croissant", ModFoodComponents.CHICKEN_CROISSANT)));
    public static final Item CHEESE_CROISSANT = registerItem("cheese_croissant", new Item(ModUtils.createFoodSettings("cheese_croissant", ModFoodComponents.CHEESE_CROISSANT)));
    public static final Item MORTAR_AND_PESTLE = registerItem("mortar_and_pestle",
            new SelfReturningItem(new Item.Settings()
                    .maxCount(1)
                    .registryKey(ModUtils.createRegKey("mortar_and_pestle"))));

    public static final Item FLOUR = registerItem("flour", new Item( new Item.Settings().registryKey(ModUtils.createRegKey("flour"))));
    public static final Item DOUGH = registerItem("dough", new Item( new Item.Settings().registryKey(ModUtils.createRegKey("dough"))));
    public static final Item MILK_BOTTLE = registerItem("milk_bottle", new Item(ModUtils.createPotionSettings("milk_bottle", ModFoodComponents.MILK_BOTTLE, ModConsumableComponents.MILK_BOTTLE).useRemainder(GLASS_BOTTLE).maxCount(16).recipeRemainder(GLASS_BOTTLE)));
    public static final Item CHEESE = registerItem("cheese", new Item(ModUtils.createFoodSettings("cheese", ModFoodComponents.CHEESE)));
    public static final Item LETTUCE_SEEDS = registerItem("lettuce_seeds", new BlockItem(ModBlocks.LETTUCE_CROP, new Item.Settings().registryKey((ModUtils.createRegKey("lettuce_seeds")))));
    public static final Item TOMATO_SEEDS = registerItem("tomato_seeds", new BlockItem(ModBlocks.TOMATO_CROP, new Item.Settings().registryKey((ModUtils.createRegKey("tomato_seeds")))));
    public static final Item TOMATO = registerItem("tomato", new Item(new Item.Settings().food(ModFoodComponents.TOMATO).registryKey(ModUtils.createRegKey("tomato"))));
    public static final Item LETTUCE = registerItem("lettuce", new Item(new Item.Settings().food(ModFoodComponents.LETTUCE).registryKey(ModUtils.createRegKey("lettuce"))));

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
