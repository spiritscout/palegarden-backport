package com.spiritscout.palegarden.registry;

import com.spiritscout.palegarden.PaleGardenBackport;
import net.fabricmc.fabric.api.object.builder.v1.block.type.BlockSetTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.type.WoodTypeBuilder;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.WoodType;
import net.minecraft.util.Identifier;

public class PaleGardenWoodTypes {

    public static final BlockSetType PALE_OAK_BLOCK_SET_TYPE =
            BlockSetTypeBuilder.copyOf(BlockSetType.OAK)
                    .register(Identifier.of(PaleGardenBackport.MOD_ID, "pale_oak"));

    public static final WoodType PALE_OAK_WOOD_TYPE =
            WoodTypeBuilder.copyOf(WoodType.OAK)
                    .register(Identifier.of(PaleGardenBackport.MOD_ID, "pale_oak"), PALE_OAK_BLOCK_SET_TYPE);

    public static void registerWoodTypes() {
        PaleGardenBackport.LOGGER.info("Registering Wood Types for " + PaleGardenBackport.MOD_ID);
    }

}
