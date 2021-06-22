// This Class was created by xMonsterKing


package net.pixelplays.elemental.registry.bases;

import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.pixelplays.elemental.Elemental;

public class SwordBase extends SwordItem {

    public SwordBase(ToolMaterial toolMaterial) {
        super(toolMaterial, 4, -2.8F, new Item.Settings().group(Elemental.ITEM_GROUP));
    }
}
