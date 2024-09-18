package net.crimson.additional.item;

import net.crimson.additional.Additional;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item STAR_DUST = registerItem("star_dust", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Additional.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Additional.LOGGER.info("Registering Mod Items for " + Additional.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(STAR_DUST);
        });
    }
}
