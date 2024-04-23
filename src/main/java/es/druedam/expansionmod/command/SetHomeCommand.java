package es.druedam.expansionmod.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;

public class SetHomeCommand
{
    public SetHomeCommand(CommandDispatcher<CommandSourceStack> dispatcher)
    {
        dispatcher.register(Commands.literal("home").then(Commands.literal("save")
                .executes(this::execute)));
    }

    private int execute(CommandContext<CommandSourceStack> context)
    {
        ServerPlayer player = context.getSource().getPlayer();
        BlockPos playerPos = player.blockPosition();
        String positionString = "(" + playerPos.getX() + "," + playerPos.getY() + "," + playerPos.getZ() + ")";

        player.getPersistentData().putIntArray("expansionmod.homepos",
                new int[] {playerPos.getX(), playerPos.getY(), playerPos.getZ()});
        context.getSource().sendSuccess(() -> Component.literal(player.getName().getString() + " has setted his home at " + positionString), true);
        return 1;
    }
}

