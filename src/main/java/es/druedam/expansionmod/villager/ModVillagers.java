package es.druedam.expansionmod.villager;

import com.google.common.collect.ImmutableSet;
import es.druedam.expansionmod.ExpansionModMain;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModVillagers
{
    public static final DeferredRegister<PoiType> POI_TYPES =
            DeferredRegister.create(ForgeRegistries.POI_TYPES, ExpansionModMain.MOD_ID);

    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS =
            DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, ExpansionModMain.MOD_ID);


    public static final RegistryObject<PoiType> SOUND_POI = POI_TYPES.register("sound_poi",
            () -> new PoiType(ImmutableSet.copyOf(Blocks.CRAFTING_TABLE.getStateDefinition().getPossibleStates()),
                    1, 1));

    public static final RegistryObject<VillagerProfession> MICHAEL_JACKSON =
            VILLAGER_PROFESSIONS.register("michael_jackson", () -> new VillagerProfession("michael_jackson",
                    holder -> holder.get() == SOUND_POI.get(), holder -> holder.get() == SOUND_POI.get(),
                    ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_ARMORER));

    public static void register(IEventBus eventBus){
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);
    }
}
