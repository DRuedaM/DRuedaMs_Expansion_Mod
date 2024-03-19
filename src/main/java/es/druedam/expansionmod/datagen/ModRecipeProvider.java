package es.druedam.expansionmod.datagen;

import es.druedam.expansionmod.ExpansionModMain;
import es.druedam.expansionmod.block.ModBlocks;
import es.druedam.expansionmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder
{
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter)
    {

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.RAW_FRIED_CHICKEN.get())
                .pattern("CT")
                .define('C', Items.CHICKEN)
                .define('T', Items.WHEAT)
                .unlockedBy(getHasName(ModItems.RAW_FRIED_CHICKEN.get()), has(ModItems.RAW_FRIED_CHICKEN.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.CHOCOLATE_TABLE.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Items.COCOA_BEANS)
                .unlockedBy(getHasName(Items.COCOA_BEANS), has(Items.COCOA_BEANS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.BOCATA_LOMO_QUESO.get())
                .pattern("QCP")
                .define('Q', ModItems.CHEESE.get())
                .define('C', Items.PORKCHOP)
                .define('P', Items.BREAD)
                .unlockedBy(getHasName(ModItems.CHEESE.get()), has(ModItems.CHEESE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.CHOCOLATE_MILKSHAKE.get())
                .pattern("LC")
                .define('L', Items.MILK_BUCKET)
                .define('C', ModItems.CHOCOLATE_TABLE.get())
                .unlockedBy(getHasName(ModItems.CHOCOLATE_TABLE.get()), has(ModItems.CHOCOLATE_TABLE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.CROQUETTE.get(), 6)
                .pattern("CLP")
                .define('C', Items.PORKCHOP)
                .define('L', Items.MILK_BUCKET)
                .define('P', Items.BREAD)
                .unlockedBy(getHasName(Items.PORKCHOP), has(Items.PORKCHOP))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.PEPSI.get())
                .pattern("ACZ")
                .define('A', Items.GLASS_BOTTLE)
                .define('C', Items.COAL)
                .define('Z', Items.SUGAR)
                .unlockedBy(getHasName(Items.GLASS_BOTTLE), has(Items.GLASS_BOTTLE))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.CAMPURRIANA.get(), 8)
                .pattern("HLT")
                .define('H', Items.EGG)
                .define('L', Items.MILK_BUCKET)
                .define('T', Items.WHEAT)
                .unlockedBy(getHasName(Items.EGG), has(Items.EGG))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.DURUM.get())
                .pattern("PCT")
                .define('P', Items.BREAD)
                .define('C', Items.BEEF)
                .define('T', ModItems.TOMATO.get())
                .unlockedBy(getHasName(Items.BREAD), has(Items.BREAD))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.BURGER.get())
                .pattern(" P ")
                .pattern("CQT")
                .pattern(" P ")
                .define('P', Items.BREAD)
                .define('C', Items.BEEF)
                .define('Q', ModItems.CHEESE.get())
                .define('T', ModItems.TOMATO.get())
                .unlockedBy(getHasName(Items.BREAD), has(Items.BREAD))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.FOOD_COMBINED.get())
                .pattern("HBP")
                .define('H', Items.EGG)
                .define('B', Items.PORKCHOP)
                .define('P', Items.POTATO)
                .unlockedBy(getHasName(Items.PORKCHOP), has(Items.PORKCHOP))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModBlocks.PIZZA.get())
                .pattern("QCT")
                .pattern("PPP")
                .define('Q', ModItems.CHEESE.get())
                .define('C', Items.PORKCHOP)
                .define('T', ModItems.TOMATO.get())
                .define('P', Items.BREAD)
                .unlockedBy(getHasName(Items.BREAD), has(Items.BREAD))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.CHEESE.get(), 3)
                .requires(Items.MILK_BUCKET)
                .unlockedBy(getHasName(Items.MILK_BUCKET), has(Items.MILK_BUCKET))
                .save(pWriter);


        oreCooking(pWriter, RecipeSerializer.SMELTING_RECIPE, List.of(ModItems.RAW_FRIED_CHICKEN.get()), RecipeCategory.FOOD, ModItems.FRIED_CHICKEN.get(), 0.2f, 200, "","");
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {

        for(ItemLike itemLike: pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(new ItemLike[]{itemLike}), pCategory, pResult,
                    pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemLike), has(itemLike))
                    .save(pFinishedRecipeConsumer, ExpansionModMain.MOD_ID + ":"+ getItemName(pResult)  + pRecipeName + "_" + getItemName(itemLike));
        }

    }
}
