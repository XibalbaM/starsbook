package fr.xibalba.mods.starsbook.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ModCreativeTabs {

    public static final CreativeModeTab TUTORIAL_GROUP = new CreativeModeTab("tempTab") {

        @Override
        public ItemStack makeIcon() {

            return new ItemStack(Items.IRON_AXE);
        }
    };

}
