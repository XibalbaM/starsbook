package fr.xibalba.mods.starsbook;

import fr.xibalba.mods.starsbook.block.ModBlocks;
import fr.xibalba.mods.starsbook.container.ModContainers;
import fr.xibalba.mods.starsbook.data.recipes.ModRecipeTypes;
import fr.xibalba.mods.starsbook.entity.ModEntityTypes;
import fr.xibalba.mods.starsbook.fluid.ModFluids;
import fr.xibalba.mods.starsbook.item.ModItems;
import fr.xibalba.mods.starsbook.tileentity.ModTileEntities;
import fr.xibalba.mods.starsbook.util.ModSoundEvents;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ModCore.MOD_ID)
public class ModCore {

    public static final String MOD_ID = "starsbook";

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public ModCore() {
        // Register the setup method for modloading
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModRecipeTypes.register(eventBus);

        ModBlocks.register(eventBus);
        ModTileEntities.register(eventBus);
        ModContainers.register(eventBus);
        ModFluids.register(eventBus);

        ModSoundEvents.register(eventBus);

        ModEntityTypes.register(eventBus);

        // Register the setup method for modloading
        eventBus.addListener(this::setup);
        // Register the enqueueIMC method for modloading
        eventBus.addListener(this::enqueueIMC);
        // Register the doClientStuff method for modloading
        eventBus.addListener(this::doClientStuff);
        // Register the doServerStuff method for modloading
        eventBus.addListener(this::doServerStuff);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {


        });
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> {


        });
    }

    private void doServerStuff(final FMLDedicatedServerSetupEvent event) {

    }

    private void enqueueIMC(final InterModEnqueueEvent event) {

    }
}
