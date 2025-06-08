package w9;

import javashooter.gameutils.GameLoop;
import javashooter.playground.Playground;
import w9.playground.W9Level;

public class W9Game extends GameLoop {
    @Override
    public Playground nextLevel(Playground currentLevel) {
        return new W9Level();
    }
    public static void main(String[] args) {
        W9Game game = new W9Game();
        game.runGame(args);
    }
}
