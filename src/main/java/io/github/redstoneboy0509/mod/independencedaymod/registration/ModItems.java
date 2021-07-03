package io.github.redstoneboy0509.mod.independencedaymod.registration;

import io.github.redstoneboy0509.mod.independencedaymod.obj.item.BlackWaterBalloon;
import io.github.redstoneboy0509.mod.independencedaymod.obj.item.RedWaterBalloon;
import io.github.redstoneboy0509.mod.independencedaymod.obj.item.Sparkler;
import io.github.redstoneboy0509.mod.independencedaymod.obj.item.Watermelon;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "ridm");

    public static final RegistryObject<Item> SPARKLER = ITEMS.register("sparkler", Sparkler::new);
    public static final RegistryObject<Item> RED_WATER_BALLOON = ITEMS.register("red_water_balloon", RedWaterBalloon::new);
    public static final RegistryObject<Item> BLACK_WATER_BALLOON = ITEMS.register("black_water_balloon", BlackWaterBalloon::new);
    public static final RegistryObject<Item> WATERMELON = ITEMS.register("watermelon", Watermelon::new);

}
