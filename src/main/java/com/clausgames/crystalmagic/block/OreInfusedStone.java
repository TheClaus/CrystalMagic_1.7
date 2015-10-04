package com.clausgames.crystalmagic.block;


import com.clausgames.crystalmagic.creativetab.CreativeTabCrystalMagic;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;

public class OreInfusedStone extends BlockCrystalMagic
{
    protected OreInfusedStone(Material material)
    {
        super(Material.rock);
        this.setHardness(2.0f);
        this.setResistance(6.0f);
        this.setHarvestLevel("pickaxe", 2);
        this.setStepSound(soundTypeStone);
        this.setCreativeTab(CreativeTabCrystalMagic.tabCrystalMagic);
    }

    @Override
    public boolean isFertile(World world, int x, int y, int z)
    {
        return false; //Water cannot "hydrate" this soil to increase crop growth rate. //TODO Nature growth increases? If so, we can add an IF statement to see if one is nearby.
    }
}