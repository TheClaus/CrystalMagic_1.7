package com.clausgames.crystalmagic.handler;

import com.clausgames.crystalmagic.achievement.ModAchievements;
import com.clausgames.crystalmagic.item.ModItems;
import com.clausgames.crystalmagic.item.tool.ModTools;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.BlockEvent;

public class VanillaDropHandler //This is overriding drop tables of vanilla blocks.
{
    public static void init()
    {
        MinecraftForge.EVENT_BUS.register(new VanillaDropHandler());
    }

    @SubscribeEvent
    public void onBlockDropItems(BlockEvent.HarvestDropsEvent event) //This is overriding drop tables of vanilla blocks.
    {
        if (event.block == Blocks.gravel)
        {
            World world = event.world;
            EntityPlayerMP player = (EntityPlayerMP) event.harvester;
            if(player.getCurrentEquippedItem() != null)
            {
                Item toolUsed = player.getCurrentEquippedItem().getItem(); // Checks what tool was that player used to break item.
                if (toolUsed == (Items.iron_shovel) || toolUsed == (Items.diamond_shovel))
                {
                    if (world.rand.nextFloat() < 0.25f) //25% Chance to drop a CrystalFragment if using the right shovel!
                    {
                        if(!player.func_147099_x().hasAchievementUnlocked(ModAchievements.crystalFragmentPickup))
                        {
                            event.drops.add(new ItemStack(ModItems.itemCrystalCodex));
                            event.drops.add(new ItemStack(ModItems.itemCrystalFragment, world.rand.nextInt(2) + 1)); //drops Crystal Fragment 1-2
                        }
                        event.drops.add(new ItemStack(ModItems.itemCrystalFragment, world.rand.nextInt(2) + 1)); //drops Crystal Fragment 1-2
                    }
                }
            }
        }

        if (event.block == Blocks.coal_ore)
        {
            ItemStack stack = new ItemStack(ModItems.itemCoalCrystalFragment, 1, 0);
            World world = event.world;
            EntityPlayer player = event.harvester;
            if(player.getCurrentEquippedItem() != null)
            {
                Item toolUsed = player.getCurrentEquippedItem().getItem(); // Checks what tool was that player used to break item.
                if (toolUsed.equals(ModTools.itemCrystalEdgedPickaxe))
                {
                    if (world.rand.nextFloat() < 0.05f) //5% Chance to drop an OreCrystalFragment Seed if using the right pick!
                    {
                        event.drops.add(stack);
                    }
                }
            }
        }

        if (event.block == Blocks.redstone_ore ||  event.block == Blocks.lit_redstone_ore)
        {
            ItemStack stack = new ItemStack(ModItems.itemRedstoneCrystalFragment, 1, 0);
            World world = event.world;
            EntityPlayer player = event.harvester;
            if(player.getCurrentEquippedItem() != null)
            {
                Item toolUsed = player.getCurrentEquippedItem().getItem(); // Checks what tool was that player used to break item.
                if (toolUsed.equals(ModTools.itemCrystalEdgedPickaxe))
                {
                    if (world.rand.nextFloat() < 0.05f) //5% Chance to drop an OreCrystalFragment Seed if using the right pick!
                    {
                        event.drops.add(stack);
                    }
                }
            }
        }

        if (event.block == Blocks.lapis_ore)
        {
            ItemStack stack = new ItemStack(ModItems.itemLapisCrystalFragment, 1, 0);
            World world = event.world;
            EntityPlayer player = event.harvester;
            if(player.getCurrentEquippedItem() != null)
            {
                Item toolUsed = player.getCurrentEquippedItem().getItem(); // Checks what tool was that player used to break item.
                if (toolUsed.equals(ModTools.itemCrystalEdgedPickaxe))
                {
                    if (world.rand.nextFloat() < 0.05f) //5% Chance to drop an OreCrystalFragment Seed if using the right pick!
                    {
                        event.drops.add(stack);
                    }
                }
            }
        }

        if (event.block == Blocks.quartz_ore)
        {
            ItemStack stack = new ItemStack(ModItems.itemQuartzCrystalFragment, 1, 0);
            World world = event.world;
            EntityPlayer player = event.harvester;
            if(player.getCurrentEquippedItem() != null)
            {
                Item toolUsed = player.getCurrentEquippedItem().getItem(); // Checks what tool was that player used to break item.
                if (toolUsed.equals(ModTools.itemCrystalEdgedPickaxe))
                {
                    if (world.rand.nextFloat() < 0.05f) //5% Chance to drop an OreCrystalFragment Seed if using the right pick!
                    {
                        event.drops.add(stack);
                    }
                }
            }
        }

        if (event.block == Blocks.iron_ore)
        {
            ItemStack stack = new ItemStack(ModItems.itemIronCrystalFragment, 1, 0);
            World world = event.world;
            EntityPlayer player = event.harvester;
            if(player.getCurrentEquippedItem() != null)
            {
                Item toolUsed = player.getCurrentEquippedItem().getItem(); // Checks what tool was that player used to break item.
                if (toolUsed.equals(ModTools.itemCrystalEdgedPickaxe))
                {
                    if (world.rand.nextFloat() < 0.05f) //5% Chance to drop an OreCrystalFragment Seed if using the right pick!
                    {
                        event.drops.add(stack);
                    }
                }
            }
        }

        if (event.block == Blocks.gold_ore)
        {
            ItemStack stack = new ItemStack(ModItems.itemGoldCrystalFragment, 1, 0);
            World world = event.world;
            EntityPlayer player = event.harvester;
            if(player.getCurrentEquippedItem() != null)
            {
                Item toolUsed = player.getCurrentEquippedItem().getItem(); // Checks what tool was that player used to break item.
                if (toolUsed.equals(ModTools.itemCrystalEdgedPickaxe))
                {
                    if (world.rand.nextFloat() < 0.05f) //5% Chance to drop an OreCrystalFragment Seed if using the right pick!
                    {
                        event.drops.add(stack);
                    }
                }
            }
        }

        if (event.block == Blocks.diamond_ore)
        {
            ItemStack stack = new ItemStack(ModItems.itemDiamondCrystalFragment, 1, 0);
            World world = event.world;
            EntityPlayer player = event.harvester;
            if(player.getCurrentEquippedItem() != null)
            {
                Item toolUsed = player.getCurrentEquippedItem().getItem(); // Checks what tool was that player used to break item.
                if (toolUsed.equals(ModTools.itemCrystalEdgedPickaxe))
                {
                    if (world.rand.nextFloat() < 0.05f) //5% Chance to drop an OreCrystalFragment Seed if using the right pick!
                    {
                        event.drops.add(stack);
                    }
                }
            }
        }

        if (event.block == Blocks.emerald_ore)
        {
            ItemStack stack = new ItemStack(ModItems.itemEmeraldCrystalFragment, 1, 0);
            World world = event.world;
            EntityPlayer player = event.harvester;
            if(player.getCurrentEquippedItem() != null)
            {
                Item toolUsed = player.getCurrentEquippedItem().getItem(); // Checks what tool was that player used to break item.
                if (toolUsed.equals(ModTools.itemCrystalEdgedPickaxe))
                {
                    if (world.rand.nextFloat() < 0.05f) //5% Chance to drop an OreCrystalFragment Seed if using the right pick!
                    {
                        event.drops.add(stack);
                    }
                }
            }
        }
    }
}