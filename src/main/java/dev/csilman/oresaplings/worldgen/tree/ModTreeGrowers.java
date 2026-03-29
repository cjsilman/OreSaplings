package dev.csilman.oresaplings.worldgen.tree;

import dev.csilman.oresaplings.OreSaplings;
import dev.csilman.oresaplings.worldgen.ModConfiguredFeatures;
import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public class ModTreeGrowers {
    public static final TreeGrower ORE_TREE = new TreeGrower(OreSaplings.MOD_ID + ":ore_tree",
            Optional.empty(), Optional.of(ModConfiguredFeatures.ORE_TREE_KEY), Optional.empty());
}
