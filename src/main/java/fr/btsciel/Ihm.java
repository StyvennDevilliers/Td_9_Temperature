package fr.btsciel;

import java.text.DecimalFormat;


public class Ihm {

    public static void main(String[] args) {

        MonObjet LesObjets_Org[] = new MonObjet[3];
        for(int i =0; i < LesObjets_Org.length; i++){
            LesObjets_Org[i] = new MonObjet();
            LesObjets_Org[i].numero = i;
            LesObjets_Org[i].nom = "Objet " + (i+1);
        }
        for(int i =0; i < LesObjets_Org.length; i++) {
            System.out.println("Original  : " + LesObjets_Org[i].nom);
        }
        // Copie de la référence, donc c'est le même tableau
        MonObjet LesObjets_Dup[] = LesObjets_Org;
        // Donc en fait on bosse sur l'original
        LesObjets_Dup[0].nom = "1111111";
        for(int i =0; i < LesObjets_Org.length; i++) {
            System.out.println("Duplicate : " + LesObjets_Dup[i].nom);
            System.out.println("Original  : " + LesObjets_Org[i].nom);
        }
        // Nouvelle référence, mais copie du contenu
        LesObjets_Dup = new MonObjet[ LesObjets_Org.length];
        for(int i =0; i < LesObjets_Org.length; i++) {
            LesObjets_Dup[i] = LesObjets_Org[i];
        }
        // Le tableau est nouveau, mais il contient des références vers les objets originaux
        LesObjets_Dup[1].nom = "2222222";
        for(int i =0; i < LesObjets_Org.length; i++) {
            System.out.println("Duplicate : " + LesObjets_Dup[i].nom);
            System.out.println("Original  : " + LesObjets_Org[i].nom);
        }
        // Nouvelle référence, mais copie des caractéristiques
        LesObjets_Dup = new MonObjet[ LesObjets_Org.length];
        for(int i =0; i < LesObjets_Org.length; i++) {
            MonObjet unObjet = new MonObjet();
            unObjet.numero = LesObjets_Org[i].numero;
            unObjet.nom = LesObjets_Org[i].nom;
            LesObjets_Dup[i] = unObjet;
        }
        // Le tableau est nouveau, mais il contient des références vers les objets originaux
        LesObjets_Dup[2].nom = "3333333";
        for(int i =0; i < LesObjets_Org.length; i++) {
            System.out.println("Duplicate : " + LesObjets_Dup[i].nom);
            System.out.println("Original  : " + LesObjets_Org[i].nom);
        }



        int taille_tableau = 7;
        LesTemperatures temperatures = new LesTemperatures(taille_tableau);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.printf("%-10s",Color.getBLACKBG() + "Jour" + Color.getRESET() + "\t");
        for(int i =0; i< temperatures.getLength(); i++) {
            System.out.printf("%-10s", temperatures.getTemperature(i).getJour());
        }
        System.out.printf("%-10s","\n" + Color.getBLACKBG() + "Matin" + Color.getRESET() + "\t");
        for(int i =0; i< temperatures.getLength(); i++) {
            System.out.printf("%-10s",df.format(temperatures.getTemperature(i).getMatin()));
        }
        System.out.printf("%-10s","\n" + Color.getBLACKBG() + "Soir" + Color.getRESET() + "\t");
        for(int i =0; i< temperatures.getLength(); i++) {
            System.out.printf("%-10s",df.format(temperatures.getTemperature(i).getSoir()));
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
