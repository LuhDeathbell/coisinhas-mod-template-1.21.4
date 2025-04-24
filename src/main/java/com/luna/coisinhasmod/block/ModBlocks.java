package com.luna.coisinhasmod.block;

import com.luna.coisinhasmod.CoisinhasMod;
import com.luna.coisinhasmod.block.custom.LettuceCropBlock;
import com.luna.coisinhasmod.block.custom.TomatoCropBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModBlocks {

    public static final Block LETTUCE_CROP = registerBlockWithoutBlockItem("lettuce_crop", key ->
            new LettuceCropBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .ticksRandomly()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.CROP)
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .registryKey(key))
    );

    public static final Block TOMATO_CROP = registerBlockWithoutBlockItem("tomato_crop", key ->
            new TomatoCropBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .ticksRandomly()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.CROP)
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .registryKey(key))
    );

    private static Block registerBlock(String name, AbstractBlock.Settings blockSettings) {
        RegistryKey<Block> key = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(CoisinhasMod.MOD_ID, name));
        Block block = new Block(blockSettings.registryKey(key));
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, key, block);
    }

    private static <T extends Block> T registerBlockWithoutBlockItem(String name, Function<RegistryKey<Block>, T> blockFactory) {
        RegistryKey<Block> key = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(CoisinhasMod.MOD_ID, name));
        T block = blockFactory.apply(key);
        return Registry.register(Registries.BLOCK, key, block);
    }

    private static void registerBlockItem(String name, Block block) {
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(CoisinhasMod.MOD_ID, name));
        BlockItem item = new BlockItem(block, new Item.Settings().registryKey(key));
        Registry.register(Registries.ITEM, key, item);
    }

    public static void registerModBlocks() {
        CoisinhasMod.LOGGER.info("Registering Mod Block for "+ CoisinhasMod.MOD_ID);
    }
}
