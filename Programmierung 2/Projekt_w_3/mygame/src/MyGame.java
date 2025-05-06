import javashooter.gameutils.GameLoop;
import javashooter.playground.Playground;
import spaceinvadersProject.playground.Level1;

public class MyGame extends GameLoop {
    @Override
    public Playground nextLevel(Playground currentLevel){
        if (currentLevel == null) {
            return new Level1();
        }
        return null;
    }

    public static void main(String[] args) {
        MyGame game = new MyGame();
        game.runGame(args);
    }
}
