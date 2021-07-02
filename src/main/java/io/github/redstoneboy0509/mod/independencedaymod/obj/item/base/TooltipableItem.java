package io.github.redstoneboy0509.mod.independencedaymod.obj.item.base;

import io.github.redstoneboy0509.mod.independencedaymod.util.Util;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.List;

@ParametersAreNonnullByDefault
public class TooltipableItem extends Item {

    protected String tooltipKey;

    public TooltipableItem(Properties properties, String tooltipKey) {
        super(properties);
        this.tooltipKey = tooltipKey;
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        if(Util.isPressingShift()) {
            tooltip.add(this.getTooltip());
        } else {
            tooltip.add(new TranslationTextComponent("msg.ridm.tooltip.notshifting"));
        }
    }

    public String getTooltipKey() {
        return tooltipKey;
    }

    public void setTooltipKey(String tooltipKey) {
        this.tooltipKey = tooltipKey;
    }

    public ITextComponent getTooltip() {
        return new TranslationTextComponent(tooltipKey);
    }

}
