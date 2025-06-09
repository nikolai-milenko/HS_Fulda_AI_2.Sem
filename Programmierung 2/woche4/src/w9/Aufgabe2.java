package w9;

import java.util.ArrayList;

public class Aufgabe2 {
    public double reduceOperation(ArrayList<Double> arr){
        if (arr.isEmpty()){
            return 0.0;
        }
        double result = arr.get(0);
        for (int i = 1; i < arr.size(); i++){
            if (Math.abs(arr.get(i)) >= result){
                result = Math.abs(arr.get(i));
            }
        }
        return result;
    }
}
