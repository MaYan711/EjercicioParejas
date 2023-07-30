/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author sirbon
 */
public class TextArt {

    //txt colors
    public final static String BLACK = "\u001b[30m";
    public final static String RESET = "\u001b[0m";
    public final static String RED = "\u001b[31m";
    public final static String GREEN = "\u001b[32m";
    public final static String BLUE = "\u001b[34m";
    public final static String MAGENTA = "\u001b[35m";
    public final static String CYAN = "\u001b[36m";
    public final static String WHITE = "\u001b[37m";
    public final static String YELLOW = "\u001b[33m";
    //bg colors
    public final static String BG_RED = "\u001b[41m";
    public final static String BG_GREEN = "\u001b[42m";
    public final static String BG_BLUE = "\u001b[44m";
    public final static String BG_MAGENTA = "\u001b[45m";
    public final static String BG_CYAN = "\u001b[46m";
    public final static String BG_WHITE = "\u001b[47m";
    public static final String BG_BLACK = "\u001B[40m";
    public final static String BG_YELLOW = "\u001b[43m";

    public static void showTittle(){
        System.out.println(YELLOW + "________________ ______  _____________       _______ ________ ________________ ________ __________");
        System.out.println("__  ____/___    |___   |/  /___  ____/       ___    |___  __ \\__  ____/___    |___  __ \\___  ____/");
        System.out.println("_  / __  __  /| |__  /|_/ / __  __/          __  /| |__  /_/ /_  /     __  /| |__  / / /__  __/   ");
        System.out.println("/ /_/ /  _  ___ |_  /  / /  _  /___          _  ___ |_  _, _/ / /___   _  ___ |_  /_/ / _  /___   ");
        System.out.println("\\____/   /_/  |_|/_/  /_/   /_____/          /_/  |_|/_/ |_|  \\____/   /_/  |_|/_____/  /_____/   \n" +RESET);
}

    public static void showMenuTittle(){
        System.out.println(YELLOW+"   __  ___         _                                    \n" + //
                "  /  |/  / ___ _  (_)  ___        __ _  ___   ___  __ __\n" + //
                " / /|_/ / / _ `/ / /  / _ \\      /  ' \\/ -_) / _ \\/ // /\n" + //
                "/_/  /_/  \\_,_/ /_/  /_//_/     /_/_/_/\\__/ /_//_/\\_,_/ "+RESET);
    }

    public static void showErrorMsg() {
        System.out.println(RED + "           ┌────────┐  ┌┐  ┌┐" + RESET);
        System.out.println(RED + " ENTRADA   │        │  │└┐┌┘│" + RESET);
        System.out.println(RED + " INVALIDA  │        │  └─┐┌─┘" + RESET);
        System.out.println(RED + " VUELVE A  │    X   └────┘│" + RESET);
        System.out.println(RED + "INTENTARLO │───┬┬┬┐       │" + RESET);
        System.out.println(RED + "           └───└┴┘────────┘\n" + RESET);
    }

}
