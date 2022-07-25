package erx.niki119.vape119.common.items;

import erx.niki119.vape119.Vape119;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

import java.util.Random;

public class Vape extends Item {

    public Vape() {
        super(new Properties().group(Vape119.group));
        setRegistryName(new ResourceLocation(Vape119.MODID, "vape"));
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        for (int i = 0; i < 15; i++) {
            Vector3d look = playerIn.getLookVec();
            worldIn.addParticle(
                    ParticleTypes.SMOKE,
                    playerIn.getPosX() + look.x,
                    playerIn.getPosY() + playerIn.getEyeHeight() + look.y * 0.5,
                    playerIn.getPosZ() + look.z,
                    look.x * Math.random() * 0.05,
                    look.y * Math.random() * 0.05,
                    look.z * Math.random() * 0.05
            );
            worldIn.addParticle(
                    ParticleTypes.CAMPFIRE_COSY_SMOKE,
                    playerIn.getPosX() + look.x,
                    playerIn.getPosY() + playerIn.getEyeHeight() + look.y * 0.5,
                    playerIn.getPosZ() + look.z,
                    look.x * Math.random() * 0.05,
                    look.y * Math.random() * 0.05,
                    look.z * Math.random() * 0.05
            );
            worldIn.addParticle(
                    ParticleTypes.CAMPFIRE_SIGNAL_SMOKE,
                    playerIn.getPosX() + look.x,
                    playerIn.getPosY() + playerIn.getEyeHeight() + look.y * 0.5,
                    playerIn.getPosZ() + look.z,
                    look.x * Math.random() * 0.05,
                    look.y * Math.random() * 0.05,
                    look.z * Math.random() * 0.05
            );
        }
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
