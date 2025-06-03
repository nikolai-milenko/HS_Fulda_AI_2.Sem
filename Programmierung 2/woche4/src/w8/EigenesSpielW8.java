package w8;

import javashooter.gameutils.GameLoop;
import javashooter.playground.Playground;
import w8.playground.W8Level;

public class EigenesSpielW8 extends GameLoop {
    @Override
    public Playground nextLevel(Playground currentLevel) {
        return new W8Level();
    }

    public static void main(String[] args) {
        EigenesSpielW8 game = new EigenesSpielW8();
        game.runGame(args);
    }
}
