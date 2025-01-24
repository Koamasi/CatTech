package com.CatPlasma.CatTech.client;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.List;

@SideOnly(Side.CLIENT)
public class ItemAdder_Basic extends Item {

    private List<String> tooltips = new ArrayList<>();

    public ItemAdder_Basic(List<String> tooltips){
        super();
        this.tooltips = tooltips;
    }

    @Override
    public void getSubItems(Item aItem, CreativeTabs aCreativeTabs, List aList){
        aList.add(new ItemStack(aItem, 1, 0));
    }

    public void addInformation(
        ItemStack aItemStack,
        EntityPlayer aEntityPlayer,
        List aTooltipsList
    ){
        if (!tooltips.isEmpty()){
            aTooltipsList.addAll(tooltips);
        }
    }
}
