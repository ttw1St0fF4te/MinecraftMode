package net.novikov.pracmod.block;

import net.novikov.pracmod.item.ModCreativeModeTab;
import net.novikov.pracmod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import java.util.function.Supplier;
import net.novikov.pracmod.PracMod;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, PracMod.MOD_ID);
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    public static final RegistryObject<Block> COOL_MINON = registryBlock("cool_minon",
            () -> new Block(BlockBehaviour.Properties.of(Material.SPONGE)
                    .strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.MINON_TAB);


    public static final RegistryObject<Block> PUNK_MINON = registryBlock("punk_minon",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.MINON_TAB);


    public static final RegistryObject<Block> KOSTYA_MINON = registryBlock("kostya_minon",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(10f).requiresCorrectToolForDrops()), ModCreativeModeTab.MINON_TAB);


    public static final RegistryObject<Block> EMO_MINON = registryBlock("emo_minon",
            () -> new Block(BlockBehaviour.Properties.of(Material.WEB)
                    .strength(52f).requiresCorrectToolForDrops()), ModCreativeModeTab.MINON_TAB);


    public static <T extends Block>RegistryObject<T> registryBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturns = BLOCKS.register(name, block);
        registryBlockItem(name, toReturns, tab);
        return toReturns;
    }

    public static <T extends Block> RegistryObject<Item> registryBlockItem(String name, RegistryObject<T> block,
                                                                           CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

}
