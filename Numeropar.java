/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numeropar;
import java.util.Scanner;

/**
 *
 * @author GahelG
 */
public class Numeropar {

    public static void main(String[] args) {
       
        Scanner ent=new Scanner(System.in);
                
                int N;
                System.out.println("ingresa un número ");
                N=ent.nextInt();
                
                if (N % 2 ==0){
                    System.out.println("El número es par ");
                    
                     }
                    else {
                    System.out.println("El número es impar");
                }
                ent.close();
    }
}
