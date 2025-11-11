package fr.btsciel;

import java.text.DecimalFormat;
import java.util.Random;

public class Ihm {
    public static void main(String[] args) {
        double max = Double.MIN_VALUE , min = Double.MAX_VALUE , moy = 0;
        double maxMatin = Double.MIN_VALUE , minMatin = Double.MAX_VALUE , moyMatin = 0;
        double maxSoir = Double.MIN_VALUE , minSoir = Double.MAX_VALUE , moySoir = 0;
        Temperature [] temperatures = new Temperature [7];
        String [] jour =   {"lundi","mardi","mercredi","jeudi","vendredi","samedi","dimanche"};
        DecimalFormat df = new DecimalFormat("0.00");
        Random rand = new Random();
        double valeurmatin,valeursoir;
        for (int i = 0; i < temperatures.length; i++) {
            valeurmatin = rand.nextDouble(-10,10) ;
            valeursoir = rand.nextDouble(10,30) ;
            temperatures[i] = new Temperature(jour[i],valeurmatin,valeursoir);
            /*System.out.print(Color.getBLACKBG() + temperatures[i].getJour() + "\t");
            System.out.print(Color.getBLUE() + df.format(temperatures[i].getMatin()) + "\t");
            System.out.println(Color.getBLACKBG() + Color.getRED() + df.format(temperatures[i].getSoir()) + "\t" + Color.getRESET()); */

            maxMatin = Temperature.getMax(temperatures[i].getMatin(),maxMatin);
            minMatin = Temperature.getMin(temperatures[i].getMatin(),minMatin);
            maxSoir = Temperature.getMax(temperatures[i].getSoir(),maxSoir);
            minSoir = Temperature.getMin(temperatures[i].getSoir(),minSoir);
            min = Temperature.getMin(temperatures[i].getMatin(),min);
            min = Temperature.getMin(temperatures[i].getSoir(),min);
            max = Temperature.getMax(temperatures[i].getMatin(),max);
            max = Temperature.getMax(temperatures[i].getSoir(),max);

            if (i == 0){
                moyMatin = temperatures[i].getMatin();
                moySoir = temperatures[i].getSoir();
                moy = temperatures[i].getMatin() + temperatures[i].getSoir();
            }else{
                moyMatin += temperatures[i].getMatin();
                moySoir += temperatures[i].getSoir();
                moy += temperatures[i].getMatin() + temperatures[i].getSoir();

            }
        }
        System.out.printf("%-10s",Color.getBLACKBG() + "Jour" + Color.getRESET() + "\t");
        for (int i = 0; i < temperatures.length; i++) {
            System.out.printf("%-10s",temperatures[i].getJour());
        }
        System.out.printf("%-10s","\n" + Color.getBLACKBG() + "Matin" + Color.getRESET() + "\t");
        for (int i = 0; i < temperatures.length; i++) {
            System.out.printf("%-10s",df.format(temperatures[i].getMatin()));
        }
        System.out.printf("%-10s","\n" + Color.getBLACKBG() + "Soir" + Color.getRESET() + "\t");
        for (int i = 0; i < temperatures.length; i++) {
            System.out.printf("%-10s",df.format(temperatures[i].getSoir()));
        }


        moyMatin = Temperature.getMoy(moyMatin,temperatures.length);
        moySoir = Temperature.getMoy(moySoir,temperatures.length);
        moy = Temperature.getMoy(moy,temperatures.length);
        System.out.println( "\nMax matin: " + df.format(maxMatin) );
        System.out.println( "Min matin: " + df.format(minMatin) );
        System.out.println( "Moy Matin: " + df.format(moyMatin) );
        System.out.println( "Max Soir: " + df.format(maxSoir) );
        System.out.println( "Min Soir: " + df.format(minSoir) );
        System.out.println( "Moy Soir: " + df.format(moySoir) );
        System.out.println( "Max: " + df.format(max) );
        System.out.println( "Min: " + df.format(min) );
        System.out.println("Moy: " + df.format(moy) );


    }
}
