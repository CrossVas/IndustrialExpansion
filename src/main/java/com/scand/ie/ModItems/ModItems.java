package com.scand.ie.ModItems;

import com.scand.ie.IEMod;
import com.scand.ie.ModItems.custom.FlyModule;
import com.scand.ie.ModItems.custom.SpectralOverclockerUpgrade;
import com.scand.ie.armor.SpectralArmorItem;
import com.scand.ie.block.ModBlocks;
import com.scand.ie.tools.NanoDrill;
import com.scand.ie.tools.QuantumDrill;
import com.scand.ie.tools.SpectralDrill;
import ic2.core.block.base.misc.color.IColorListener;
import ic2.core.item.block.CableItem;
import ic2.core.item.misc.BatteryItem;
import ic2.core.item.wearable.armor.electric.QuantumSuit;
import ic2.core.item.wearable.base.IC2ModularElectricArmor;
import ic2.core.platform.registries.IC2Blocks;
import ic2.core.platform.registries.IC2Items;
import ic2.core.utils.plugins.IRegistryProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.w3c.dom.ls.LSParserFilter;

import static ic2.core.platform.registries.IC2Items.COLORABLE;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, IEMod.MOD_ID);

    public static final RegistryObject<Item> MOON_MATTER = ITEMS.register("moon_matter",
            ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> HIGHLY_ADVANCED_ALLOY = ITEMS.register("highly_advanced_alloy",
            ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> EXTREMELY_ADVANCED_ALLOY = ITEMS.register("extremely_advanced_alloy",
            ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_HIGHLY_ADVANCED_ALLOY = ITEMS.register("raw_highly_advanced_alloy",
            ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> DARK_MATTER_SHARD = ITEMS.register("dark_matter_shard",
            ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> SINGULARIUM = ITEMS.register("singularium",
            ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> SINGULARITY_PLATE = ITEMS.register("singularity_plate",
            ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> DARK_MATTER = ITEMS.register("dark_matter",
            ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> UTEC = ITEMS.register("utec",
            ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));


    public static final RegistryObject<Item> SPECTRAL_SUIT_CHESTPLATE = ITEMS.register("spectral_suit_chestplate",
            ()->new SpectralArmorItem("spectral_suit_chestplate", EquipmentSlot.CHEST));
    public static final RegistryObject<Item> SPECTRAL_SUIT_LEGGINGS = ITEMS.register("spectral_suit_leggings",
            ()->new SpectralArmorItem("spectral_suit_leggings", EquipmentSlot.LEGS));
    public static final RegistryObject<Item> SPECTRAL_SUIT_BOOTS = ITEMS.register("spectral_suit_boots",
            ()->new SpectralArmorItem("spectral_suit_boots", EquipmentSlot.FEET));
    public static final RegistryObject<Item> SPECTRAL_SUIT_HELMET = ITEMS.register("spectral_suit_helmet",
            ()->new SpectralArmorItem("spectral_suit_helmet", EquipmentSlot.HEAD));

    public static final RegistryObject<Item> SPECTRAL_CIRCUIT = ITEMS.register("spectral_circuit",
            ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> QUANTUM_CIRCUIT = ITEMS.register("quantum_circuit",
            ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> NANO_CIRCUIT = ITEMS.register("nano_circuit",
            ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> SPECTRAL_CRAFTING_COMPONENT = ITEMS.register("spectral_crafting_component",
            ()->new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> SPECTRAL_PLATE = ITEMS.register("spectral_plate",
            ()->new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> SPECTRALIUM = ITEMS.register("spectralium",
            ()->new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> NANO_DRILL = ITEMS.register("nano_drill",
            NanoDrill::new);
    public static final RegistryObject<Item> QUANTUM_DRILL = ITEMS.register("quantum_drill",
            QuantumDrill::new);

    public static final RegistryObject<Item> SPECTRAL_DRILL = ITEMS.register("spectral_drill",
            SpectralDrill::new);

    public static final RegistryObject<Item> FLY_MODULE = ITEMS.register("fly_module",
            ()->new FlyModule("armor/modules","fly"));

    public static final RegistryObject<Item> SPECTRAL_CRYSTAL = ITEMS.register("spectral_crystal",
            ()->new BatteryItem("spectral_crystal",100000000, 95000, 5, true,
                    "spectral", true, 100000));

    public static final RegistryObject<Item> SINGULARITY_CRYSTAL = ITEMS.register("singularity_crystal",
            ()->new BatteryItem("singularity_crystal",1000000000, 950000, 6, true,
                    "singularity", true, 10000000));





    public static Item SPECTRAL_CABLE;
    private static void registerSomeCables(){
        //SPECTRAL_CABLE = registerItem(new CableItem("spectral_cable", ModBlocks.SPECTRAL_CABLE.defaultBlockState(), "spectral"));
    }

    public static <T extends Item> T registerItem(T item, ResourceLocation id) {
        ForgeRegistries.ITEMS.register(id, item);
        if (item instanceof IColorListener && ((IColorListener)item).needsColoring()) {
            COLORABLE.add(item);
        }

        return item;
    }

    public static <T extends Item & IRegistryProvider> T registerItem(T item) {
        return registerItem(item, ((IRegistryProvider)item).getRegistryName());
    }

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
        //registerSomeCables();
    }

}
