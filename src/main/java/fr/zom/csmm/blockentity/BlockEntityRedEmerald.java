package fr.zom.csmm.blockentity;

import fr.zom.csmm.init.ModBlockEntities;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.util.Tickable;

public class BlockEntityRedEmerald extends BlockEntity implements Tickable{

    private int counter;

    public BlockEntityRedEmerald() {
        super(ModBlockEntities.INSTANCE.BLOCK_ENTITY_RED_EMERALD);
    }

    @Override
    public CompoundTag toTag(CompoundTag tag) {
        super.toTag(tag);

        tag.putInt("counter", this.counter);

        return tag;
    }

    @Override
    public void fromTag(BlockState state, CompoundTag tag) {
        super.fromTag(state, tag);
        this.counter = tag.getInt("counter");
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    @Override
    public void tick() {
        this.counter++;
    }
}
