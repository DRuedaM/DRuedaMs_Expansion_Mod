package es.druedam.expansionmod.sound;

import es.druedam.expansionmod.ExpansionModMain;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * @author David Rueda
 * <p>
 *     Clase que registra nuevos sonidos,
 *     tras registrarlos pueden ser llamados desde cualquier parte de nuestro proyecto
 *     para agregarlo a lo que queramos
 * </p>
 * @see ModSounds#register(IEventBus)
 */
public class ModSounds
{
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ExpansionModMain.MOD_ID);

    public static final RegistryObject<SoundEvent> MICHAEL_JACKSON_AMBIENT = registerSoundEvents("michael_jackson_ambient");

    private static RegistryObject<SoundEvent> registerSoundEvents(String name)
    {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(ExpansionModMain.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus)
    {
        SOUND_EVENTS.register(eventBus);
    }
}
