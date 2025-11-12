package fr.btsciel;


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

}
