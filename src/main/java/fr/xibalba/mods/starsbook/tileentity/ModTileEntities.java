package fr.xibalba.mods.starsbook.tileentity;

import fr.xibalba.mods.starsbook.ModCore;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTileEntities {

    public static DeferredRegister<BlockEntityType<?>> TILE_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, ModCore.MOD_ID);

    public static void register(IEventBus eventBus) {
        TILE_ENTITIES.register(eventBus);
    }
}
