package dev.csilman.oresaplings.datagen;

import dev.csilman.oresaplings.OreSaplings;
import dev.csilman.oresaplings.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, OreSaplings.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        saplingItem(ModBlocks.IRON_ORE_SAPLING);
    }

    private ItemModelBuilder saplingItem(DeferredBlock<Block> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(OreSaplings.MOD_ID, "block/" + item.getId().getPath()));
    }
}
