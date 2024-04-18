package es.druedam.expansionmod.event;

import es.druedam.expansionmod.ExpansionModMain;
import es.druedam.expansionmod.item.ModItems;
import es.druedam.expansionmod.villager.ModVillagers;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = ExpansionModMain.MOD_ID)
public class ModEvents
{

    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {
        if (event.getType() == VillagerProfession.FARMER) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            //LEVEL 1
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.GOLD_INGOT, 1),
                    new ItemStack(ModItems.TOMATO_SEEDS.get(), 12),
                    10, 8, 0.02f
            ));

            //LEVEL 2
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.GOLD_INGOT, 1),
                    new ItemStack(ModItems.STRAWBERRY.get(), 12),
                    10, 16, 0.035f
            ));

            //LEVEL 3
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.GOLD_INGOT, 1),
                    new ItemStack(ModItems.CHEESE.get(), 3),
                    10, 16, 0.035f
            ));

        }

        if (event.getType() == ModVillagers.MICHAEL_JACKSON.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            //LEVEL 1
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.GOLD_INGOT, 3),
                    new ItemStack(Items.MUSIC_DISC_13, 1),
                    3, 15, 0.02f
            ));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.GOLD_INGOT, 3),
                    new ItemStack(Items.MUSIC_DISC_11, 1),
                    3, 15, 0.02f
            ));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.GOLD_INGOT, 3),
                    new ItemStack(Items.MUSIC_DISC_5, 1),
                    3, 15, 0.02f
            ));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.GOLD_INGOT, 5),
                    new ItemStack(Items.MUSIC_DISC_BLOCKS, 1),
                    3, 50, 0.02f
            ));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.GOLD_INGOT, 5),
                    new ItemStack(Items.MUSIC_DISC_MALL, 1),
                    3, 50, 0.02f
            ));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.GOLD_INGOT, 5),
                    new ItemStack(Items.MUSIC_DISC_FAR, 1),
                    3, 50, 0.02f
            ));

            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.GOLD_INGOT, 7),
                    new ItemStack(Items.MUSIC_DISC_STRAD, 1),
                    3, 75, 0.02f
            ));

            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.GOLD_INGOT, 7),
                    new ItemStack(Items.MUSIC_DISC_WARD, 1),
                    3, 75, 0.02f
            ));

            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.GOLD_INGOT, 7),
                    new ItemStack(Items.MUSIC_DISC_STAL, 1),
                    3, 75, 0.02f
            ));

            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.GOLD_INGOT, 10),
                    new ItemStack(Items.MUSIC_DISC_MELLOHI, 1),
                    3, 100, 0.02f
            ));

            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.GOLD_INGOT, 10),
                    new ItemStack(Items.MUSIC_DISC_CAT, 1),
                    3, 100, 0.02f
            ));


            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.GOLD_INGOT, 10),
                    new ItemStack(Items.MUSIC_DISC_RELIC, 1),
                    3, 100, 0.02f
            ));

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.GOLD_INGOT, 12),
                    new ItemStack(Items.MUSIC_DISC_WAIT, 1),
                    3, 150, 0.02f
            ));

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.GOLD_INGOT, 12),
                    new ItemStack(Items.MUSIC_DISC_PIGSTEP, 1),
                    3, 150, 0.02f
            ));

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.GOLD_INGOT, 12),
                    new ItemStack(Items.MUSIC_DISC_CHIRP, 1),
                    3, 150, 0.02f
            ));


            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.GOLD_INGOT, 20),
                    new ItemStack(Items.MUSIC_DISC_OTHERSIDE, 1),
                    3, 200, 0.02f
            ));

        }


    }
}
