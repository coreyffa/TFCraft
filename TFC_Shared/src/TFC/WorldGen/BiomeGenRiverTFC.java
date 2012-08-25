package TFC.WorldGen;

public class BiomeGenRiverTFC extends TFCBiome
{
	public BiomeGenRiverTFC(int i)
	{
		super(i);
		spawnableCreatureList.clear();
		((BiomeDecoratorTFC)this.theBiomeDecorator).looseRocksPerChunk = 4;
		((BiomeDecoratorTFC)this.theBiomeDecorator).looseRocksChancePerChunk = 90;
		setMinMaxHeight(-0.8F, -0.4F);
	}
}
