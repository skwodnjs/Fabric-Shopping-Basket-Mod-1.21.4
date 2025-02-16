package jwn.shopping_basket_mod;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.lwjgl.glfw.GLFW;

import static jwn.shopping_basket_mod.ShoppingBasketModClient.MOD_ID;

public class ShoppingBasketScreen extends Screen {
    private static final Identifier BACKGROUND_TEXTURE = Identifier.of(MOD_ID, "textures/gui/book.png");    // 1010, 720
    private int guiLeft;
    private int guiTop;
    private final int guiWidth = 202;
    private final int guiHeight = 144;

    protected ShoppingBasketScreen() {
        super(Text.literal("Hello, world!"));
    }

    @Override
    protected void init() {
        guiLeft = (width - guiWidth) / 2;
        guiTop = (height - guiHeight) / 2;
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        super.render(context, mouseX, mouseY, delta);
        context.drawTexture(RenderLayer::getGuiTextured, BACKGROUND_TEXTURE, guiLeft, guiTop, 0.0F, 0.0F, guiWidth, guiHeight, guiWidth, guiHeight);
    }

    @Override
    public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
        if (client != null && keyCode == GLFW.GLFW_KEY_B) {
            client.setScreen(null);
            return true;
        }
        return super.keyPressed(keyCode, scanCode, modifiers);
    }
}

