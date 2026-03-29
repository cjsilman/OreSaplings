package dev.csilman.oresaplings.item;

import dev.csilman.oresaplings.OreSaplings;
import dev.csilman.oresaplings.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, OreSaplings.MOD_ID);

    public static final Supplier<CreativeModeTab> OreSaplingsTab =
            CREATIVE_MOD_TABS.register("ore_saplings_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.oresaplings.ore_saplings_tab"))
                    .icon(() -> new ItemStack(ModBlocks.BLACK_OPAL_BLOCK))
                    .displayItems(((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.BLACK_OPAL_BLOCK);
                    })).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MOD_TABS.register(eventBus);
    }
}
