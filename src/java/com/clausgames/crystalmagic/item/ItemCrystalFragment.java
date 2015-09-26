package com.clausgames.crystalmagic.item;

import com.clausgames.crystalmagic.CrystalMagic;
import com.clausgames.crystalmagic.achievement.IPickupAchievement;
import com.clausgames.crystalmagic.achievement.ModAchievements;
import com.clausgames.crystalmagic.lib.LibMisc;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;

public class ItemCrystalFragment extends ItemCrystalMagic implements IPickupAchievement
{
    public ItemCrystalFragment()
    {
        super();
        this.setUnlocalizedName("ItemCrystalFragment");
        this.setCreativeTab(CrystalMagic.tabCrystalMagic);
    }

    @Override
    public Achievement getAchievementOnPickup(ItemStack stack, EntityPlayer player, EntityItem item) {
        return stack.getItemDamage() == 0 ? ModAchievements.crystalFragment : null;
    }
}
