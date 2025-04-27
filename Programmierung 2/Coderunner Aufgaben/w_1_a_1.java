/**
 * Schreiben Sie ein komplettes Java-Programm,
 * welches alle ungeraden Zahlen zwischen 10 und 20 auf die Konsole ausgibt, mit System.out.println.
 * Die Hauptklasse soll Ungerade heißen!
 */

public class w_1_a_1 {
    public static void main(String[] args) {
        for (int i = 10; i < 20; i++){
            if (i % 2 == 1)
                System.out.println(i);
        }
    }
}
