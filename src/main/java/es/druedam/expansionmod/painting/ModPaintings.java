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

    public static final RegistryObject<PaintingVariant> ULTRAKILL =  PAINTING_VARIANTS.register("ultrakill",
            () -> new PaintingVariant(32,64));

    public static final RegistryObject<PaintingVariant> RODRICK =  PAINTING_VARIANTS.register("rodrick",
            () -> new PaintingVariant(32,32));

    public static final RegistryObject<PaintingVariant> SPAIN_FLAG =  PAINTING_VARIANTS.register("spain_flag",
            () -> new PaintingVariant(32,16));

    public static final RegistryObject<PaintingVariant> BROCOLI =  PAINTING_VARIANTS.register("brocoli",
            () -> new PaintingVariant(32,16));

    public static final RegistryObject<PaintingVariant> MICHAEL_JACKSON =  PAINTING_VARIANTS.register("michael_jackson",
            () -> new PaintingVariant(48,64));

    public static final RegistryObject<PaintingVariant> AMONG_US =  PAINTING_VARIANTS.register("among_us",
            () -> new PaintingVariant(16,16));



    public static void register(IEventBus eventBus)
    {
        PAINTING_VARIANTS.register(eventBus);
    }
}
