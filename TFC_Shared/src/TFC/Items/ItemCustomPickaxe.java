package TFC.Items;

import java.util.List;

import TFC.Core.TFCSettings;
import net.minecraft.src.*;

public class ItemCustomPickaxe extends ItemPickaxe
{
	public ItemCustomPickaxe(int i, EnumToolMaterial e)
	{
		super(i, e);
	}

	public String getTextureFile() {
		return "/bioxx/terratools.png";
	}
	
	public void addInformation(ItemStack is, List arraylist) 
    {
        if(TFCSettings.enableDebugMode)
            arraylist.add("Damage: "+is.getItemDamage());
    }
}