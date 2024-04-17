package es.druedam.expansionmod;

import com.mojang.logging.LogUtils;
import es.druedam.expansionmod.block.ModBlocks;
import es.druedam.expansionmod.item.CreativeModeTabs;
import es.druedam.expansionmod.item.ModItems;
import es.druedam.expansionmod.loot.ModLootModifiers;
import es.druedam.expansionmod.villager.ModVillagers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

/**
 * La clase principal tan solo agrega al IEventBus
 * todas las otras clases para que esta pueda agregar
 * todo lo nuevo al juego base
 */
@Mod(ExpansionModMain.MOD_ID)
public class ExpansionModMain
{
    // La variable define el identificador unico del mod
    public static final String MOD_ID = "druedams_expansion_mod";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public ExpansionModMain()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        //Aqui registramos todas las clases que contengan items/bloques y demas para agregarlos en el juego original
        CreativeModeTabs.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModLootModifiers.register(modEventBus);
        ModVillagers.register(modEventBus);

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);


        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
