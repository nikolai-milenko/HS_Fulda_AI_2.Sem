package testat1.playground;

import spaceinvadersProject.playground.SpaceInvadersLevel;

public class ProjektLevel2 extends SpaceInvadersLevel {
    @Override
    public String getName() {
        return "Level2";
    }

    @Override
    public int calcNrEnemies() {
        return 5;
    }

    @Override
    public String getStartupMessage() {
        return "Level2";
    }
}
