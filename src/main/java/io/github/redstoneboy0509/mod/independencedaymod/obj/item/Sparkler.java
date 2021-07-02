package io.github.redstoneboy0509.mod.independencedaymod.obj.item;

import io.github.redstoneboy0509.mod.independencedaymod.obj.item.base.TooltipableItem;
import io.github.redstoneboy0509.mod.independencedaymod.registration.ModGroups;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public class Sparkler extends TooltipableItem {

    public Sparkler() {
        super(new Item.Properties().group(ModGroups.MOD_GROUP), "msg.ridm.tooltip.sparkler");
    }

    @Override
    public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
        if(isSelected) {
            worldIn.addParticle(ParticleTypes.FLAME, entityIn.getPosX(), entityIn.getPosYEye(), entityIn.getPosZ(), 0.1, 0.1, 0);
            worldIn.addParticle(ParticleTypes.FLAME, entityIn.getPosX(), entityIn.getPosYEye(), entityIn.getPosZ(), 0, 0.1, 0.1);
            worldIn.addParticle(ParticleTypes.FLAME, entityIn.getPosX(), entityIn.getPosYEye(), entityIn.getPosZ(), 0.1, 0.1, 0.1);
            worldIn.addParticle(ParticleTypes.FLAME, entityIn.getPosX(), entityIn.getPosYEye(), entityIn.getPosZ(), -0.1, 0.1, -0.1);
            worldIn.playSound(entityIn.getPosX(), entityIn.getPosYEye(), entityIn.getPosZ(), SoundEvents.BLOCK_FIRE_AMBIENT, SoundCategory.PLAYERS, 100f, 0.5f, false);
        }
    }
}
