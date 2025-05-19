package testat2.playground;

import javashooter.gameobjects.GameObject;
import spaceinvadersProject.playground.SpaceInvadersLevel;

import java.awt.*;

public class BossLevel25 extends SpaceInvadersLevel {

    public int getHitCounter() {
        return hitCounter;
    }

    public void setHitCounter(int hitCounter) {
        this.hitCounter = hitCounter;
    }

    private int hitCounter = 0;

    @Override
    protected int calcNrEnemies() {
        return 1;
    }

    @Override
    protected double calcEnemySpeedX() {
        return 180.0;
    }

    @Override
    protected double calcEnemySpeedY() {
        return 40.0;
    }

    @Override
    protected double calcEnemyShotProb() {
        return 0.01;
    }

    @Override
    protected String getStartupMessage() {
        return "BossLevel!!";
    }

    @Override
    protected void actionIfEnemyIsHit(GameObject e, GameObject shot) {
        setHitCounter(getHitCounter() + 1);

        deleteObject(shot.getId());

        if (getHitCounter() >= 20) {
            deleteObject(e.getId());
        }
    }

    @Override
    public void redrawLevel(Graphics2D g2){
        super.redrawLevel(g2);
        g2.setFont(new Font("SansSerif", Font.BOLD, 20));
        g2.setColor(Color.YELLOW);
        g2.drawString("HitCounter: " + getHitCounter(), 120, 20);
    }

    @Override
    protected GameObject createEnemyShot(GameObject e) {
        GameObject shot = super.createEnemyShot(e);
        if (shot == null) {
            return null;
        }
        GameObject ego  = getObject("ego");

        double dx = ego.getX() - shot.getX();
        double dy = ego.getY() - shot.getY();
        double n  = Math.sqrt(dx*dx + dy*dy);
        double S  = 400.0;

        double vx = dx * S / n;
        double vy = dy * S / n;

        shot.setVX(vx);
        shot.setVY(vy);
        return shot;
    }
}
