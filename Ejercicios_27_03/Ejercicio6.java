/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Ejercicios_27_03;
import java.util.Scanner;
import java.util.Random;
/**
 * <> []
 * @author LABO B
 */
public class Ejercicio6 {
  
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        Random dado = new Random();
       int numero = dado.nextInt(6)+1;
       do {
           System.out.println("Ingrese 1. para lanzar dado");
           System.out.println("Ingrese 2. para terminar");
                int  num= sc.nextInt();

           if(num==1){
               System.out.println("El numero del dado es: "+numero);
         
           }
       } while (num!=1);
 
       
    }
}
