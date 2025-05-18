package testat1.playground;

import spaceinvadersProject.playground.SpaceInvadersLevel;

public class ProjektLevel3 extends SpaceInvadersLevel {
    @Override
    public String getName() {
        return "Level3";
    }

    @Override
    public int calcNrEnemies() {
        return 10;
    }

    @Override
    public String getStartupMessage() {
        return "Level3";
    }
}
