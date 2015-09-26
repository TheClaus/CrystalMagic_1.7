package com.clausgames.crystalmagic.achievement;

import com.clausgames.crystalmagic.item.ModItems;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemPickupEvent;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.stats.Achievement;
import net.minecraft.item.ItemStack;

public class AchievementTriggerer
{
	@SubscribeEvent
	public void onItemPickedUp(ItemPickupEvent event)
	{
		ItemStack stack = event.pickedUp.getEntityItem();
		if(stack != null && stack.getItem() instanceof IPickupAchievement)
		{
			Achievement achievement = ((IPickupAchievement) stack.getItem()).getAchievementOnPickup(stack, event.player, event.pickedUp);
			if(achievement != null)
				event.player.addStat(achievement, 1);
		}
	}

	@SubscribeEvent
	public void onItemCrafted(ItemCraftedEvent event)
	{
		if(event.crafting != null && event.crafting.getItem() instanceof ICraftAchievement)
		{
			Achievement achievement = ((ICraftAchievement) event.crafting.getItem()).getAchievementOnCraft(event.crafting, event.player, event.craftMatrix);
			if(achievement != null)
				event.player.addStat(achievement, 1);
		}
	}
}