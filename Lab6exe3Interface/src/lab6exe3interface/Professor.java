/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6exe3interface;

/**
 *
 * @author unifenascimento
 */
public class Professor extends Agente {

    private String escola;

    public Professor(String nome, String escola) {
        super(nome, "Professor");
        this.escola = escola;
    }

    @Override
    public void apresentacao() {
        if (modo_agente) {
            System.out.println("Agente Smith");
        } else {
            System.out.println("\nMeu nome é " + nome +  "\nminha profissão: " + "Professor" + "\nminha escola: " + escola+"\n\n");
        }

    }

}
