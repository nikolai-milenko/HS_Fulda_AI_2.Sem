package w7.controller;

import javashooter.controller.KinematicsController;

public class BounceController extends KinematicsController {
    private static final double EPS = 1e-3;

    @Override
    public void updateObject() {
        double width = this.getPlayground().preferredSizeX();
        double height = this.getPlayground().preferredSizeY();

        double x = getX();
        double y = getY();

        if (x <= 0 || x >= width) {
            setVX(-getVX() * 0.7);
            if (Math.abs(getVX()) < EPS) setVX(0);
        }

        if (y <= 0 || y >= height) {
            setVY(-getVY() * 0.7);
            setVX(getVX() * 0.96);
            if (Math.abs(getVX()) < EPS) setVX(0);
            if (Math.abs(getVY()) < EPS) setVY(0);
        }

        super.updateObject();
    }
}
