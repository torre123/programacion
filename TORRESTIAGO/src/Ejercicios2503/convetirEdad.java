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
public class convetirEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su edad ");
        int edad=sc.nextInt();
        
        if (edad<16){
            System.out.println("no tienes permitido conducir");
        }else{
                    System.out.println("tienes permitido conducir");

        }
    }
}
