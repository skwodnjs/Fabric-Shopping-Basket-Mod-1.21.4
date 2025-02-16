package jwn.shopping_basket_mod;

import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.text.Text;

public class CustomUtil {
    public static void sendClientMessage(ClientPlayerEntity player, Text message, boolean overlay) {
        if (player != null) {
            player.sendMessage(message, overlay);
        }
    }
}
