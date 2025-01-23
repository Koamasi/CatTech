package com.CatPlasma.CatTech.common.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class RegistryHandler {
    public static void registryItems(){
        Item[] itemsToReg = {

        };

        for (Item item : itemsToReg){
            GameRegistry.registerItem(item, item.getUnlocalizedName());
        }
    }


}
