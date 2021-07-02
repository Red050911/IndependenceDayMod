package io.github.redstoneboy0509.mod.independencedaymod.registration;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModGroups {

    public static final ItemGroup MOD_GROUP = new ItemGroup("ridm.mod_group") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.RED_WATER_BALLOON.get());
        }
    };

}
