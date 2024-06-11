package net.novikov.pracmod.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.novikov.pracmod.PracMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PracMod.MOD_ID);
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> MINON = ITEMS.register("minon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MINON_TAB)));
    public static final RegistryObject<Item> Y_BANANA = ITEMS.register("y_banana",
            () -> new Item(new Item.Properties()
                    .food((new FoodProperties.Builder()).nutrition(5).saturationMod(0.6f)
                            .build()).tab(ModCreativeModeTab.MINON_TAB)));
    public static final RegistryObject<Item> B_BANANA = ITEMS.register("b_banana",
            () -> new Item(new Item.Properties()
                    .food((new FoodProperties.Builder()).nutrition(4).saturationMod(1.6f)
                            .build()).tab(ModCreativeModeTab.MINON_TAB)));
    public static final RegistryObject<Item> P_BANANA = ITEMS.register("p_banana",
            () -> new Item(new Item.Properties()
                    .food((new FoodProperties.Builder()).nutrition(3).saturationMod(3.2f)
                            .build()).tab(ModCreativeModeTab.MINON_TAB)));
}
