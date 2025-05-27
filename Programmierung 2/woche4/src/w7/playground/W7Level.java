package w7.playground;

import javashooter.controller.KinematicsController;
import javashooter.gameobjects.GameObject;
import javashooter.gameobjects.RectObject;
import javashooter.playground.Playground;
import w7.controller.BounceController;
import w7.controller.GravityController;

import java.awt.*;

public class W7Level extends Playground {
    @Override
    public String getName() {
        return "Level aus Woche 7";
    }

    @Override
    public int preferredSizeX() {
        return 700;
    }

    @Override
    public int preferredSizeY() {
        return 700;
    }

    @Override
    public void applyGameLogic() {

    }

    @Override
    public boolean gameOver() {
        return false;
    }

    @Override
    public boolean levelFinished() {
        return false;
    }

    @Override
    public boolean resetRequested() {
        return false;
    }

    @Override
    public void redrawLevel(Graphics2D g2) {

    }

    @Override
    public void prepareLevel(String level) {
        RectObject blueRectObject = new RectObject("random-obj-id", this,
                300, 300,
                150, 50,
                30, 30,
                Color.BLUE
        );

        RectObject greenRectObject = new RectObject("random-obj-another-id", this,
                200, 200,
                -150, -50,
                50, 50,
                Color.GREEN
        );

        greenRectObject.setController(new GravityController());
        blueRectObject.setController(new GravityController());

        addObject(greenRectObject);
        addObject(blueRectObject);
    }
}
