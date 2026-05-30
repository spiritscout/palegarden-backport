package com.spiritscout.palegarden.registry;

import com.spiritscout.palegarden.PaleGardenBackport;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class PaleGardenBlocks {

    //region wood set
    public static final Block PALE_OAK_PLANKS = registerBlock(
            "pale_oak_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS))
    );


    public static final Block PALE_OAK_STAIRS = registerBlock(
            "pale_oak_stairs",
            new StairsBlock(
                    PALE_OAK_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.OAK_STAIRS)
            )
    );

    public static final Block PALE_OAK_SLAB = registerBlock(
            "pale_oak_slab",
            new SlabBlock(
                    AbstractBlock.Settings.copy(Blocks.OAK_SLAB)
            )
    );

    public static final Block PALE_OAK_FENCE = registerBlock(
            "pale_oak_fence",
            new FenceBlock(
                    AbstractBlock.Settings.copy(Blocks.OAK_FENCE)
            )
    );

    public static final Block PALE_OAK_FENCE_GATE = registerBlock(
            "pale_oak_fence_gate",
            new FenceGateBlock(
                    PaleGardenWoodTypes.PALE_OAK_WOOD_TYPE,
                    AbstractBlock.Settings.copy(Blocks.OAK_FENCE_GATE)
            )
    );

    public static final Block PALE_OAK_BUTTON = registerBlock(
            "pale_oak_button",
            new ButtonBlock(
                    PaleGardenWoodTypes.PALE_OAK_BLOCK_SET_TYPE,
                    30,
                    AbstractBlock.Settings.copy(Blocks.OAK_BUTTON)
            )
    );

    public static final Block PALE_OAK_PRESSURE_PLATE = registerBlock(
            "pale_oak_pressure_plate",
            new PressurePlateBlock(
                    PaleGardenWoodTypes.PALE_OAK_BLOCK_SET_TYPE,
                    AbstractBlock.Settings.copy(Blocks.OAK_PRESSURE_PLATE)
            )
    );
    //endregion

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(
                Registries.BLOCK,
                Identifier.of(PaleGardenBackport.MOD_ID, name),
                block
        );

    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(
                Registries.ITEM,
                Identifier.of(PaleGardenBackport.MOD_ID, name),
                new BlockItem(block, new Item.Settings())
        );
    }

    // Forces class loading, fires static initialisers, registers blocks
    public static void registerModBlocks() {
        PaleGardenBackport.LOGGER.info("Registering Mod Blocks for " + PaleGardenBackport.MOD_ID);
    }

}
