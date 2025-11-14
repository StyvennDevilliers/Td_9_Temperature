package fr.btsciel;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Random;

import static java.time.format.TextStyle.FULL;

public class LesTemperatures {

    private Temperature [] tableau;
    private double minMatin;
    private double maxMatin;
    private double minSoir;
    private double maxSoir;

    public LesTemperatures(int taille) {
        minMatin = Double.MAX_VALUE;
        minSoir = Double.MAX_VALUE;
        maxMatin = Double.MIN_VALUE;
        maxSoir = Double.MIN_VALUE;
        //
        tableau = new Temperature[taille];
        setTableau(taille);
    }

//    public Temperature[] getTableau() {
//        return tableau;
//    }


    public int getLength() {
        return tableau.length;
    }

    public Temperature getTemperature(int position){
        if ( position >= 0 && position < tableau.length ) {
            Temperature t = tableau[position];
            // On ne renvoit pas l'objet/la référence originale
            return new Temperature(t.getJour(),t.getMatin(),t.getSoir());
        }
        //Ici, il faudrait générer une exception
        return null;
    }
    public void setTemperature(int position, Temperature t){
        if ( position >= 0 && position < tableau.length ) {
            tableau[position] = t;
            //
            if (t.getMatin() < minMatin) {
                minMatin = t.getMatin();
            }
            if (t.getMatin() > maxMatin) {
                maxMatin = t.getMatin();
            }
            //
            if (t.getSoir() < minSoir) {
                minSoir = t.getSoir();
            }
            if (t.getSoir() > maxSoir) {
                maxSoir = t.getSoir();
            }
        }
        return;
    }


    private void setTableau(int taille) {
        Locale localeFr = Locale.FRENCH;
        Random rand = new Random();
        for (int i = 0; i < taille; i++) {
            LocalDate date = LocalDate.now().minusDays(i);
            double valeurmatin = rand.nextDouble(-20, 5);
            double valeursoir = rand.nextDouble(10, 30);
            //
            setTemperature(i,new Temperature(date.getDayOfWeek().getDisplayName(FULL, localeFr),valeurmatin,valeursoir));
        }
    }

    public double getMaxMatin(){
        return maxMatin;
    }
    public double getMinMatin(){
        return minMatin;
    }
    public double getMaxSoir(){
        return maxSoir;
    }
    public double getMinSoir(){
        return minSoir;
    }
    public double getMax(){
        double max = maxMatin ;
        if ( maxMatin < maxSoir)
            max = maxSoir;
        return max;
    }
    public double getMin(){
        double min = minMatin ;
        if ( minMatin < minSoir)
            min = minSoir;
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
