/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab7exer6;

import java.util.Scanner;

/**
 *
 * @author unifenascimento
 */
public class Lab7Exer6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);

        while (true) {

            try {
                System.out.println("Digite seu nome: ");
                String nome = scan.next();
                System.out.println("Digite seu sobrenome: ");
                String sobrenome = scan.next();
                System.out.println("Digite sua idade: ");
                int idade = scan.nextInt();
                System.out.println("Digite seu CPF: ");
                String cpf = scan.next();
                
                Pessoa pessoa = new Pessoa (nome, sobrenome, idade, cpf);
                System.out.println("CADASTRO REALIZADO COM SUCESSO");
                break;
            } catch(CpfInvalido ex)  {
                 System.out.println(ex);
                

            }

        }
    }

}
