/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

import Logica.Clasificador;
import java.util.Scanner;



public class Interfaz {
    private Clasificador logica;
     Scanner scanner = new Scanner(System.in);
     
      public  Interfaz() {
        System.out.println("Ingrese cantidad de numeros a evaluar");
        
        logica = new Clasificador();
        logica.iniciar(scanner.nextInt());
        
        do {
            System.out.println("Ingrese un numero, faltan: " + logica.faltan());
            logica.agregar(scanner.nextInt());
        } while (!logica.hayResultado());
        System.out.println(logica.getResultado());
        //Comentario
    }
}
