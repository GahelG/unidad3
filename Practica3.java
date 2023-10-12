/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica3;
import java.util.Scanner;

/**
 *
 * @author gahelg
 */
public class Practica3 {

    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);
        
        System.out.print("Escriba la cantidad de números de la serie Fibonacci quiere ver: ");
        int num = scanner.nextInt();
        
        int n1 = 0;
        int n2 = 1;
        
        
        System.out.println("el resultado de la serie hasta el  número "+ num +" es:");
       for  (int i=0; i<=num ; i++ ){
           
           
                   
       
       int r=n1+n2;
       
      System.out.println(n2);
      
       n1=n2;
       n2=r;
            
        
               }
       
       
      
        
    }
}
