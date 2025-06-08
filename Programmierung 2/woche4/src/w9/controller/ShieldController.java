package w9.controller;

import javashooter.controller.LimitedTimeController;
import javashooter.gameobjects.GameObject;

public class ShieldController extends LimitedTimeController {

    public ShieldController(double g0, double duration) {
        super(g0, duration);
    }

    @Override
    public void updateObject() {
        super.updateObject();

        GameObject ego = getPlayground().getObject("ego");
        if (ego != null) {
            gameObject.setX(ego.getX());
            gameObject.setY(ego.getY());
        }
    }

}
