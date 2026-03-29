package dev.csilman.oresaplings.block;

import dev.csilman.oresaplings.OreSaplings;
import dev.csilman.oresaplings.block.custom.ModFlammableRotatedPillarBlock;
import dev.csilman.oresaplings.block.custom.OreSaplingBlock;
import dev.csilman.oresaplings.item.ModItems;
import dev.csilman.oresaplings.worldgen.tree.ModTreeGrowers;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(OreSaplings.MOD_ID);

    // Sample test
    public static final DeferredBlock<Block> BLACK_OPAL_BLOCK = registerBlock("black_opal_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> IRON_ORE_LOG = registerBlock("iron_ore_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));

    public static final DeferredBlock<Block> IRON_ORE_SAPLING = registerBlock("iron_ore_sapling",
            () -> new OreSaplingBlock(ModTreeGrowers.ORE_TREE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING), Blocks.IRON_ORE));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
