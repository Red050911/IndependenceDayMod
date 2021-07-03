package io.github.redstoneboy0509.mod.independencedaymod.client;

import io.github.redstoneboy0509.mod.independencedaymod.registration.ModBlocks;
import io.github.redstoneboy0509.mod.independencedaymod.registration.ModEntityTypes;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.entity.SpriteRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = "ridm", bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientSub {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        //ProjectileItemEntities
        ItemRenderer iRend = Minecraft.getInstance().getItemRenderer();
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.WATER_BALLOON.get(), (renderManager) -> new SpriteRenderer<>(renderManager, iRend));
        //Render Types
        RenderTypeLookup.setRenderLayer(ModBlocks.WATERMELON_CROP.get(), RenderType.getCutout());
    }

}
