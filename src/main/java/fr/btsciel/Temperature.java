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

    public void setJour(String jour) {
        this.jour = jour;
    }

    public double getMatin() {
        return matin;
    }

    public void setMatin(double matin) {
        this.matin = matin;
    }

    public double getSoir() {
        return soir;
    }

    public void setSoir(double soir) {
        this.soir = soir;
    }

}
