package fr.btsciel;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Locale;
import java.util.Random;

import static java.time.format.TextStyle.FULL;

public class Ihm {
    public static void main(String[] args) {
        Locale localeFr = Locale.FRENCH;
        double max = Double.MIN_VALUE , min = Double.MAX_VALUE , moy = 0;
        double maxMatin = Double.MIN_VALUE , minMatin = Double.MAX_VALUE , moyMatin = 0;
        double maxSoir = Double.MIN_VALUE , minSoir = Double.MAX_VALUE , moySoir = 0;
        Temperature [] temperatures = new Temperature [7];
        DecimalFormat df = new DecimalFormat("0.00");
        Random rand = new Random();
        double valeurmatin,valeursoir;
        for (int i = 0; i < temperatures.length; i++) {
            LocalDate date = LocalDate.now().minusDays(i);
            valeurmatin = rand.nextDouble(-20,5) ;
            valeursoir = rand.nextDouble(10,30) ;
            temperatures[i] = new Temperature(date.getDayOfWeek().getDisplayName(FULL, localeFr),valeurmatin,valeursoir);

            maxMatin = LesTemperatures.getMax(temperatures[i].getMatin(),maxMatin);
            minMatin = LesTemperatures.getMin(temperatures[i].getMatin(),minMatin);
            maxSoir = LesTemperatures.getMax(temperatures[i].getSoir(),maxSoir);
            minSoir = LesTemperatures.getMin(temperatures[i].getSoir(),minSoir);
            min = LesTemperatures.getMin(temperatures[i].getMatin(),min);
            min = LesTemperatures.getMin(temperatures[i].getSoir(),min);
            max = LesTemperatures.getMax(temperatures[i].getMatin(),max);
            max = LesTemperatures.getMax(temperatures[i].getSoir(),max);

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

        LesTemperatures tableau = new LesTemperatures(temperatures);
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


        System.out.println( "\nMax matin: " + df.format(maxMatin) );
        System.out.println( "Min matin: " + df.format(minMatin) );
        System.out.println( "Moy Matin: " + df.format(LesTemperatures.getMoy(moyMatin,temperatures.length)) );
        System.out.println( "Max Soir: " + df.format(maxSoir) );
        System.out.println( "Min Soir: " + df.format(minSoir) );
        System.out.println( "Moy Soir: " + df.format(LesTemperatures.getMoy(moySoir,temperatures.length)) );
        System.out.println( "Max: " + df.format(max) );
        System.out.println( "Min: " + df.format(min) );
        System.out.println("Moy: " + df.format(LesTemperatures.getMoy(moy,temperatures.length)));


    }
}
