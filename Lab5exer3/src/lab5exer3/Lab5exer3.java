/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5exer3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author unifenascimento
 */
public class Lab5exer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<NavioDeGuerra> nGuerras = new ArrayList<>();
        ArrayList<NavioMercante> nMercantes = new ArrayList<>();
        ArrayList<Cruzador> nCruzadores = new ArrayList<>();
        ArrayList<PortaAvioes> nAvioes = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        //guerra
        for (int i = 0; i < 2; i++) {
            System.out.println("Digite o numero de tripulantes:");
            String numTripulantes = scan.next();
            System.out.println("Digite o nome do navio:");
            String nome = scan.next();
            

        }
        //mercante
        for (int i = 0; i < 2; i++) {
            System.out.println("Digite o nome do navio:");
            String nome = scan.next();
            System.out.println("Digite o ataque:");
            double ataque = scan.nextInt();
            System.out.println("Digite a blindagem:");
            double blindagem = scan.nextInt();

        }
        //cruzador 
        for (int i = 0; i < 2; i++) {
            System.out.println("Digite o nome do navio: ");
            String nome = scan.next();
            System.out.println("Digite o ataque: ");
            double ataque = scan.nextInt();

        }
        // porta avioes
        for (int i = 0; i < 2; i++) {
            System.out.println("Digite o nome do navio: ");
            String nome = scan.next();
            System.out.println("Digite o ataque: ");
            double ataque = scan.nextInt();

        }
        
        for(NavioDeGuerra guerras: nGuerras ){
            guerras.exibirArmas();
        }
        for(NavioMercante mercantes: nMercantes ){
            mercantes.carregamento();
        }
        for(Cruzador cruzadores: nCruzadores ){
            cruzadores.poderDeFogo();
        }
        for(PortaAvioes avioes: nAvioes ){
            avioes.poderDeFogo();
        }
    }

}
