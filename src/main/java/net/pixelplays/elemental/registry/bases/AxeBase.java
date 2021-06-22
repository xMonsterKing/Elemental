// This Class was created by xMonsterKing


package net.pixelplays.elemental.registry.bases;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.pixelplays.elemental.Elemental;

public class AxeBase extends AxeItem {

    public AxeBase(ToolMaterial material) {
        super(material, 7, -3.1F, new Item.Settings().group(Elemental.ITEM_GROUP));
    }

}
