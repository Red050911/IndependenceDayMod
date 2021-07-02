package io.github.redstoneboy0509.mod.independencedaymod.obj.entity;

import io.github.redstoneboy0509.mod.independencedaymod.registration.ModItems;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.ProjectileItemEntity;
import net.minecraft.item.Item;
import net.minecraft.network.IPacket;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

import javax.annotation.ParametersAreNonnullByDefault;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault
public class WaterBalloonEntity extends ProjectileItemEntity {

    public WaterBalloonEntity(EntityType<? extends ProjectileItemEntity> type, LivingEntity livingEntityIn, World worldIn) {
        super(type, livingEntityIn, worldIn);
    }

    public WaterBalloonEntity(EntityType<? extends ProjectileItemEntity> type, World worldIn) {
        super(type, worldIn);
    }

    @Override
    protected Item getDefaultItem() {
        return ModItems.RED_WATER_BALLOON.get();
    }

    @Override
    public IPacket<?> createSpawnPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    @Override
    protected void onImpact(RayTraceResult result) {
        super.onImpact(result);
        this.world.addParticle(ParticleTypes.SPLASH, this.getPosX(), this.getPosY(), this.getPosZ(), 0.1, 0.3, 0);
        this.world.addParticle(ParticleTypes.SPLASH, this.getPosX(), this.getPosY(), this.getPosZ(), 0, 0.3, 0.1);
        this.world.addParticle(ParticleTypes.SPLASH, this.getPosX(), this.getPosY(), this.getPosZ(), 0.1, 0.3, 0.1);
        this.world.addParticle(ParticleTypes.SPLASH, this.getPosX(), this.getPosY(), this.getPosZ(), -0.1, 0.3, -0.1);
    }
}
