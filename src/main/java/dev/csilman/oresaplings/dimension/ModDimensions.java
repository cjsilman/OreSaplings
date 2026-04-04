package dev.csilman.oresaplings.dimension;

import dev.csilman.oresaplings.OreSaplings;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;

public class ModDimensions {
    public static final ResourceKey<Level> TEST_WORLD = ResourceKey.create(
            Registries.DIMENSION,
            ResourceLocation.fromNamespaceAndPath(OreSaplings.MOD_ID, "test_world")
    );

    public static void register() {

    }
}
