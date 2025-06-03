package w8.playground;

import javashooter.collider.RectCollider;
import javashooter.controller.KinematicsController;
import javashooter.gameobjects.GameObject;
import javashooter.gameobjects.RectObject;
import spaceinvadersProject.playground.SpaceInvadersLevel;
import w8.rendering.FlashArtist;

import java.awt.*;

public class W8Level extends SpaceInvadersLevel {
    @Override
    public String getName() {
        return "Level aus Woche 8!";
    }

    @Override
    public void prepareLevel(String id){
        super.prepareLevel(id);

        RectObject fly_enemy1 = new RectObject(
                id + "_enemy1", this, 300, 300,
                30, 20, 30, 30,
                Color.BLUE
        );

        RectObject fly_enemy2 = new RectObject(
                id + "_enemy2", this, 200, 200,
                0, 20, 30, 30,
                Color.GREEN
        );

        RectObject fly_enemy3 = new RectObject(
                id + "_enemy3", this, 250, 100,
                0, 0, 30, 30,
                Color.YELLOW
        );

        fly_enemy1.setController(new KinematicsController());
        fly_enemy2.setController(new KinematicsController());
        fly_enemy3.setController(new KinematicsController());

        // Wenn die beiden selbst erzeugten Objekte **keinen Collider** erhalten,
        // dann können sie **nicht mit dem Ego kollidieren** – es passiert also nichts,
        // selbst wenn sich ihre Positionen überschneiden.
        // Der Grund ist: Nur Objekte mit einem zugewiesenen Collider werden in die
        // Kollisionsprüfung einbezogen.

        fly_enemy1.addCollider(new RectCollider(id + "_collider1", fly_enemy1, fly_enemy1.getW(), fly_enemy1.getH()));
        fly_enemy2.addCollider(new RectCollider(id + "_collider2", fly_enemy2, fly_enemy2.getW(), fly_enemy2.getH()));
        fly_enemy3.addCollider(new RectCollider(id + "_collider3", fly_enemy3, fly_enemy3.getW(), fly_enemy3.getH()));

        // Es **macht keinen Unterschied**, ob man zuerst das Objekt zum Level hinzufügt und
        // dann Controller und Collider setzt, oder ob man es andersherum macht.
        // Der Grund ist: Die Methoden `setController()` und `addCollider()` wirken direkt auf das Objekt selbst,
        // unabhängig davon, ob es bereits dem Level hinzugefügt wurde oder nicht.
        // Erst beim Start des Spiels wird der gesamte Objektzustand berücksichtigt.
        // Wichtig ist nur, dass **vor Spielbeginn** alle Komponenten gesetzt sind.

        fly_enemy3.addArtist(new FlashArtist(fly_enemy3, 30, 30));

        this.addObject(fly_enemy1);
        this.addObject(fly_enemy2);
        this.addObject(fly_enemy3);
    }

    @Override
    protected void actionIfEgoCollidesWithEnemy(GameObject enemy, GameObject ego){
        if (enemy.getName().contains("_enemy1") || enemy.getName().contains("_enemy2")) {
            System.out.println("AUA");
        } else {
            // ursprüngliches Verhalten aufrufen:
            super.actionIfEgoCollidesWithEnemy(enemy, ego);
        }
    }

    @Override
    protected void actionIfEnemyIsHit(GameObject enemy, GameObject shot) {
        if (enemy.getName().contains("_enemy1") || enemy.getName().contains("_enemy2")) {
            return;
        }
        super.actionIfEnemyIsHit(enemy, shot);
    }
}
