package dev.csilman.oresaplings.event;

import dev.csilman.oresaplings.OreSaplings;
import dev.csilman.oresaplings.block.ModBlocks;
import dev.csilman.oresaplings.dimension.ModDimensions;
import dev.csilman.oresaplings.util.TeleportHelper;
import net.minecraft.core.BlockPos;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.UseItemOnBlockEvent;

@EventBusSubscriber(modid = OreSaplings.MOD_ID)
public class ModEvents {

    @SubscribeEvent
    public static void onItemRightClick(UseItemOnBlockEvent event) {

        Player player = event.getPlayer();
        BlockPos clickedPos = event.getPos();
        BlockState clickedBlock = player.level().getBlockState(clickedPos);


        if (player instanceof ServerPlayer) {
            if (clickedBlock.is(ModBlocks.BLACK_OPAL_BLOCK)) {
                if (event.getItemStack().is(Items.GOLD_INGOT)) { // swap with your trigger item
                    TeleportHelper.teleportToTestWorld((ServerPlayer) player);
                }
            }
        }

    }
}
