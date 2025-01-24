package com.CatPlasma.CatTech.common.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class ItemAdder_Basic extends Item {
    private List<String> tooltips = new ArrayList<>();

    private String unlocalizedName;

    public ItemAdder_Basic(String Name, String MetaName, CreativeTabs aCreativeTabs){
        super();

        this.setHasSubtypes(true); //启用Meta
        this.setMaxDamage(0); //耐久度
        this.setCreativeTab(aCreativeTabs);
        this.unlocalizedName = MetaName;
        /*
        缺失本地化相关代码 待添加
        */
    }

    public static String generateUnlocalizedName(String MetaName){
        return "item." + MetaName;
    }

    @Override
    public int getMetadata(int aMeta){
        return aMeta;
    }

    @Override
    public String getUnlocalizedName(ItemStack aItemStack){
        return this.unlocalizedName + '.' + aItemStack.getItemDamage();
    }

    @Override
    public String getUnlocalizedName(){
        return this.unlocalizedName;
    }
}
