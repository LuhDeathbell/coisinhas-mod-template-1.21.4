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

                })).build());
    public static void registerItemGroups() {
        CoisinhasMod.LOGGER.info("Registering Item Groups for " + CoisinhasMod.MOD_ID);
    }
}
