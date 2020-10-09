package fr.zom.csmm.init;

import fr.zom.csmm.toolmaterials.CopperToolMaterial;
import fr.zom.csmm.utils.Utils;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems
{

    public static final ModItems INSTANCE = new ModItems();

    public static final Item BLUE_APPLE = new Item(new Item.Settings().group(ItemGroup.FOOD));

    public static final Item COPPER_SWORD = new SwordItem(CopperToolMaterial.INSTANCE, 2, -2.4f, new Item.Settings().maxCount(1).group(ItemGroup.TOOLS));

    public void registerItems()
    {
        registerItem(BLUE_APPLE, "blue_apple");
        registerItem(COPPER_SWORD, "copper_sword");
    }

    public void registerItem(Item item, String name)
    {
        Registry.register(Registry.ITEM, new Identifier(Utils.MODID, name), item);
    }

}
