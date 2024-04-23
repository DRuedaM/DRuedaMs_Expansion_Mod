package es.druedam.expansionmod.item;

import es.druedam.expansionmod.ExpansionModMain;
import es.druedam.expansionmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

/**
 * @author David Rueda
 * <p>
 *     Esta clase sirve para almacenar
 *     los items que queramos en una pestaña distinta
 *     a las del juego base para mostrar al jugador
 *     los objetos nuevos que se encuentran en el mod, y
 *     asi poder acceder a ellos mas facilmente
 * </p>
 */
public class CreativeModeTabs
{

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ExpansionModMain.MOD_ID);


    public static final RegistryObject<CreativeModeTab> EXPANSION_TAB = CREATIVE_MODE_TABS.register("expansion_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DURUM.get()))
                    .title(Component.translatable("creativetab.expansion_tab")).displayItems((itemDisplayParameters, output) ->
                    {
                        output.accept(ModItems.BOCATA_LOMO_QUESO.get());
                        output.accept(ModItems.CAMPURRIANA.get());
                        output.accept(ModItems.BURGER.get());
                        output.accept(ModItems.CHOCOLATE_TABLE.get());
                        output.accept(ModItems.CHOCOLATE_MILKSHAKE.get());
                        output.accept(ModItems.CROQUETTE.get());
                        output.accept(ModItems.DURUM.get());
                        output.accept(ModItems.CHEESE.get());
                        output.accept(ModItems.FRIED_CHICKEN.get());
                        output.accept(ModItems.PEPSI.get());
                        output.accept(ModItems.RAW_FRIED_CHICKEN.get());
                        output.accept(ModItems.FOOD_COMBINED.get());
                        output.accept(ModItems.STRAWBERRY.get());
                        output.accept(ModItems.TOMATO.get());
                        output.accept(ModBlocks.PIZZA.get());
                        output.accept(ModItems.STRAWBERRY_SEEDS.get());
                        output.accept(ModItems.TOMATO_SEEDS.get());
                        output.accept(ModBlocks.ORE_FLUORITE.get());
                        output.accept(ModBlocks.DEEPSLATE_FLUORITE.get());
                        output.accept(ModItems.FLUORITE_INGOT.get());

                        output.accept(ModItems.FLUORITE_SWORD.get());
                        output.accept(ModItems.FLUORITE_AXE.get());
                        output.accept(ModItems.FLUORITE_SHOVEL.get());
                        output.accept(ModItems.FLUORITE_PICKAXE.get());
                        output.accept(ModItems.FLUORITE_HOE.get());

                        output.accept(ModItems.FLUORITE_HELMET.get());
                        output.accept(ModItems.FLUORITE_CHESTPLATE.get());
                        output.accept(ModItems.FLUORITE_LEGGINGS.get());
                        output.accept(ModItems.FLUORITE_BOOTS.get());

                        output.accept(ModItems.WOOD_HELMET.get());
                        output.accept(ModItems.WOOD_CHESTPLATE.get());
                        output.accept(ModItems.WOOD_LEGGINGS.get());
                        output.accept(ModItems.WOOD_BOOTS.get());
                    }).build());


    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
