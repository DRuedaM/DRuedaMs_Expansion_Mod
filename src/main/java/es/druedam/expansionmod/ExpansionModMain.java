package es.druedam.expansionmod;

import es.druedam.expansionmod.block.ModBlocks;
import es.druedam.expansionmod.item.CreativeModeTabs;
import es.druedam.expansionmod.item.ModItems;
import es.druedam.expansionmod.loot.ModLootModifiers;
import es.druedam.expansionmod.painting.ModPaintings;
import es.druedam.expansionmod.sound.ModSounds;
import es.druedam.expansionmod.villager.ModVillagers;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

/** @author David Rueda
 * <p>
 *     La clase principal es la encargada de
 *     unir y registrar todas las clases que registran
 *     objetos, items, y datos en el juego
 * </p>
 * @see Mod
 */
@Mod(ExpansionModMain.MOD_ID)
public class ExpansionModMain
{
    // La variable define el identificador unico del mod
    public static final String MOD_ID = "druedams_expansion_mod";

    public ExpansionModMain()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        //Aqui registramos todas las clases que contengan datos que van a ser agregados al programa base
        CreativeModeTabs.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModLootModifiers.register(modEventBus);
        ModVillagers.register(modEventBus);
        ModPaintings.register(modEventBus);
        ModSounds.register(modEventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }
}
