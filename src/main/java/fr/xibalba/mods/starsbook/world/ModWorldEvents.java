package fr.xibalba.mods.starsbook.world;

import fr.xibalba.mods.starsbook.ModCore;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ModCore.MOD_ID)
public class ModWorldEvents {

    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {

    }

    @SubscribeEvent
    public static void addDimensionalSpacing(final WorldEvent.Load event) {

    }
}
