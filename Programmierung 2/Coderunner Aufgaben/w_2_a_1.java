/**
 * <p><h3>
 *     1. Erstellen Sie eine Methode 'hat222', die einen int-Parameter 'x' erwartet und true zurückgibt,
 *     falls in x drei aufeinanderfolgende Ziffern 2 auftreten.
 * </h3></p>
 * <br>
 * <p><h3>
 *     2. Erstellen Sie eine Methode 'hatHoechstens',
 *     die zwei int-Parameter 'x' und 'n' erwartet und true zurückgibt, falls in x die Ziffer 2 höchstens n mal vorkommt.
 * </h3></p>
 * <br>
 * <p><h3>
 *     3. Erstellen Sie eine Methode 'hatKein222',
 *     die einen int-Parameter 'x' erwartet und true zurückgibt, falls in x NICHT drei aufeinanderfolgende Ziffern 2 auftreten.
 * </h3></p>
 * <br>
 * <p><h3>
 *     4. Erstellen Sie eine Methode 'hatMindestens',
 *     die zwei int-Parameter 'x' und 'n' erwartet und true zurückgibt, falls in x die Ziffer 2 mindestens n mal vorkommt.
 * </h3></p>
 * <br>
 * <p><h3>
 *     5. Schreiben Sie eine Methode, die ein 2D-double-Array x als Parameter erwartet
 *     und ein 2D-double-Array mit genauso vielen Zeilen aber nur einer Spalte zurückgibt.
 *     Jede Zeile soll ein Element lang sein und den ersten Wert der selben Zeile von x enthalten.
 * </h3></p>
 */


public class w_2_a_1 {
    public static boolean hat222(int x)
    {
        int cnt = 0;
        while (x != 0){
            int rest = x % 10;
            if (rest == 2){
                cnt++;
            }
            else{
                cnt = 0;
            }
            if (cnt == 3){
                return true;
            }
            x /= 10;
        }
        return false;
    }
    public static boolean hatHoechstens(int x, int n) {
        int anzahl = 0;

        while (x > 0) {
            if (x % 10 == 2) {
                anzahl++;
            }
            if (anzahl > n) {
                return false;
            }
            x = x / 10;
        }

        return true;
    }
    public boolean hatKein222(int x)
    {
        int cnt = 0;
        while (x != 0){
            int rest = x % 10;
            if (rest == 2){
                cnt++;
            }
            else{
                cnt = 0;
            }
            if (cnt == 3){
                return false;
            }
            x /= 10;
        }
        return true;
    }
    public static boolean hatMindestens(int x, int n) {
        int anzahl = 0;

        while (x > 0) {
            if (x % 10 == 2) {
                anzahl++;
            }
            x = x / 10;
        }

        return anzahl >= n;
    }
    public static double[][] modelExample(double[][] x){
        int zeilen = x.length;
        double[][] ergebnis = new double[zeilen][1];

        for (int i = 0; i < zeilen; i++) {
            if (x[i].length > 0) {
                ergebnis[i][0] = x[i][0];
            }
        }

        return ergebnis;
    }
    public static void main(String[] args) {
        System.out.println(hat222(333));
        System.out.println(hat222(2022201));
        System.out.println(hat222(202200222));
        System.out.println(hatHoechstens(3332, 1));
        System.out.println(hatHoechstens(2022201, 5));
        System.out.println(hatHoechstens(2022222, 5));
    }
}
