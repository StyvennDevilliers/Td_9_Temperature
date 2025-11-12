package fr.btsciel;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Random;

import static java.time.format.TextStyle.FULL;

public class LesTemperatures {

    private Temperature [] tableau;

    public LesTemperatures(int taille) {
        tableau = new Temperature[taille];
        setTableau(taille);
    }
    public Temperature[] getTableau() {
        return tableau;
    }
    public void setTableau(int taille) {
        Locale localeFr = Locale.FRENCH;
        Random rand = new Random();
        for (int i = 0; i < taille; i++) {
            LocalDate date = LocalDate.now().minusDays(i);
            double valeurmatin = rand.nextDouble(-20, 5);
            double valeursoir = rand.nextDouble(10, 30);
            tableau[i] = new Temperature(date.getDayOfWeek().getDisplayName(FULL, localeFr),valeurmatin,valeursoir);
        }
    }

    public double getMaxMatin(){
        double maxMatin = Double.MIN_VALUE ;
        for (Temperature t : tableau) {
            if (t.getMatin() > maxMatin) {
                maxMatin = t.getMatin();
            }
        }
        return maxMatin;
    }
    public double getMinMatin(){
        double minMatin = Double.MAX_VALUE ;
        for (Temperature t : tableau) {
            if (t.getMatin() < minMatin) {
                minMatin = t.getMatin();
            }
        }
        return minMatin;
    }
    public double getMaxSoir(){
        double maxSoir = Double.MIN_VALUE ;
        for (Temperature t : tableau) {
            if (t.getSoir() > maxSoir) {
                maxSoir = t.getSoir();
            }
        }
        return maxSoir;
    }
    public double getMinSoir(){
        double minSoir = Double.MAX_VALUE ;
        for (Temperature t : tableau) {
            if (t.getSoir() < minSoir) {
                minSoir = t.getSoir();
            }
        }
        return minSoir;
    }
    public double getMax(){
        double max = Double.MIN_VALUE ;
        for (Temperature t : tableau) {
            if (t.getSoir() > max) {
                max = t.getSoir();
            }
        }
        return max;
    }
    public double getMin(){
        double min = Double.MAX_VALUE ;
        for (Temperature t : tableau) {
            if (t.getMatin() < min) {
                min = t.getMatin();
            }
        }
        return min;
    }
    public double getMoyMatin(int taille){
        double valeurtot = 0;
        for(Temperature t : tableau) {
            valeurtot+= t.getMatin();
        }
        return valeurtot / taille;
    }
    public double getMoySoir(int taille){
        double valeurtot = 0;
        for(Temperature t : tableau) {
            valeurtot+= t.getSoir();
        }
        return valeurtot / taille;
    }
    public double getMoy(int taille){
        double valeurtotMatin = 0;
        double valeurtotSoir = 0;
        for(Temperature t : tableau) {
            valeurtotMatin += t.getMatin();
            valeurtotSoir += t.getSoir();
        }
        return ((valeurtotSoir + valeurtotMatin) / (taille*2));
    }

}
