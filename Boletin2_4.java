/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_4;

import java.util.Scanner;

/**
 *
 * @author dperezlojo
 */
public class Boletin2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
    float num1, num2;
    System.out.println("teclea num1: ");
    num1=sc.nextFloat();
    System.out.println("teclea num2: ");
    num2=sc.nextFloat();
    System.out.println("suma= "+ (num1+num2));
    System.out.println("resta=" + (num1-num2));
    System.out.println("producto=" + (num1*num2));
    System.out.println("cociente=" + (num1/num2));
    
    System.out.println("commit");
    }
    
    
}
