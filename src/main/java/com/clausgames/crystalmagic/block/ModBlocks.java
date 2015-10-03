package com.clausgames.crystalmagic.block;

import com.clausgames.crystalmagic.lib.LibMisc;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

@GameRegistry.ObjectHolder(LibMisc.MODID)
public class ModBlocks
{
	// Declaration of Blocks
	public static Block blockCrystalOre = new BlockCrystalOre(Material.rock);
	public static BlockGoldenBars blockGoldenBars = new BlockGoldenBars();
	public static Block goldCrystalPlant = new GoldCrystalPlant();
	public static OreInfusedStone goldInfusedStone = new GoldInfusedStone(Material.rock);

	public static void init()
	{
		GameRegistry.registerBlock(blockCrystalOre, "blockCrystalOre");
		GameRegistry.registerBlock(blockGoldenBars, "blockGoldenBars");
		GameRegistry.registerBlock(goldCrystalPlant, "goldCrystalPlant");
		GameRegistry.registerBlock(goldInfusedStone, "GoldInfusedStone");
	}
}