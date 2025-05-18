package testat2;

import javashooter.gameutils.GameLoop;
import javashooter.playground.Playground;
import testat2.playground.BossLevel25;

public class Testat2 extends GameLoop {
    public static void main(String[] args) {
        Testat2 game = new Testat2();
        game.runGame(args);
    }

    @Override
    public Playground nextLevel(Playground currentLevel) {
        if (currentLevel == null) {
            return new BossLevel25();
        }
        return null;
    }
}
