package fr.zom.csmm.init;

import fr.zom.csmm.blockentity.BlockEntityRedEmerald;
import fr.zom.csmm.utils.Utils;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.function.Supplier;

public class ModBlockEntities {

    private ModBlockEntities(){}

    public static final ModBlockEntities INSTANCE = new ModBlockEntities();

    public BlockEntityType<?> BLOCK_ENTITY_RED_EMERALD;

    public void registerAll()
    {
        BLOCK_ENTITY_RED_EMERALD = registerBlockEntity(BlockEntityRedEmerald::new, "block_entity_red_emerald");
    }

    private BlockEntityType<?> registerBlockEntity(Supplier<? extends BlockEntity> bE, String name)
    {
        return Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(Utils.MODID, name), BlockEntityType.Builder.create(bE, ModBlocks.RED_EMERALD_BLOCK).build(null));
    }

}
