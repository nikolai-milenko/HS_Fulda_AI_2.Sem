import java.util.Arrays;

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
 * <br>
 * <p><h3>
 *     6. Schreiben Sie eine Methode, die ein 2D-double-Array x als Parameter erwartet und ein 2D-double-Array mit genauso vielen Zeilen aber nur einer Spalte zurückgibt. Jede Zeile soll ein Element lang sein und die Summe der selben Zeile von x enthalten.
 * </h3></p>
 * <br>
 * <p><h3>
 *     7. Erstellen Sie eine Methode ringtausch(), welche ein int-Array als Argument nimmt und darin alle Elemente eine Position nach rechts schiebt. Was "hinten runterfällt" soll ganz vorne wieder eingefügt werden. Falls das Array leer ist soll nichts passieren.
 * </h3></p>
 * <hr>
 * <p><h3>
 *     8. Problem: in einem Array von Ganzzahlen soll ein bestimmter Wert mithilfe einfacher linearer Suche gefunden und zurückgegeben werden. Falls der Wert im Array nicht existiert, soll dies ebenfalls signalisiert werden.
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
    public static double[][] modelExample_2(double[][] x){
        int zeilen = x.length;
        double[][] ergebnis = new double[zeilen][1];

        for (int i = 0; i < zeilen; i++) {
            double sum = 0;
            for (int j = 0; j < x[i].length; j++) {
                sum += x[i][j];
            }
            ergebnis[i][0] = sum;
        }

        return ergebnis;
    }
    static void ringtausch(int[] arr) {
        if (arr.length == 0) {
            return;
        }
        int last = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
    }
    public static int findeWertImArray (int [] array, int wert)
    {
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == wert)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(hat222(333));
        System.out.println(hat222(2022201));
        System.out.println(hat222(202200222));
        System.out.println(hatHoechstens(3332, 1));
        System.out.println(hatHoechstens(2022201, 5));
        System.out.println(hatHoechstens(2022222, 5));
        System.out.println(Arrays.deepToString(modelExample_2(new double[][] {})));
        System.out.println(Arrays.deepToString(modelExample_2(new double[][] { { 1., 1., 1. }, { 2., 2., 2. }, { 3., 3., 3. } })));
        int[] arr = new int[] {2, 3, 4};
        ringtausch(arr);
        System.out.println(Arrays.toString(arr));
        int[] arr_2 = new int[] {};
        ringtausch(arr_2);
        System.out.println(Arrays.toString(arr_2));
        int[] arr_3={1, 2, 3, 4, 6, 10};
        System.out.println(findeWertImArray(arr_3, 1));
        int[] arr3={};
        System.out.println(findeWertImArray(arr3, 2));
        int[] arr4={1};
        System.out.println(findeWertImArray(arr4, 2));
    }
}
