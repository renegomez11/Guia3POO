/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiaejercicios3poo.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Rene Salvador Gomez
 */
public class ejercicio3 {
    public static int menuprincipal() {
        Scanner teclado;
        teclado = new Scanner(System.in);
        int op;
        System.out.print("\n"
                + "Seleccionar una opcion del menu:\n"
                + "1. Calculadora Basica\n"
                + "2. Calculadora avanzada\n"
                + "3. Salir del programa\n"
        );

        op = teclado.nextInt();
        return op;
    }

    public static void main(String[] args) {
        boolean salir = false;
        int opc;
        opc = menuprincipal();
        do {
            switch (opc) {
                case 1:
                    CalculadoraBasica.main(null);
                    break;

                case 2:
                    CalculadoraAvanzada.main(null);
                    break;

                case 3:
                    System.out.println("Cerrando el programa...");
                    System.exit(0);
                    break;
            }
        } while (!salir);
    }

}
}
