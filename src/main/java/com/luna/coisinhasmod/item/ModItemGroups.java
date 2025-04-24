package com.luna.coisinhasmod.item;

import com.luna.coisinhasmod.CoisinhasMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.item.ItemGroup;

public class ModItemGroups {
    public static final ItemGroup COISINHAS_FOODS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(CoisinhasMod.MOD_ID, "comidinhas"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.NATURAL_SANDWICH))
                .displayName(Text.translatable("itemgroup.coisinhasmod.comidinhas"))
                .entries(((displayContext, entries) -> {
                    entries.add(ModItems.NATURAL_SANDWICH);
                    entries.add(ModItems.GREEN_ENERGY_DRINK);
                    entries.add(ModItems.BLUE_ENERGY_DRINK);
                    entries.add(ModItems.RAW_COXINHA);
                    entries.add(ModItems.COXINHA);
                    entries.add(ModItems.RAW_CHEESE_CROISSANT);
                    entries.add(ModItems.CHEESE_CROISSANT);
                    entries.add(ModItems.RAW_CHICKEN_CROISSANT);
                    entries.add(ModItems.CHICKEN_CROISSANT);
                    entries.add(ModItems.FLOUR);
                    entries.add(ModItems.DOUGH);
                    entries.add(ModItems.MILK_BOTTLE);
                    entries.add(ModItems.CHEESE);
                    entries.add(ModItems.LETTUCE);
                    entries.add(ModItems.TOMATO);

                })).build());
    public static final ItemGroup COISINHAS_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(CoisinhasMod.MOD_ID, "coisinhas"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.MORTAR_AND_PESTLE))
                .displayName(Text.translatable("itemgroup.coisinhasmod.coisinhas"))
                .entries(((displayContext, entries) -> {
                    entries.add(ModItems.MORTAR_AND_PESTLE);
                    entries.add(ModItems.EMPTY_CAN);
                    entries.add(ModItems.LETTUCE_SEEDS);
                    entries.add(ModItems.TOMATO_SEEDS);


                })).build());
    public static void registerItemGroups() {
        CoisinhasMod.LOGGER.info("Registering Item Groups for " + CoisinhasMod.MOD_ID);
    }
}
