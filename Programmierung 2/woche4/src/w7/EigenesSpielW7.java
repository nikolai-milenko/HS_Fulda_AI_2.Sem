package w7;

import javashooter.gameutils.GameLoop;
import javashooter.playground.Playground;
import w7.playground.W7Level;

public class EigenesSpielW7 extends GameLoop {
    @Override
    public Playground nextLevel(Playground currentLevel) {
        return new W7Level();
    }

    public static void main(String[] args) {
        EigenesSpielW7 game = new EigenesSpielW7();
        game.runGame(args);
    }
}
