package dev.csilman.oresaplings.util;

import dev.csilman.oresaplings.dimension.ModDimensions;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.level.levelgen.Heightmap;

import java.util.Set;

public class TeleportHelper {
    public static void teleportToTestWorld(ServerPlayer player) {
        MinecraftServer server = player.getServer();
        if (server == null) return;

        player.sendSystemMessage(Component.literal(player.getName().getString() + " just attempted to teleport!"));

        ServerLevel target = server.getLevel(ModDimensions.TEST_WORLD);
        if (target == null) return;

        BlockPos safePos = target.getHeightmapPos(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, BlockPos.ZERO);

        player.teleportTo(
                target,
                safePos.getX() + 0.5,
                safePos.getY(),
                safePos.getZ() + 0.5,
                Set.of(),
                0f,
                0f
        );
    }
}
