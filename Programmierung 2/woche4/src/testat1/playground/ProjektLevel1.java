package testat1.playground;

import javashooter.gameobjects.GameObject;
import spaceinvadersProject.playground.SpaceInvadersLevel;

public class ProjektLevel1 extends SpaceInvadersLevel {
    @Override
    public String getName() {
        return "Level1";
    }

    @Override
    public int calcNrEnemies() {
        return 1;
    }

    @Override
    public String getStartupMessage() {
        return "Level1";
    }

    /*
    * Warum müssen wir GameObject importieren?
    * Weil die Signatur von actionIfEnemyIsHit in der Basisklasse so lautet:
    * protected void actionIfEnemyIsHit(GameObject e, GameObject shot)
    * und der Parameter GameObject im Projekt im Paket javashooter.gameobjects liegt
    * (also eigentlich nicht im javashooter.playground).
    *
     */

    @Override
    public void actionIfEnemyIsHit(GameObject enemy, GameObject shot) {
        super.actionIfEnemyIsHit(enemy, shot);
        System.out.println("AUA!!");
    }
}
