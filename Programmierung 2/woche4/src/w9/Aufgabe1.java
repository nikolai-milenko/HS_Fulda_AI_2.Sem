package w9;

import java.util.ArrayList;

public class Aufgabe1 {
    public double reduceOperation(ArrayList<Double> arr){
        if (arr.isEmpty()){
            return 0.0;
        }
        double result = 0.0;
        for (int i = 0; i < arr.size(); i++){
            if (i != 0){
                result += arr.get(i) * arr.get(i - 1);
            }
            else{
                result += arr.get(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Aufgabe1 a1 = new Aufgabe1();
        ArrayList<Double> arr = new ArrayList<Double>();
        System.out.println(a1.reduceOperation(arr));

        Aufgabe1 a2 = new Aufgabe1();
        ArrayList<Double> arr2 = new ArrayList<Double>();
        arr2.add(5.0);
        System.out.println(a1.reduceOperation(arr2));

        Aufgabe1 a3 = new Aufgabe1();
        ArrayList<Double> arr3 = new ArrayList<Double>();
        arr3.add(5.0);
        arr3.add(10.0);
        arr3.add(2.0);
        System.out.println(a3.reduceOperation(arr3));
    }
}
