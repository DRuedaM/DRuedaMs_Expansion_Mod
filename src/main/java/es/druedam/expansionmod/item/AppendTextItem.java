package es.druedam.expansionmod.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * @author David Rueda
 * <p>
 *     Hay algunos items a los que considero
 *     que viene bien agregarle "etiquetas",
 *     en minecraft se llaman tooltips,
 *     surgio un problema, a la hora de instanciar
 *     algunos objetos queria que tuvieran una etiqueta con texto, pero
 *     al no ser una clase aparte, no me era posible hacerlo sin tener subclases.
 *     Esta clase lo soluciona, agrega un nuevo constructor, el cual sobreescribe la variable
 *     que es necesaria para saber si ese item va a llevar una etiqueta de texto
 * </p>
 * @see Item
 */
public class AppendTextItem extends Item {

    private final String appendText;

    public AppendTextItem(Properties pProperties, String appendText) {
        super(pProperties);
        this.appendText = appendText;
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {

        pTooltipComponents.add(Component.translatable(appendText));
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}
