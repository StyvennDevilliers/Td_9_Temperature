package fr.btsciel;

import java.text.DecimalFormat;


public class Ihm {
    public static void main(String[] args) {
        int taille_tableau = 7;
        LesTemperatures temperatures = new LesTemperatures(taille_tableau);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.printf("%-10s",Color.getBLACKBG() + "Jour" + Color.getRESET() + "\t");
        for(Temperature t : temperatures.getTableau()) {
            System.out.printf("%-10s", t.getJour());
        }
        System.out.printf("%-10s","\n" + Color.getBLACKBG() + "Matin" + Color.getRESET() + "\t");
        for(Temperature t : temperatures.getTableau()) {
            System.out.printf("%-10s",df.format(t.getMatin()));
        }
        System.out.printf("%-10s","\n" + Color.getBLACKBG() + "Soir" + Color.getRESET() + "\t");
        for(Temperature t : temperatures.getTableau()) {
            System.out.printf("%-10s",df.format(t.getSoir()));
        }


        System.out.println( "\nMax matin: " + df.format(temperatures.getMaxMatin()) );
        System.out.println( "Min matin: " + df.format(temperatures.getMinMatin()) );
        System.out.println( "Moy Matin: " + df.format(temperatures.getMoyMatin(taille_tableau)));
        System.out.println( "Max Soir: " + df.format(temperatures.getMaxSoir()) );
        System.out.println( "Min Soir: " + df.format(temperatures.getMinSoir()) );
        System.out.println( "Moy Soir: " + df.format(temperatures.getMoySoir(taille_tableau)) );
        System.out.println( "Max: " + df.format(temperatures.getMax()));
        System.out.println( "Min: " + df.format(temperatures.getMin()));
        System.out.println("Moy: " + df.format(temperatures.getMoy(taille_tableau)));


    }
}
