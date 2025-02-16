package jwn.shopping_basket_mod;

import net.fabricmc.api.ClientModInitializer;

public class ShoppingBasketModClient implements ClientModInitializer {
    public static final String MOD_ID = "shopping_basket_mod";

    @Override
    public void onInitializeClient() {
        KeyInputHandler.register();
    }
}
