package fr.xibalba.mods.starsbook.container;

import fr.xibalba.mods.starsbook.ModCore;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModContainers {

    public static DeferredRegister<MenuType<?>> CONTAINERS
            = DeferredRegister.create(ForgeRegistries.CONTAINERS, ModCore.MOD_ID);


    public static void register(IEventBus eventBus) {
        CONTAINERS.register(eventBus);
    }
}
