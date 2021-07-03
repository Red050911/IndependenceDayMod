package io.github.redstoneboy0509.mod.independencedaymod.obj.item;

import io.github.redstoneboy0509.mod.independencedaymod.obj.item.base.TooltipableItem;
import io.github.redstoneboy0509.mod.independencedaymod.registration.ModGroups;
import net.minecraft.item.Food;

public class Watermelon extends TooltipableItem {

    public Watermelon() {
        super(new Properties().group(ModGroups.MOD_GROUP).food(new Food.Builder().saturation(0.6F).hunger(5).build()), "msg.ridm.tooltip.watermelon");
    }

}
