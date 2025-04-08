/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio2;

/**
 *
 * @author unifenascimento
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        // TODO code application logic here
        /*2- Faça um algoritmo  que imprima os numeros sde 1 a 50 de 1 em 1 e de  52 a 100* de 2 em 2*/
        for(i =1;i<=50; i++){
           System.out.print("\n" + i);
    }
      System.out.print("\n-----------");
        for (i = 51; i <=100; i++){
            if(i % 2 == 0){
                
                System.out.print("\n" + i);
            }
   }
}    
    
}
