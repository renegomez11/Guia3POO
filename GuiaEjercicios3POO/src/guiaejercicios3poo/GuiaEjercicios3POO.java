/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guiaejercicios3poo;

import static java.time.InstantSource.system;
import java.util.Scanner;
import javax.swing.*;

/**
 *
 * @author Rene Salvador Gomez
 */
public class GuiaEjercicios3POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double n1 = 10;
        double n2 = 5;

//suma
        Suma sum = new Suma(n1, n2);
        sum.mostrarResultado();

//resta
        Resta res = new Resta(n1, n2);
        res.mostrarResultado();

//multiplicacion
        Multiplicacion mul = new Multiplicacion(n1, n2);
        mul.mostrarResultado();

//division
        Division div = new Division(n1, n2);
        div.mostrarResultado();
    }
}
