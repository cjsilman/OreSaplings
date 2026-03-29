package dev.csilman.oresaplings.datagen;

import dev.csilman.oresaplings.OreSaplings;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, OreSaplings.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

    }
}
