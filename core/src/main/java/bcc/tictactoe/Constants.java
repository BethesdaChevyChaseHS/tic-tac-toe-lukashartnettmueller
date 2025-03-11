package bcc.tictactoe;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.ui.Container;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

public final class Constants {
    public static final String[] PLAYER_OPTIONS = { "Human", "Random AI", "Slightly Smart AI", "Smart AI" };

    public static Container<Label> createLabelWithBackgrounColor(String text, Color bgColor, Skin skin) {
        // Create the label using the provided skin.
        Label label = new Label(text, skin);

       .
        Pixmap pixmap = new Pixmap(1, 1, Pixmap.Format.RGBA8888);
        pixmap.setColor(bgColor);
        pixmap.fill();

     
        Texture texture = new Texture(pixmap);
        pixmap.dispose();

      
        TextureRegionDrawable backgroundDrawable = new TextureRegionDrawable(new TextureRegion(texture));

     
        Container<Label> container = new Container<Label>(label);
        container.setBackground(backgroundDrawable);
        container.pad(10); 

        return container;
    }
}
