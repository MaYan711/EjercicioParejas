/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.Scanner;

/**
 *
 * @author sirbon
 */
public class ConsoleData {

    static Scanner sc = new Scanner(System.in);

    private static void viewMessage(String mensaje) {
        System.out.print("\n" + mensaje + " ");
    }

    public static String getString(String message) {
        viewMessage(message);
        String string = sc.nextLine();
        return string;
    }

    public static int getInt(String message, boolean isNeg) {
        viewMessage(message);
        try {
            int intTmp = Integer.parseInt(sc.nextLine());

            if (isNeg) {
                return intTmp;
            } else if (intTmp < 0) {
                do {
                    viewMessage("\n\n El dato ingresado no puede ser negativo\n\t");
                    viewMessage(message);
                    intTmp = Integer.parseInt(sc.nextLine());
                } while (intTmp < 0);
            }
            return intTmp;
        } catch (Exception e) {
            return -1;
        }

    }

    public static void waitKey(String texto) {
        System.out.println(texto);
        String tmp = sc.nextLine();
        tmp.length();
    }

}
