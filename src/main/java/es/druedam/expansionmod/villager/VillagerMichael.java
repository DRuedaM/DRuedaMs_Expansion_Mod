package es.druedam.expansionmod.villager;

import es.druedam.expansionmod.sound.ModSounds;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

public class VillagerMichael extends Villager
{
    private static final SoundEvent SOUND_AMBIENT = ModSounds.MICHAEL_JACKSON_AMBIENT.get();
    private static final SoundEvent SOUND_HURT = ModSounds.MICHAEL_JACKSON_HURT.get();
    private static final SoundEvent SOUND_YES = ModSounds.MICHAEL_JACKSON_YES.get();
    private static final SoundEvent SOUND_NO = ModSounds.MICHAEL_JACKSON_NO.get();
    private static final SoundEvent SOUND_CELEBRATE = ModSounds.MICHAEL_JACKSON_CELEBRATE.get();
    private static final SoundEvent SOUND_DEATH = ModSounds.MICHAEL_JACKSON_DEATH.get();

    public VillagerMichael(EntityType<? extends Villager> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return SOUND_AMBIENT;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource pDamageSource) {
        return SOUND_HURT;
    }

    @Override
    public SoundEvent getNotifyTradeSound() {
        return SOUND_AMBIENT;
    }

    @Override
    protected SoundEvent getTradeUpdatedSound(boolean pIsYesSound) {
        return pIsYesSound ? SOUND_YES : SOUND_NO;
    }

    @Override
    public void playCelebrateSound() {
        this.playSound(SOUND_CELEBRATE, this.getSoundVolume(), this.getVoicePitch());
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SOUND_DEATH;
    }



}
