/**
 * Schreiben Sie ein komplettes Java-Programm (Hauptklasse: StringTest2),
 * welches einen String von der Konsole liest und die Summe aller Zeichen ausgibt.
 * Zeichen c, welche Sie mit der Methode charAt aus dem String extrahieren,
 * können Sie mit dem Ausdruck (int)c nach int konvertieren und dann aufsummieren.
 */


import java.util.*;


public class w_1_a_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String eingabe = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < eingabe.length(); i++){
            sum += eingabe.charAt(i);
        }
        System.out.println(sum);
    }
}
