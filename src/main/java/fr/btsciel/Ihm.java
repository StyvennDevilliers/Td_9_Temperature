package fr.btsciel;

import java.util.Random;

public class Ihm {
    public static void main(String[] args) {
        Temperature [] temperatures = new Temperature [7];
        String [] jour =   {"lundi","mardi","mercredi","jeudi","vendredi","samedi","dimanche"};
        Random rand = new Random();
        double valeurmatin,valeursoir;
        for (int i = 0; i < temperatures.length; i++) {
             valeurmatin = rand.nextDouble(-10,10) ;
             valeursoir = rand.nextDouble(10,30) ;
             temperatures[i] = new Temperature(jour[i],valeurmatin,valeursoir);
            System.out.println(temperatures[i].getJour());
        }
    }
}
