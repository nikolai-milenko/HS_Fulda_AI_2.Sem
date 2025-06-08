package w9.controller;

import javashooter.controller.LimitedTimeController;

public class ZickZackController extends LimitedTimeController {

    private double lastToggleTime = -1;
    private boolean directionRight = true;

    public ZickZackController(double g0, double duration) {
        super(g0, duration);
        this.lastToggleTime = g0;
    }

    @Override
    public void updateObject() {
        double gameTime = this.getPlayground().getGameTime();

        if (gameTime - lastToggleTime >= 0.5) {
            lastToggleTime = gameTime;
            directionRight = !directionRight;
            gameObject.setVX(directionRight ? 30 : -30);
        }

        applySpeedVector();

        if (checkBorder() || ((gameTime - g0) > duration)) {
            getPlayground().deleteObject(this.gameObject.getId());
        }
    }
}
