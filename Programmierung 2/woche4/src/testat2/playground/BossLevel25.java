package testat2.playground;

import spaceinvadersProject.playground.SpaceInvadersLevel;

public class BossLevel25 extends SpaceInvadersLevel {

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
}
