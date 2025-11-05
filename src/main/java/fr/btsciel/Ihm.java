package fr.btsciel;

import java.text.DecimalFormat;
import java.util.Random;

public class Ihm {
    public static void main(String[] args) {
        Temperature [] temperatures = new Temperature [7];
        String [] jour =   {"lundi","mardi","mercredi","jeudi","vendredi","samedi","dimanche"};
        DecimalFormat df = new DecimalFormat("0.00");
        Random rand = new Random();
        double valeurmatin,valeursoir;
        System.out.println("Jour\tMatin\tSoir");
        for (int i = 0; i < temperatures.length; i++) {
             valeurmatin = rand.nextDouble(-10,10) ;
             valeursoir = rand.nextDouble(10,30) ;
             temperatures[i] = new Temperature(jour[i],valeurmatin,valeursoir);
            System.out.print(temperatures[i].getJour() + "\t");
            System.out.print(df.format(temperatures[i].getMatin()) + "\t");
            System.out.println(df.format(temperatures[i].getSoir()) + "\t");

        }
    }
}
