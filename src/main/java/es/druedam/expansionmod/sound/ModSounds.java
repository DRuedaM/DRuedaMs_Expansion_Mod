package es.druedam.expansionmod.sound;

import es.druedam.expansionmod.ExpansionModMain;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds
{
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ExpansionModMain.MOD_ID);

    public static final RegistryObject<SoundEvent> MICHAEL_JACKSON_AMBIENT = registerSoundEvents("michael_jackson_ambient");
    public static final RegistryObject<SoundEvent> MICHAEL_JACKSON_HURT = registerSoundEvents("michael_jackson_hurt");
    public static final RegistryObject<SoundEvent> MICHAEL_JACKSON_DEATH = registerSoundEvents("michael_jackson_death");
    public static final RegistryObject<SoundEvent> MICHAEL_JACKSON_CELEBRATE = registerSoundEvents("michael_jackson_celebrate");
    public static final RegistryObject<SoundEvent> MICHAEL_JACKSON_NO = registerSoundEvents("michael_jackson_no");
    public static final RegistryObject<SoundEvent> MICHAEL_JACKSON_YES = registerSoundEvents("michael_jackson_yes");



    private static RegistryObject<SoundEvent> registerSoundEvents(String name)
    {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(ExpansionModMain.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus)
    {
        SOUND_EVENTS.register(eventBus);
    }
}
