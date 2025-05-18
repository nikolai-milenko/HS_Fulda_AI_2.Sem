package testat1;

import javashooter.gameutils.GameLoop;
import javashooter.playground.Playground;

// новые импорты для уровней
import testat1.playground.ProjektLevel1;
import testat1.playground.ProjektLevel2;
import testat1.playground.ProjektLevel3;

public class Testat1 extends GameLoop {

    public Testat1() {
        System.out.println("Hallo");
    }

    /*
     * Verständnisfrage:
     * Welche Konstruktoren werden bei der Instanziierung von Testat1 aufgerufen?
     *
     * Antwort:
     * 1. Zuerst wird der Konstruktor der Superklasse GameLoop() aus dem Modul
     *    javashooter-framework25 aufgerufen.
     * 2. Anschließend wird der parameterlose Konstruktor Testat1() in dieser
     *    Klasse ausgeführt, der „Hallo“ auf die Konsole schreibt.
     *
     * Reihenfolge: GameLoop() → Testat1()
     */

    public static void main(String[] args) {
        Testat1 game = new Testat1();

        ProjektLevel1 lvl1 = new ProjektLevel1();
        ProjektLevel2 lvl2 = new ProjektLevel2();
        ProjektLevel3 lvl3 = new ProjektLevel3();

        System.out.println(lvl1.getName());
        System.out.println(lvl2.getName());
        System.out.println(lvl3.getName());

        game.runGame(args);
    }

    /*
     * Achtung:
     * Sie müssen zuerst prüfen, ob diese Referenz nicht null ist,
     * bevor Sie die Methode getName() aufrufen! Warum?
     *
     * Antwort:
     * Der erste Aufruf von nextLevel() erhält currentLevel == null.
     * Versucht man ohne Überprüfung direkt currentLevel.getName(),
     * wirft Java eine NullPointerException, weil man eine Methode
     * auf einem null-Objekt aufruft.
     *
     */

    /*
     * Spielen Sie die drei Level durch und überzeugen Sie sich,
     * dass sie identisch sind. Warum?
     *
     * Antwort:
     * Obwohl wir für jede Klasse (ProjektLevel1–3) die Methode getName()
     * überschrieben haben, wird das eigentliche Spielfeld (Layout, Gegner,
     * Objekte) von SpaceInvadersLevel aus derselben Ressourcendatei geladen.
     * Wir haben keine unterschiedlichen Karten oder Logik implementiert,
     * daher sind alle drei Level inhaltlich und im Spielablauf identisch.
     */

    @Override
    public Playground nextLevel(Playground currentLevel) {
        if (currentLevel == null) {
            return new ProjektLevel1();
        }
        String name = currentLevel.getName();

        return switch (name) {
            case "Level1" -> new ProjektLevel2();
            case "Level2" -> new ProjektLevel3();
            default -> null;
        };
    }
}
