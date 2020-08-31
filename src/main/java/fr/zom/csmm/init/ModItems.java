package fr.zom.csmm.init;

import fr.zom.csmm.utils.Utils;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems
{

    public static final ModItems INSTANCE = new ModItems();

    public static final Item BLUE_APPLE = new Item(new Item.Settings().group(ItemGroup.FOOD));

    public void registerItems()
    {
        registerItem(BLUE_APPLE, "blue_apple");
    }

    public void registerItem(Item item, String name)
    {
        Registry.register(Registry.ITEM, new Identifier(Utils.MODID, name), item);
    }

}
