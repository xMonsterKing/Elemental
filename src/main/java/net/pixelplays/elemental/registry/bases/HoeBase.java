// This Class was created by xMonsterKing


package net.pixelplays.elemental.registry.bases;

import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.pixelplays.elemental.Elemental;

public class HoeBase extends HoeItem {


    public HoeBase(ToolMaterial material) {
        super(material, -1, -1.0F, new Item.Settings().group(Elemental.ITEM_GROUP));
    }
}
