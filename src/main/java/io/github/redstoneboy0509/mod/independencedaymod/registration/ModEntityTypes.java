package io.github.redstoneboy0509.mod.independencedaymod.registration;

import io.github.redstoneboy0509.mod.independencedaymod.obj.entity.WaterBalloonEntity;
import io.github.redstoneboy0509.mod.independencedaymod.obj.item.RedWaterBalloon;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, "ridm");

    public static final RegistryObject<EntityType<WaterBalloonEntity>> WATER_BALLOON = ENTITY_TYPES.register("water_balloon", () -> EntityType.Builder.<WaterBalloonEntity>create(WaterBalloonEntity::new, EntityClassification.MISC).size(0.25f, 0.25f).trackingRange(4).setUpdateInterval(10).build("ridm:water_balloon"));

}
