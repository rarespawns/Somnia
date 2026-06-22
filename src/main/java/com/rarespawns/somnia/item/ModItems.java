package com.rarespawns.somnia.item;

import com.rarespawns.somnia.Somnia;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Somnia.MODID);

    //GROUP BASIC MATERIALS HERE
    public static final DeferredItem<Item> DREAM_ESSENCE = ITEMS.register("dream_essence",
            () -> new Item(new Item.Properties())
    );

    //GROUP TOOLSETS HERE
    //Emerald tools
    public static final DeferredItem<SwordItem> EMERALD_SWORD = ITEMS.register("emerald_sword", () -> new SwordItem(ModToolTiers.EMERALD,
            new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.EMERALD, 3, -2.4f)))
    );
    public static final DeferredItem<PickaxeItem> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", () -> new PickaxeItem(ModToolTiers.EMERALD,
            new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.EMERALD, 1, -2.8f)))
    );
    public static final DeferredItem<AxeItem> EMERALD_AXE = ITEMS.register("emerald_axe", () -> new AxeItem(ModToolTiers.EMERALD,
            new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.EMERALD, 5, -3.0f)))
    );
    public static final DeferredItem<ShovelItem> EMERALD_SHOVEL = ITEMS.register("emerald_shovel", () -> new ShovelItem(ModToolTiers.EMERALD,
            new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.EMERALD, 1.5f, -3.0f)))
    );
    public static final DeferredItem<HoeItem> EMERALD_HOE = ITEMS.register("emerald_hoe", () -> new HoeItem(ModToolTiers.EMERALD,
            new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.EMERALD, -2, 0.0f)))
    );


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
