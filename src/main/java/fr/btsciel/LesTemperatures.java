package fr.btsciel;

public class LesTemperatures {
    private Temperature [] tableau;

    public LesTemperatures(Temperature[] tableau) {
        this.tableau = tableau;
    }
    public Temperature getTableau(int i) {
        return tableau[i];
    }

    public static double getMax(double max , double reference){
        if (max > reference){
            return max;
        }
        return reference;
    }
    public static double getMin(double min , double reference){
        if (min < reference){
            return min;
        }
        return reference;
    }
    public static double getMoy(double valeurtot , double length){
        return valeurtot / length;
    }

}
