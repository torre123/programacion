/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TIAGOTORRE;
import java.util.Scanner;
/**
 *
 * @author LABO B
 */
public class SIISISIS {
     public static void main(String[] args) {
           
         String mult = "*",sum="+",div="/",rest="-"; 
         Scanner sc= new Scanner(System.in);
         System.out.println("ingrese el primer numero");
         int num1=sc.nextInt();
         
         Scanner sc2= new Scanner(System.in);
         System.out.println("ingrese el segundo numero");
         int num2=sc2.nextInt();
         
         Scanner sc3= new Scanner(System.in);
         System.out.println("ingrese la operacion");
         String cal=sc3.toString();
        if(cal==sum){
        int calculo = num1+num2;
                 System.out.println("suma es igual a: "+ calculo);

         }
         if(cal==rest){
        int calculo = num1-num2;
                 System.out.println("resta es igual a: "+ calculo);

         }
          if(cal==mult){
        int calculo = num1*num2;
                 System.out.println("multiplicacion es igual a: "+ calculo);

         }
           if(cal==div){
        int calculo = num1/num2;
                 System.out.println("division es igual a: "+ calculo);

         }
        
         

     }
}
