package fr.xibalba.mods.starsbook.data.recipes;

import fr.xibalba.mods.starsbook.ModCore;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModRecipeTypes {
    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZER =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, ModCore.MOD_ID);



    public static void register(IEventBus eventBus) {
        RECIPE_SERIALIZER.register(eventBus);


    }
}
