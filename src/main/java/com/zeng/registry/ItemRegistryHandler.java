package com.zeng.registry;

import com.zeng.Main;
import morph.avaritia.recipe.AvaritiaRecipeManager;
import morph.avaritia.recipe.extreme.ExtremeShapelessRecipe;
import morph.avaritia.recipe.extreme.IExtremeRecipe;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import javax.annotation.Nonnull;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Mod.EventBusSubscriber(modid = Main.MOD_ID)
public class ItemRegistryHandler extends Main{
    public static ResourceLocation CATALYST_RECIPE_LOCATION = new ResourceLocation("avaritia:items/infinity_catalyst");


    public static final List<Item> items = new ArrayList<>();

    public static final CreativeTabs ZENG_CREATIVE_TAB = new CreativeTabs("extrasingularity") {
        @Nonnull
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ItemLoader.TerrasteelSingularity);
        }
    };



    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        ItemLoader.load();
        IForgeRegistry<Item> registry = event.getRegistry();
        for (Item a : items) {
            registry.register(a);
            a.setCreativeTab(ZENG_CREATIVE_TAB);
        }
    }

    @SideOnly(Side.CLIENT)
    private static void registerModel(@Nonnull Item item) {
        ModelResourceLocation modelResourceLocation = new ModelResourceLocation(Objects.requireNonNull(item.getRegistryName()), "inventory");
        ModelLoader.setCustomModelResourceLocation(item, 0, modelResourceLocation);
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void onModelRegistry(ModelRegistryEvent event) {
        for (Item b : items) {
            registerModel(b);
        }
    }

    @Override
    public void init(){
        addCatalystIngredient(ItemLoader.AlubrassSingularity);
    }
    public static void addCatalystIngredient(Object input) {
        IExtremeRecipe recipes = AvaritiaRecipeManager.EXTREME_RECIPES.get(CATALYST_RECIPE_LOCATION);

        if (recipes == null) {
            System.out.println("recipeserror:1");
            return;
        }
        if (recipes instanceof ExtremeShapelessRecipe) {
            try {
                ExtremeShapelessRecipe recipe = (ExtremeShapelessRecipe) recipes;
                Field inputField = ExtremeShapelessRecipe.class.getDeclaredField("input");//反射
                inputField.setAccessible(true);//修改访问权限
                NonNullList<Ingredient> list = (NonNullList<Ingredient>) inputField.get(recipe);//不为空的list
                list.add(CraftingHelper.getIngredient(input));//加入列表
            } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
                new RuntimeException("recipeserror:2", e).printStackTrace();
            }
        } else {
            System.out.println("recipeserror:3");
        }
    }
}