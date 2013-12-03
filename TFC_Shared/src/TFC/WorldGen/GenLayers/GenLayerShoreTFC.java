package TFC.WorldGen.GenLayers;

import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;
import TFC.WorldGen.TFCBiome;

public class GenLayerShoreTFC extends GenLayerTFC
{
	public GenLayerShoreTFC(long par1, GenLayer par3GenLayer)
	{
		super(par1);
		this.parent = (GenLayerTFC) par3GenLayer;
	}

	/**
	 * Returns a list of integer values generated by this layer. These may be interpreted as temperatures, rainfall
	 * amounts, or biomeList[] indices based on the particular GenLayer subclass.
	 */
	@Override
	public int[] getInts(int par1, int par2, int par3, int par4)
	{
		int[] var5 = this.parent.getInts(par1 - 1, par2 - 1, par3 + 2, par4 + 2);
		int[] var6 = IntCache.getIntCache(par3 * par4);

		for (int var7 = 0; var7 < par4; ++var7)
		{
			for (int var8 = 0; var8 < par3; ++var8)
			{
				this.initChunkSeed(var8 + par1, var7 + par2);
				int var9 = var5[var8 + 1 + (var7 + 1) * (par3 + 2)];
				int var10;
				int var11;
				int var12;
				int var13;

				if (var9 != TFCBiome.ocean.biomeID && var9 != TFCBiome.river.biomeID && var9 != TFCBiome.swampland.biomeID && var9 != TFCBiome.HighHills.biomeID)
				{
					var10 = var5[var8 + 1 + (var7 + 1 - 1) * (par3 + 2)];
					var11 = var5[var8 + 1 + 1 + (var7 + 1) * (par3 + 2)];
					var12 = var5[var8 + 1 - 1 + (var7 + 1) * (par3 + 2)];
					var13 = var5[var8 + 1 + (var7 + 1 + 1) * (par3 + 2)];

					if (var10 != TFCBiome.ocean.biomeID && var11 != TFCBiome.ocean.biomeID && var12 != TFCBiome.ocean.biomeID && var13 != TFCBiome.ocean.biomeID)
					{
						var6[var8 + var7 * par3] = var9;
					}
					else
					{
						var6[var8 + var7 * par3] = TFCBiome.beach.biomeID;
					}
				}
				else if (var9 == TFCBiome.HighHills.biomeID)
				{
					var10 = var5[var8 + 1 + (var7 + 1 - 1) * (par3 + 2)];
					var11 = var5[var8 + 1 + 1 + (var7 + 1) * (par3 + 2)];
					var12 = var5[var8 + 1 - 1 + (var7 + 1) * (par3 + 2)];
					var13 = var5[var8 + 1 + (var7 + 1 + 1) * (par3 + 2)];

					if (var10 == TFCBiome.HighHills.biomeID && var11 == TFCBiome.HighHills.biomeID && var12 == TFCBiome.HighHills.biomeID && var13 == TFCBiome.HighHills.biomeID)
					{
						var6[var8 + var7 * par3] = var9;
					}
					else
					{
						var6[var8 + var7 * par3] = TFCBiome.HighHillsEdge.biomeID;
					}
				}
				else if (var9 == TFCBiome.Mountains.biomeID)
				{
					var10 = var5[var8 + 1 + (var7 + 1 - 1) * (par3 + 2)];
					var11 = var5[var8 + 1 + 1 + (var7 + 1) * (par3 + 2)];
					var12 = var5[var8 + 1 - 1 + (var7 + 1) * (par3 + 2)];
					var13 = var5[var8 + 1 + (var7 + 1 + 1) * (par3 + 2)];

					if (var10 == TFCBiome.Mountains.biomeID && var11 == TFCBiome.Mountains.biomeID && var12 == TFCBiome.Mountains.biomeID && var13 == TFCBiome.Mountains.biomeID)
					{
						var6[var8 + var7 * par3] = var9;
					}
					else
					{
						var6[var8 + var7 * par3] = TFCBiome.MountainsEdge.biomeID;
					}
				}
				else if (var9 == TFCBiome.MountainsSeismic.biomeID)
				{
					var10 = var5[var8 + 1 + (var7 + 1 - 1) * (par3 + 2)];
					var11 = var5[var8 + 1 + 1 + (var7 + 1) * (par3 + 2)];
					var12 = var5[var8 + 1 - 1 + (var7 + 1) * (par3 + 2)];
					var13 = var5[var8 + 1 + (var7 + 1 + 1) * (par3 + 2)];

					if (var10 == TFCBiome.MountainsSeismic.biomeID && var11 == TFCBiome.MountainsSeismic.biomeID && var12 == TFCBiome.MountainsSeismic.biomeID && var13 == TFCBiome.MountainsSeismic.biomeID)
					{
						var6[var8 + var7 * par3] = var9;
					}
					else
					{
						var6[var8 + var7 * par3] = TFCBiome.MountainsEdge.biomeID;
					}
				}
				else
				{
					var6[var8 + var7 * par3] = var9;
				}
			}
		}

		return var6;
	}
}
