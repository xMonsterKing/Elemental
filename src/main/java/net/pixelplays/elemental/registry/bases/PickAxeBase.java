// This Class was created by xMonsterKing


package net.pixelplays.elemental.registry.bases;

import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.pixelplays.elemental.Elemental;

public class PickAxeBase extends PickaxeItem {

    public PickAxeBase(ToolMaterial material) {
        super(material, 2, -2.8F, new Item.Settings().group(Elemental.ITEM_GROUP));
    }
}
