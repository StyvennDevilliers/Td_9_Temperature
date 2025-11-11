package fr.btsciel;

public class Color {
    public static String RESET = "\u001B[0m";
    public static String RED = "\u001B[31m";
    public static String GREEN = "\u001B[32m";
    public static String YELLOW = "\u001B[33m";
    public static String BLUE = "\u001B[34m";
    public static String PURPLE = "\u001B[35m";
    public static String CYAN = "\u001B[36m";
    public static String WHITE = "\u001B[37m";
    public static String BLACK_BG = "\u001B[40m";


    public static String getYELLOW() {
        return YELLOW;
    }

    public static String getGREEN() {
        return GREEN;
    }

    public static String getRED() {
        return RED;
    }

    public static String getRESET() {
        return RESET;
    }

    public static String getBLUE() {
        return BLUE;
    }

    public static String getBLACKBG() {
        return BLACK_BG;
    }

    public static String getWHITE() {
        return WHITE;
    }

    public static String getCYAN() {
        return CYAN;
    }

    public static String getPURPLE() {
        return PURPLE;
    }

}
