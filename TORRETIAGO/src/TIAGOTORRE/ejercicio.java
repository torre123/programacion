/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package TIAGOTORRE;
import java.util.Scanner;
/**
 * <> []
 * @author LABO B
 */
public class ejercicio {
 public static void main(String[] args) {
      
         Scanner sc2= new Scanner(System.in);
         System.out.println("ingrese el primer numero");
         int n1=sc2.nextInt();
         
         Scanner sc3= new Scanner(System.in);
         System.out.println("ingrese el segundo numero");
         int n2=sc3.nextInt();
        Scanner sc= new Scanner(System.in);
         System.out.println("ingrese la operacion");
         String signo=sc.nextLine();
   
         

        switch (signo) {
            case ("+"):
                int sum=n1+n2;
                System.out.println("la suma es igual: "+sum);
                break;
            case ("*"):
                int mul=n1*n2;
                System.out.println("la multiplicacion es igual: "+mul);
                break;
            case ("-"):
                int re=n1-n2;
                System.out.println("la resta es igual: "+re);
                break;
            default:
                int di=n1/n2;
                System.out.println("la diviion e igual: "+di);
        }

        System.out.println("Fin del programa.");
    }
}
