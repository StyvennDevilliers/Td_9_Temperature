package fr.btsciel;

import java.time.LocalDate;

public class Temperature {
    private String jour;
    private double matin;
    private double soir;

    public Temperature(String jour, double temperaturematin, double temperaturesoir) {
        this.jour = jour;
        this.matin = temperaturematin;
        this.soir = temperaturesoir;
    }

    public String getJour() {
        return jour;
    }
    public double getMatin() {
        return matin;
    }
    public double getSoir() {
        return soir;
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
