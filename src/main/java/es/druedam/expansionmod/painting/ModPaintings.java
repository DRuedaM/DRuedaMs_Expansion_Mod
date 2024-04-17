package es.druedam.expansionmod.painting;

import es.druedam.expansionmod.ExpansionModMain;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPaintings
{
    public static final DeferredRegister<PaintingVariant> PAINTING_VARIANTS =
            DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, ExpansionModMain.MOD_ID);

    public static final RegistryObject<PaintingVariant> MOUSE =  PAINTING_VARIANTS.register("mouse",
            () -> new PaintingVariant(16,16));

    public static final RegistryObject<PaintingVariant> SAD_MOUSE =  PAINTING_VARIANTS.register("sad_mouse",
            () -> new PaintingVariant(32,32));



    public static void register(IEventBus eventBus)
    {
        PAINTING_VARIANTS.register(eventBus);
    }
}
