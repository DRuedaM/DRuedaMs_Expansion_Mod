package es.druedam.expansionmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraftforge.eventbus.api.IEventBus;

/**
 * @author David Rueda.
 * <p>
 *   En esta clase se registran los items que van a funcionar como comidas
 *  dentro del juego, aqui no existe un metodo register, debido a que solo
 *  se crean las instancias del objeto comida para agregarle sus debidas propiedades
 *  en la clase ModItems
 * </p>
 * @see ModItems#register(IEventBus)
 */
public class ModFoods
{
    /**
     * El constructor para el alimento necesita como parametros la nutricion del alimento
     * la saturacion y si queremos que el alimento agregue algun efecto a nuestro jugador al comer
     * el alimento
     * @see FoodProperties#FoodProperties(FoodProperties.Builder)
     */
    public static final FoodProperties FRIED_CHICKEN = new FoodProperties.Builder().nutrition(5).
            saturationMod(0.4f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED,
                            3500), 1f).meat().build();

    public static final FoodProperties RAW_FRIED_CHICKEN = new FoodProperties.Builder().nutrition(1).
            saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.HUNGER,
                    600), 0.3f).meat().build();

    public static final FoodProperties PEPSI = new FoodProperties.Builder().nutrition(2).
            saturationMod(0f).effect(() -> new MobEffectInstance(MobEffects.WITHER,
                    500), 1f).effect(() -> new MobEffectInstance(MobEffects.BLINDNESS, 500), 1f).alwaysEat().build();

    public static final FoodProperties CAMPURRIANA = new FoodProperties.Builder().nutrition(3).
            saturationMod(0.2f).alwaysEat().fast().effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 700), 1).build();

    public static final FoodProperties CROQUETTE = new FoodProperties.Builder().nutrition(3).
            saturationMod(0.4f).meat().fast().build();

    public static final FoodProperties STRAWBERRY = new FoodProperties.Builder().nutrition(2).
            saturationMod(0.1f).fast().effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 500), 1f).alwaysEat().build();

    public static final FoodProperties CHEESE = new FoodProperties.Builder().nutrition(2).
            saturationMod(0.5f).build();

    public static final FoodProperties CHOCOLATE_TABLE = new FoodProperties.Builder().nutrition(5).
            saturationMod(0.35f).build();

    public static final FoodProperties CHOCOLATE_MILKSHAKE = new FoodProperties.Builder().nutrition(6).
            saturationMod(0.5f).build();

    public static final FoodProperties BOCATA_LOMO_QUESO = new FoodProperties.Builder().nutrition(8).
            saturationMod(0.5f).build();

    public static final FoodProperties TOMATO = new FoodProperties.Builder().nutrition(4).
            saturationMod(0.2f).build();

    public static final FoodProperties DURUM = new FoodProperties.Builder().nutrition(10).
            saturationMod(1f).effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 250), 0.25f)
            .effect(() -> new MobEffectInstance(MobEffects.LUCK, 3500), 1).build();

    public static final FoodProperties BURGER = new FoodProperties.Builder().nutrition(10).
            saturationMod(0.7f).effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3500), 1).build();

    public static final FoodProperties FOOD_COMBINED = new FoodProperties.Builder().nutrition(8).
            saturationMod(0.5f).effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 3500), 1).build();
}
