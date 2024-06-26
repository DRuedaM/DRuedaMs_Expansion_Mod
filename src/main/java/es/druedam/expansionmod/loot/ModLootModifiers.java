package es.druedam.expansionmod.loot;

import com.mojang.serialization.Codec;
import es.druedam.expansionmod.ExpansionModMain;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * @author David Rueda
 * <p>
 *     Clase que registramos para porder modificar las loot
 *     tables del juego base
 * </p>
 * @see ModLootModifiers#register(IEventBus) 
 */
public class ModLootModifiers
{
    public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> LOOT_MODIFIER_SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, ExpansionModMain.MOD_ID);

    public static final RegistryObject<Codec<? extends  IGlobalLootModifier>> ADD_ITEM =
            LOOT_MODIFIER_SERIALIZERS.register("add_item", AddItemModifier.CODEC);

    public static void register(IEventBus eventBus)
    {
        LOOT_MODIFIER_SERIALIZERS.register(eventBus);
    }
}
