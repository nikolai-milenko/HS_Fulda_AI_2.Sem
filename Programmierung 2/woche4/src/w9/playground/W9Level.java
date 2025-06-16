package w9.playground;

import javashooter.controller.CollisionAware4WayController;
import javashooter.controller.ObjectController;
import javashooter.gameobjects.GameObject;
import javashooter.rendering.CircleArtist;
import javashooter.rendering.PulsatingCircleArtist;
import spaceinvadersProject.gameobjects.EgoObject;
import spaceinvadersProject.playground.SpaceInvadersLevel;
import w9.controller.ShieldController;
import w9.controller.ZickZackController;

import java.awt.*;

public class W9Level extends SpaceInvadersLevel {
    private double bonusCollectedTime = -10;

    @Override
    public String getName() {
        return "Level aus Woche 9!";
    }

    @Override
    protected void actionIfEgoCollidesWithCollect(GameObject collect, GameObject ego) {
        super.actionIfEgoCollidesWithCollect(collect, ego);
        this.bonusCollectedTime = getGameTime();
        double duration = 5.0;
        GameObject shield = new GameObject(
                "shield",
                this,
                ego.getX(),
                ego.getY(),
                0,
                0
        );
        shield.setController(new ShieldController(getGameTime(), duration));

        shield.addArtist(new CircleArtist(shield, 50, new Color(0, 255, 0, 100)));
        this.addObject(shield);
    }

    @Override
    public GameObject createEgoShot(String shotName, GameObject ego) {
        GameObject shot = super.createEgoShot(shotName, ego);
        if (getGameTime() - bonusCollectedTime <= 5.0) {
            shot.setOmega(Math.PI);
        }
        return shot;
    }

    @Override
    protected GameObject createEnemyShotObject(GameObject parentObject, String name, ObjectController limitedTimeController) {
        GameObject shot = super.createEnemyShotObject(parentObject, name, limitedTimeController);
        shot.setController(new ZickZackController(gameTime, 5.0));
        return shot;
    }

    @Override
    public GameObject createEgoObject(){
        CollisionAware4WayController egoController = new CollisionAware4WayController(this.calcEgoSpeed());
        egoController.setSpeed(this.calcEgoSpeed());

        GameObject ego = new EgoObject("ego", this, 50, preferredSizeY() - 60, 0, 0, EGORAD)
                .setController(egoController).generateColliders();

        ego.addArtist(new PulsatingCircleArtist(
                ego,
                SpaceInvadersLevel.EGORAD,
                Color.GREEN,
                0.7,
                0.1
        ));

        return ego;
    }
}
