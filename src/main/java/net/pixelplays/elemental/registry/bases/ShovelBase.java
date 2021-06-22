// This Class was created by xMonsterKing


package net.pixelplays.elemental.registry.bases;

import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;
import net.pixelplays.elemental.Elemental;

public class ShovelBase extends ShovelItem {


    public ShovelBase(ToolMaterial material) {
        super(material, 2.5F, -3.0F, new Item.Settings().group(Elemental.ITEM_GROUP));
    }
}
