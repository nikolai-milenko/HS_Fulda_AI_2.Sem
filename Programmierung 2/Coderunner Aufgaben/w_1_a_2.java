/**
 * Schreiben Sie ein komplettes Java-Programm (Hauptklasse StringTest1), welches einen String von der Konsole liest und
 * <p>
 *     JA ausgibt wenn der String den Buchstaben "x" enthält
 *     NEIN ausgibt in allen anderen Fällen
 */

import java.util.*;

public class w_1_a_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String eingabe = scanner.nextLine();

        boolean x_gefunden = false;

        for (int i = 0; i < eingabe.length(); i++){
            if (eingabe.charAt(i) == 'x') {
                System.out.println("JA");
                x_gefunden = true;
                break;
            }
        }
        if (!x_gefunden)
            System.out.println("NEIN");
    }
}
