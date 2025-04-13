package com.luna.coisinhasmod.item;

import net.minecraft.component.type.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent NATURAL_SANDWICH = new FoodComponent.Builder().nutrition(6).saturationModifier(0.5f).build();
    public static final FoodComponent COXINHA = new FoodComponent.Builder().nutrition(2).saturationModifier(0.2f).build();
    public static final FoodComponent GREEN_ENERGY_DRINK = new FoodComponent.Builder().nutrition(1).build();
    public static final FoodComponent BLUE_ENERGY_DRINK = new FoodComponent.Builder().nutrition(1).build();
}
