package vktec.serverbrand.mixin;

import net.minecraft.server.dedicated.MinecraftDedicatedServer;
import net.minecraft.server.dedicated.ServerPropertiesHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import vktec.serverbrand.ServerBrandPropertiesDuck;

@Mixin(MinecraftDedicatedServer.class)
public abstract class MinecraftDedicatedServerMixin {
	@Shadow public abstract ServerPropertiesHandler getProperties();
	public String getServerModName() {
		return ((ServerBrandPropertiesDuck)this.getProperties()).getServerBrand();
	}
}
