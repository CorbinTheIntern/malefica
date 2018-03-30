package theintern.malefica.init;

import net.minecraft.item.Item;

public class ModItems {
	public static Item ucrite;
	public static Item zaskum;
	public static Item asirion;
	public static Item gratryx;
	
	public void init() {
		ucrite = new Item().setUnlocalizedName("ucrite").setRegistryName("ItemUcrite");
		zaskum = new Item().setUnlocalizedName("zaskum").setRegistryName("ItemZaskum");
		asirion = new Item().setUnlocalizedName("asirion").setRegistryName("ItemAsirion");
		gratryx = new Item().setUnlocalizedName("gratryx").setRegistryName("ItemGratryx");
	}
}