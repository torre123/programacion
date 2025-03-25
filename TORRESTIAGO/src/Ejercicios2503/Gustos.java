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
public class Gustos {
    public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el gusto ");
        String gusto=sc.nextLine().toLowerCase();
        
        if (gusto.equals("chocolate")
                ||gusto.equals("vainilla")
                ||gusto.equals("frutilla")
                ||gusto.equals("dulce de leche")){
            System.out.println("si tenemos el gusto");
        }else{
                    System.out.println("No tenemos el gusto");

        }
    }
}
