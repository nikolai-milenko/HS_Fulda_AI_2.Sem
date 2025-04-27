/**
 * <h1>CodeRunner-Übungen: Java-Methoden</h1>
 * <p>
 * <h3>1. Erstellen Sie eine Methode 'checkPredecessor',
 * die prüft ob in einem int-Array 'x' höchstens 2 Zahlen enthalten sind,
 * die größer sind als ihre Vorgänger</h3>
 * </p>
 * <br>
 * <p><h3>
 *     2. Erstellen Sie eine Methode 'checkPredecessor',
 *     die prüft ob in einem int-Array 'x' mindestens 2 Zahlen enthalten sind,
 *     die größer sind als ihre Vorgänger
 * </h3></p>
 * <br>
 * <p><h3>
 *     3. Erstellen Sie eine Methode 'ComputeNorm',
 *     welche alle Elemente eines double-Arrays quadriert und aufsummiert und die Summe zurückgibt.
 * </h3></p>
 * <br>
 * <p><h3>
 *     4. Erstellen Sie eine Methode 'containsMultipleOf',
 *     die prüft, ob in einem int-Array 'x' mindestens eine Zahl enthalten ist,
 *     die durch den Parameter 'base' teilbar ist.
 * </h3></p>
 * <br>
 * <p><h3>
 *     5. Schreiben Sie eine Methode *isPrime*,
 *     welche einen int-Parameter akzeptiert und true oder false zurückgibt, je nachdem ob eine Primzahl vorliegt.
 *     Primzahlen lassen sich durch keine kleinere Zahl (>1) ohne Rest teilen.
 * </h3></p>
 * <br>
 * <p><h3>
 *     6. Schreiben Sie eine Methode *istPalindrom*,
 *     welche einen String-Parameter akzeptiert und true oder false zurückgibt,
 *     je nachdem ob eine Palindrom vorliegt.
 *     Palindrome lassen sich von vorne und hinten gleich lesen. Beispiel: 'otto'.
 * </h3></p>
 */
public class w_1_a_4 {
    public static boolean checkPredecessor(int[] x) {
        int count = 0;
        for (int i = 1; i < x.length; i++) {
            if (x[i] > x[i - 1]) {
                count++;
                if (count > 2) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkPredecessor2(int[] x) {
        int count = 0;
        for (int i = 1; i < x.length; i++) {
            if (x[i] > x[i - 1]) {
                count++;
                if (count >= 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static double computeNorm(double[] x){
        double sum = 0;
        for (double d : x) {
            sum += d * d;
        }
        return sum;
    }

    public static boolean containsMultipleOf(int[] x, int base){
        for (int i : x) {
            if (i % base == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isPrime(int n) {
        Short i = 2;
        while (i * i <= n) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean istPalindrom(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // System.out.println(checkPredecessor(new int[] {}));
        // System.out.println(checkPredecessor(new int[] { 1, 3, 1 }));
        // System.out.println(checkPredecessor(new int[] { -3, 50, 66, 77, 20 }));
        // System.out.println(checkPredecessor(new int[] { -3, -2, -1, 0, -1000 }));
        // System.out.println(computeNorm(new double[] {}));
        // System.out.println(computeNorm(new double[] { 1., 1., 1. }));
        System.out.println(containsMultipleOf(new int[] {}, 2));
        System.out.println(containsMultipleOf(new int[] { 1, 1, 1 }, 2));
        System.out.println(containsMultipleOf(new int[] { 1, 1, 3 }, 3));
        System.out.println(isPrime(91));
        System.out.println(isPrime(4));
        System.out.println(isPrime(13));
        System.out.println(istPalindrom("tot"));
        System.out.println(istPalindrom("toto"));
        System.out.println(istPalindrom("anna"));
    }
}
