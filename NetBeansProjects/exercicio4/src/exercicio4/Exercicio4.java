/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio4;

import java.util.Scanner;

/**
 *
 * @author unifenascimento
 */
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double media_aprova = 6.0;
        System.out.println("Digite a quantidade de alunos: ");
        int quant = input.nextInt();
        int i;
        if(quant <= 0 || quant > 80){
             System.out.println("ERRO!");
        }
         
        if (quant> 0 && quant <= 80 ){
         while(quant != 0){   
         System.out.println("Digite a sua nota: ");
         int nota = input.nextInt();
        }
        
        }
    }
    
}
