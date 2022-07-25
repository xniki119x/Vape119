package erx.niki119.vape119.common;

import erx.niki119.vape119.Vape119;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class VapeCreativeTab extends ItemGroup {


    public VapeCreativeTab() {
        super("Vape119");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(Vape119.Vape, 1);
    }
}
