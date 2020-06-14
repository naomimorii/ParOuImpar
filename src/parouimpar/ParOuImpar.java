/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parouimpar;

import java.util.Scanner;
public class ParOuImpar {


    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double n1;
        
        System.out.print("Digite um número: ");
        n1 = entrada.nextDouble();
        if(n1%2==0)
            System.out.print("O número é par \n");
        else
            System.out.print("O número é ímpar \n");
    }
    
}
