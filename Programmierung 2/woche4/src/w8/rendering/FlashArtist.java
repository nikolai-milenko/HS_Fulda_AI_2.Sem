package w8.rendering;

import javashooter.rendering.RectArtist;
import javashooter.gameobjects.GameObject;

import java.awt.*;

public class FlashArtist extends RectArtist {

    private final double startTime;

    public FlashArtist(GameObject go, double width, double height) {
        super(go, width, height, Color.RED);
        this.startTime = go.getGameTime();
    }

    @Override
    public void draw(Graphics2D g) {
        double elapsed = gameObject.getGameTime() - startTime;

        if (((int)(elapsed * 2)) % 2 == 0) {
            this.color = Color.RED;
        } else {
            this.color = Color.BLUE;
        }

        super.draw(g);
    }
}
