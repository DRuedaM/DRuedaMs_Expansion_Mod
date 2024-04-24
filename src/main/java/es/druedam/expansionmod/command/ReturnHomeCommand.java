package es.druedam.expansionmod.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;

/**
 * @author David Rueda
 * <p>
 *     Clase que agrega un nuevo comando al juego
 *     en este caso se encarga de recoger la ubicacion
 *     marcada por el jugador con el comando SetHome,
 *     al recoger los datos el jugador es teletransportado
 *     a esa misma posicion
 * </p>
 * @see SetHomeCommand
 */
public class ReturnHomeCommand
{
    public ReturnHomeCommand(CommandDispatcher<CommandSourceStack> dispatcher)
    {
        dispatcher.register(Commands.literal("home").then(Commands.literal("return")
                .executes(this::execute)));
    }

    private int execute(CommandContext<CommandSourceStack> context)
    {
        ServerPlayer player = context.getSource().getPlayer();
        boolean hasHomepos = player.getPersistentData().getIntArray("expansionmod.homepos").length !=0 ;

        if(hasHomepos)
        {
            int[] playerPos = player.getPersistentData().getIntArray("expansionmod.homepos");
            player.teleportTo(playerPos[0], playerPos[1], playerPos[2]);

            context.getSource().sendSuccess(() -> Component.literal(player.getName().getString() + " has returned to home"), true);
            return 1;
        }
        else
        {
            context.getSource().sendFailure(Component.literal("No home position has been set"));
            return -1;
        }
    }
}
