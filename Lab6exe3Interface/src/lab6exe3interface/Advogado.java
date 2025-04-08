/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6exe3interface;

/**
 *
 * @author unifenascimento
 */
public class Advogado extends Agente {

    private String OAB;

    public Advogado(String nome, String OAB) {
        super(nome, "Advodado");
        this.OAB = OAB;
    }

    @Override
    public void apresentacao() {
        if (modo_agente) {
            System.out.println("Agente Smith");
        } else {
            System.out.println("\nMeu nome é " + nome + "\nminha profissão: " + "Advogado" + "\nminha OAB: " + OAB+"\n\n");
        }

    }

}
