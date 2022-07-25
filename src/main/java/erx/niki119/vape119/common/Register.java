package erx.niki119.vape119.common;

import erx.niki119.vape119.Vape119;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static erx.niki119.vape119.Vape119.Vape;

@Mod.EventBusSubscriber(
        modid = Vape119.MODID,
        bus = Mod.EventBusSubscriber.Bus.MOD
)
public class Register {

    @SubscribeEvent
    static void regItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(Vape);
    }
}
