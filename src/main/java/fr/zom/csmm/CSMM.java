package fr.zom.csmm;

import fr.zom.csmm.init.ModBlockEntities;
import fr.zom.csmm.init.ModBlocks;
import fr.zom.csmm.init.ModItems;
import net.fabricmc.api.ModInitializer;

public class CSMM implements ModInitializer
{

    @Override
    public void onInitialize()
    {
        ModItems.INSTANCE.registerItems();
        ModBlocks.INSTANCE.registerAll();
        ModBlockEntities.INSTANCE.registerAll();
    }
}
