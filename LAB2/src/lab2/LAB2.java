/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2;

import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author unifenascimento
 */
public class LAB2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        Invoice venda = new Invoice();
        
        System.out.println("Digite o indentificador: ");
        String indentificador = scan.next();
        
        System.out.println("Digite a quantidade: ");
        int qtde = scan.nextInt();
        
        System.out.println("Digite a descrição: ");
        String desc  = scan.next();
        
        System.out.println("Digite o preco do item: ");
        double preco = scan.nextDouble();
        
        venda.setinvoice(indentificador, desc, qtde, preco);
        
        System.out.println("Essa é o valor da quantia do seu item R$: " + 
                venda.getInvoceAmount() );
        
    }
    
}
