package io.github.redstoneboy0509.mod.independencedaymod.registration;

import io.github.redstoneboy0509.mod.independencedaymod.obj.block.WatermelonCrop;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "ridm");
    public static final DeferredRegister<Item> BLOCK_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "ridm");

    public static final RegistryObject<Block> WATERMELON_CROP = BLOCKS.register("watermelon", WatermelonCrop::new);
    public static final RegistryObject<Item> WATERMELON_SEED = BLOCK_ITEMS.register("watermelon_seeds", () -> new BlockItem(WATERMELON_CROP.get(), new Item.Properties().group(ModGroups.MOD_GROUP)));

}
