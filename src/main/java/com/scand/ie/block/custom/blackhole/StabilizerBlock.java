package com.scand.ie.block.custom.blackhole;

import com.scand.ie.IEMod;
import com.scand.ie.block.AdvancedEVSolarPanelBlock;
import ic2.core.block.base.drops.IBlockDropProvider;
import ic2.core.block.generators.BaseGeneratorBlock;
import ic2.core.platform.rendering.features.providers.ToggleProvider;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class StabilizerBlock extends BaseGeneratorBlock{
    public StabilizerBlock(String blockName, BlockEntityType<? extends BlockEntity> type) {
        super(blockName, IBlockDropProvider.SELF_OR_COLOSSAL,
                new ToggleProvider(IEMod.MOD_ID, blockName), type);
    }
}
