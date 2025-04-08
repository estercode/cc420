/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6exe3interface;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author unifenascimento
 */
public class Lab6exe3Interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        ArrayList<Agente> agentes = new ArrayList<>();

        while (true) {
            System.out.println("\n=======MENU======");
            System.out.println("[1] Criar Empresário");
            System.out.println("[2] Criar Professor");
            System.out.println("[3] Criar Advogado");
            System.out.println("[4] Listar apresentações");
            System.out.println("[5] Transformar em Agente Smith");
            System.out.println("[6] Sair");
            System.out.println("Escolha uma opção");
            int op = scan.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Digite o nome: ");
                    String nomeEmp = scan.next();
                    System.out.println("Digite a empresa: ");
                    String empresa = scan.next();
                    agentes.add(new Empresario(nomeEmp, empresa));
                    break;
                case 2:
                    System.out.println("Digite o nome: ");
                    String nomeProf = scan.next();
                    System.out.println("Digite a escola: ");
                    String escola = scan.next();
                    agentes.add(new Professor(nomeProf, escola));
                    break;
                case 3:
                    System.out.println("Digite o nome: ");
                    String nomeAdv = scan.next();
                    System.out.println("Digite a OAB: ");
                    String OAB = scan.next();
                    agentes.add(new Advogado(nomeAdv, OAB));
                    break;
                case 4:
                    System.out.println("==========LISTA=============");
                    for (Agente agente : agentes) {
                        agente.apresentacao();
                    }
                    break;
                case 5:
                    System.out.println("Digite o nome que deseja transformar em Agente Smith: ");
                    String nomeAgente = scan.next();
                    for (Agente agente : agentes) {
                        if (agente.nome.equalsIgnoreCase(nomeAgente)) {
                            agente.modo_agente_on();
                            System.out.println(nomeAgente + "É UM AGENTE SMITH!");
                            break;
                        }

                    }
                    break;
                case 6:
                    System.out.println("ATÉ MAIS");
                    return;
                default:
                    System.out.println("[OPCÃO INVALIDA!!!!!");
            }
        }

    }

}
