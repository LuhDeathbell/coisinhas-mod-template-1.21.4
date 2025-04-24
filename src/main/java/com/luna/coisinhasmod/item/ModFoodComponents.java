package com.luna.coisinhasmod.item;

import net.minecraft.component.type.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent NATURAL_SANDWICH = new FoodComponent.Builder().nutrition(8).saturationModifier(0.6f).build();
    public static final FoodComponent COXINHA = new FoodComponent.Builder().nutrition(6).saturationModifier(0.2f).build();
    public static final FoodComponent GREEN_ENERGY_DRINK = new FoodComponent.Builder().nutrition(1).alwaysEdible().build();
    public static final FoodComponent BLUE_ENERGY_DRINK = new FoodComponent.Builder().nutrition(1).alwaysEdible().build();
    public static final FoodComponent CHICKEN_CROISSANT = new FoodComponent.Builder().nutrition(8).saturationModifier(0.3f).build();
    public static final FoodComponent CHEESE_CROISSANT = new FoodComponent.Builder().nutrition(8).saturationModifier(0.3f).build();
    public static final FoodComponent MILK_BOTTLE = new FoodComponent.Builder().nutrition(1).alwaysEdible().build();
    public static final FoodComponent CHEESE = new FoodComponent.Builder().nutrition(3).saturationModifier(0.1f).build();
    public static final FoodComponent TOMATO = new FoodComponent.Builder().nutrition(2).saturationModifier(0.1f).build();
    public static final FoodComponent LETTUCE = new FoodComponent.Builder().nutrition(1).build();

}
