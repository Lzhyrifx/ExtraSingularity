package com.zeng.registry;

import com.zeng.Main;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static com.zeng.registry.ItemLoader.*;

@Mod.EventBusSubscriber(modid = Main.MOD_ID)
public class ItemColorRegisterHandler {
    @SubscribeEvent
    public static void itemColors(ColorHandlerEvent.Item event) {
        event.getItemColors().registerItemColorHandler(new ItemColor(0xe2be4e),AlubrassSingularity);
        event.getItemColors().registerItemColorHandler(new ItemColor(0xffbaf0),AlumiteSingularity);
        event.getItemColors().registerItemColorHandler(new ItemColor(0x401919),BoundSingularity);
        event.getItemColors().registerItemColorHandler(new ItemColor(0xffa34e),BronzeSingularity);
        event.getItemColors().registerItemColorHandler(new ItemColor(0x000000),ConductiveIronSingularity);
        event.getItemColors().registerItemColorHandler(new ItemColor(0x000000),ConstantanSingularity);
        event.getItemColors().registerItemColorHandler(new ItemColor(0x000000),ConstructionAlloySingularity);
        event.getItemColors().registerItemColorHandler(new ItemColor(0x000000),DarkMatterSingularity);
        event.getItemColors().registerItemColorHandler(new ItemColor(0x000000),DarkSteelSingularity);
        event.getItemColors().registerItemColorHandler(new ItemColor(0x000000),ElectricalSteelSingularity);
        event.getItemColors().registerItemColorHandler(new ItemColor(0x000000),ElectrumSingularity);
        event.getItemColors().registerItemColorHandler(new ItemColor(0xf15cae),ElementiumSingularity);
        event.getItemColors().registerItemColorHandler(new ItemColor(0x000000),EnchantedMetalSingularity);
        event.getItemColors().registerItemColorHandler(new ItemColor(0x000000),EnderiumSingularity);
        event.getItemColors().registerItemColorHandler(new ItemColor(0x000000),EndSteelSingularity);
        event.getItemColors().registerItemColorHandler(new ItemColor(0x000000),EnergeticAlloySingularity);
        event.getItemColors().registerItemColorHandler(new ItemColor(0x000000),EnergiumSingularity);
        event.getItemColors().registerItemColorHandler(new ItemColor(0x6f9b6d),EssenceInfusedSingularity);
        event.getItemColors().registerItemColorHandler(new ItemColor(0x000000),EvilMetalSingularity);
        event.getItemColors().registerItemColorHandler(new ItemColor(0x000000),FluixSingularity);
        event.getItemColors().registerItemColorHandler(new ItemColor(0x000000),InvarSingularity);
        event.getItemColors().registerItemColorHandler(new ItemColor(0x000000),LumiumSingularity);
        event.getItemColors().registerItemColorHandler(new ItemColor(0x000000),MirionSingularity);
        event.getItemColors().registerItemColorHandler(new ItemColor(0x2bea32),OsgloglasSingularity);
        event.getItemColors().registerItemColorHandler(new ItemColor(0x7278d0),OsmiridiumSingularity);
        event.getItemColors().registerItemColorHandler(new ItemColor(0xf0a8a4),PigironSingularity);
        event.getItemColors().registerItemColorHandler(new ItemColor(0x000000),QuicksilverSingularity);
        event.getItemColors().registerItemColorHandler(new ItemColor(0x000000),RedMatterSingularity);
        event.getItemColors().registerItemColorHandler(new ItemColor(0x000000),RedstoneAlloySingularity);
        event.getItemColors().registerItemColorHandler(new ItemColor(0x000000),RefinedObsidianSingularity);
        event.getItemColors().registerItemColorHandler(new ItemColor(0xFF69B4),SakurasteelSingularity);
        event.getItemColors().registerItemColorHandler(new ItemColor(0x000000),ShadowiumSingularity);
        event.getItemColors().registerItemColorHandler(new ItemColor(0x000000),SignalumSingularity);
        event.getItemColors().registerItemColorHandler(new ItemColor(0x000000),SoulariumSingularity);
        event.getItemColors().registerItemColorHandler(new ItemColor(0x515151),SteelSingularity);
        event.getItemColors().registerItemColorHandler(new ItemColor(0x00FF00),TerrasteelSingularity);
        event.getItemColors().registerItemColorHandler(new ItemColor(0x000000),UUMatterSingularity);
        event.getItemColors().registerItemColorHandler(new ItemColor(0x000000),VibrantAlloySingularity);
        event.getItemColors().registerItemColorHandler(new ItemColor(0x623c87),WyvernMetalSingularity);
    }
}
