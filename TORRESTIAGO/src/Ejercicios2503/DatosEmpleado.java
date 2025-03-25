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
public class DatosEmpleado {
    public static void main(String[] args) {
         
      
Scanner sc = new Scanner(System.in);
      
        System.out.print("Ingrese su nombre completo: ");
        String NombreCompleto = sc.nextLine();
                System.out.print("Ingrese su edad: ");
        int Edad = sc.nextInt();
        System.out.print("Ingrese su salario: ");
        double salario = sc.nextDouble();
        System.out.println("Su nombre es: "+NombreCompleto);
                System.out.println("Su edad es: "+Edad);   
                        System.out.println("Su salario es: "+salario);



    }
}
