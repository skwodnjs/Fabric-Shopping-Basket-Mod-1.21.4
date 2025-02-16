package jwn.shopping_basket_mod;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.text.Text;
import org.lwjgl.glfw.GLFW;

import static jwn.shopping_basket_mod.ShoppingBasketModClient.MOD_ID;

public class KeyInputHandler {
    public static final String KEY_CATEGORY_SHOPPING_MOD = "key.category." + MOD_ID + ".shopping_mod";
    public static final String SHOPPING_BASKET_SCREEN = "key." + MOD_ID + ".shopping_basket_screen";

    public static KeyBinding ShoppingBasketScreenOpen;

    public static void registerKeyInputs() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (ShoppingBasketScreenOpen.wasPressed()) {
                client.setScreen(new ShoppingBasketScreen());
            }
        });
    }

    public static void register() {
        ShoppingBasketScreenOpen = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                SHOPPING_BASKET_SCREEN,
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_B,
                KEY_CATEGORY_SHOPPING_MOD
        ));

        registerKeyInputs();
    }
}
