/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Ejercicios2503;
import java.util.Scanner;
/**
 * <> []
 * @author LABO B
 */
public class Receta {
    public static void main(String[] args) {
              
Scanner sc = new Scanner(System.in);
      
        System.out.print("Ingrese nombre de la receta : ");
        String NombreReceta = sc.nextLine();
                System.out.print("Ingrese los ingredientes principales: ");
        String ingredientesP = sc.nextLine();
        System.out.print("Ingrese el tiempo de preparaciòn: ");
        String Tiempo = sc.nextLine();
          System.out.print("Ingrese dificultad (“Facil,Media o Alta”) : ");
        String dificultad = sc.nextLine();
        System.out.println("El nombre de la receta es: "+NombreReceta);
                System.out.println("Los ingredientes principales son: "+ingredientesP);   
                        System.out.println("El tiempo de preparacion es: "+Tiempo);
                           System.out.println("La dificultad es: "+dificultad);



                           
    }
    }

