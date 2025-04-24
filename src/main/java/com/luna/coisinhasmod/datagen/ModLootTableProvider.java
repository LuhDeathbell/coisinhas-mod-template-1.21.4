package com.luna.coisinhasmod.datagen;

import com.luna.coisinhasmod.block.ModBlocks;
import com.luna.coisinhasmod.block.custom.LettuceCropBlock;
import com.luna.coisinhasmod.block.custom.TomatoCropBlock;
import com.luna.coisinhasmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        BlockStatePropertyLootCondition.Builder builder2 = BlockStatePropertyLootCondition.builder(ModBlocks.LETTUCE_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(LettuceCropBlock.AGE, LettuceCropBlock.MAX_AGE));
        this.addDrop(ModBlocks.LETTUCE_CROP, this.cropDrops(ModBlocks.LETTUCE_CROP, ModItems.LETTUCE, ModItems.LETTUCE_SEEDS, builder2));

        BlockStatePropertyLootCondition.Builder builder3 = BlockStatePropertyLootCondition.builder(ModBlocks.TOMATO_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(TomatoCropBlock.AGE, TomatoCropBlock.MAX_AGE));
        this.addDrop(ModBlocks.TOMATO_CROP, this.cropDrops(ModBlocks.TOMATO_CROP, ModItems.TOMATO, ModItems.TOMATO_SEEDS, builder3));
    }
}
