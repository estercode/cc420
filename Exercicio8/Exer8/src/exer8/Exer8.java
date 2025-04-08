/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exer8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author unifenascimento
 */
public class Exer8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        ArrayList<Pessoa> agenda = new ArrayList<>();

        while (true) {
            System.out.println("========================================");
            System.out.println("ENTRE COM UMA DAS SWGUINTES OPCOES");
            System.out.println("========================================");
            System.out.println("n [novo entrada]");
            System.out.println("d [apagar registro da agenda]");
            System.out.println("p [imprime toda a agenda]");
            System.out.println("q [sai do programa]");
            System.out.println("Digite a opcao: ");
            String op = scan.next();

            switch (op) {
                case "n":
                    System.out.print("Entre com o nome: ");
                    String nome = scan.next();
                    System.out.print("Entre com o telefone: ");
                    String telefone = scan.next();
                    agenda.add(new Pessoa(nome, telefone));
                    break;

                case "d":
                    System.out.print("Entre com o nome da pessoa a ser excluida: ");
                    String excluirNome = scan.next();
                    Iterator<Pessoa> iterator = agenda.iterator();
                    while (iterator.hasNext()) {
                        if (iterator.hasNext()) {
                            iterator.remove();
                        } else {

                            System.out.println("Pessoa não encontrada");
                        }
                    }

                    break;
                case "p":
                    System.out.println("\nAgenda");
                    for (Pessoa pessoa : agenda) {
                        System.out.println(pessoa);
                    }
                    break;
                case "q":
                    System.out.println("\nAte a proxima");
                    return;
                default:
                    System.out.println("Opção invalida");

            }
        }

    }

}
