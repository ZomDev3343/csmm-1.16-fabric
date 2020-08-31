package fr.zom.csmm.items;

import fr.zom.csmm.CSMM;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

public class CSMMItem extends Item
{

    public CSMMItem(Settings settings)
    {
        super(settings);
    }

    public CSMMItem()
    {
        super(new Settings());
    }
}
