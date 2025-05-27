package w7.controller;

public class GravityController extends BounceController {
    private static final double GRAVITY = 150;

    @Override
    public void updateObject() {
        double newVy = this.getVY() + GRAVITY * this.getTimestep();
        this.setVY(newVy);

        super.updateObject();
    }
}
