package com.rarespawns.somnia.datagen;

import com.rarespawns.somnia.Somnia;
import com.rarespawns.somnia.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.references.Blocks;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagsProvider.TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, Somnia.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ItemTags.SWORDS)
                .add(ModItems.EMERALD_SWORD.get());
        tag(ItemTags.PICKAXES)
                .add(ModItems.EMERALD_PICKAXE.get());
        tag(ItemTags.AXES)
                .add(ModItems.EMERALD_AXE.get());
        tag(ItemTags.SHOVELS)
                .add(ModItems.EMERALD_SHOVEL.get());
        tag(ItemTags.HOES)
                .add(ModItems.EMERALD_HOE.get());
    }
}
