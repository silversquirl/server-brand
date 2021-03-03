package vktec.serverbrand.mixin;

import java.util.Properties;
import net.minecraft.server.dedicated.AbstractPropertiesHandler;
import net.minecraft.server.dedicated.ServerPropertiesHandler;
import org.spongepowered.asm.mixin.Mixin;
import vktec.serverbrand.ServerBrandPropertiesDuck;

@Mixin(ServerPropertiesHandler.class)
public abstract class ServerPropertiesHandlerMixin
extends AbstractPropertiesHandler<ServerPropertiesHandler>
implements ServerBrandPropertiesDuck {
	public final String serverBrand = this.getString("brand", "fabric");

	public String getServerBrand() {
		return this.serverBrand;
	}

    public ServerPropertiesHandlerMixin(Properties properties) { super(properties); }
}
