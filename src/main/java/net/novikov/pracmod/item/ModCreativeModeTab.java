package net.novikov.pracmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MINON_TAB = new CreativeModeTab("Minon_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MINON.get());
        }
    };
}
