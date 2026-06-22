package com.rarespawns.somnia.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier EMERALD = new SimpleTier(BlockTags.INCORRECT_FOR_IRON_TOOL, 750, 10, 2, 18, () -> Ingredient.of(Items.EMERALD));
}
