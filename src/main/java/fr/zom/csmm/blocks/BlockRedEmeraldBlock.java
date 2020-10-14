package fr.zom.csmm.blocks;

import fr.zom.csmm.blockentity.BlockEntityRedEmerald;
import fr.zom.csmm.init.ModBlocks;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.LiteralText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class BlockRedEmeraldBlock extends Block implements BlockEntityProvider {

    public BlockRedEmeraldBlock() {
        super(Settings.copy(ModBlocks.BLUE_EMERALD_BLOCK));
    }

    @Override
    public BlockEntity createBlockEntity(BlockView world) {
        return new BlockEntityRedEmerald();
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {

        if(world.getBlockEntity(pos) instanceof BlockEntityRedEmerald)
        {
            BlockEntityRedEmerald be = (BlockEntityRedEmerald) world.getBlockEntity(pos);
            player.sendMessage(new LiteralText("Counter : " + be.getCounter()), true);
            return ActionResult.SUCCESS;
        }

        return ActionResult.PASS;
    }
}
