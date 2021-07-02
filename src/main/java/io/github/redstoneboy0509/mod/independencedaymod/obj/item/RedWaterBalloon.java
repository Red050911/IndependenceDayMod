package io.github.redstoneboy0509.mod.independencedaymod.obj.item;

import io.github.redstoneboy0509.mod.independencedaymod.obj.entity.WaterBalloonEntity;
import io.github.redstoneboy0509.mod.independencedaymod.obj.item.base.TooltipableItem;
import io.github.redstoneboy0509.mod.independencedaymod.registration.ModEntityTypes;
import io.github.redstoneboy0509.mod.independencedaymod.registration.ModGroups;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class RedWaterBalloon extends TooltipableItem {

    public RedWaterBalloon() {
        super(new Item.Properties().group(ModGroups.MOD_GROUP), "msg.ridm.tooltip.redwaterbln");
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        if(!worldIn.isRemote) {
            WaterBalloonEntity entity = new WaterBalloonEntity(ModEntityTypes.WATER_BALLOON.get(), playerIn, worldIn);
            entity.setItem(playerIn.getHeldItem(handIn));
            entity.setDirectionAndMovement(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 1.5f, 1.0f);
            worldIn.addEntity(entity);
            playerIn.getHeldItem(handIn).shrink(1);
        }
        return ActionResult.resultSuccess(playerIn.getHeldItem(handIn));
    }

}
