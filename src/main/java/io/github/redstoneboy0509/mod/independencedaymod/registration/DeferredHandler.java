package io.github.redstoneboy0509.mod.independencedaymod.registration;

import net.minecraftforge.eventbus.api.IEventBus;

public class DeferredHandler {

    public static void register(IEventBus bus) {
        ModItems.ITEMS.register(bus);
        ModEntityTypes.ENTITY_TYPES.register(bus);
    }

}
