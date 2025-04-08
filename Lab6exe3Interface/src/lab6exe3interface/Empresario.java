/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6exe3interface;

/**
 *
 * @author unifenascimento
 */
public class Empresario extends Agente {

    private String empresa;

    public Empresario(String nome, String empresa) {
        super(nome, "Empresário");
        this.empresa = empresa;
    }

    @Override
    public void apresentacao() {
        if (modo_agente) {
            System.out.println("Agente Smith");
        } else {
            System.out.println("\nMeu nome é " + nome + "\nminha profissaão é: " + "Empresário" +  "\nminha empresa: " + empresa+"\n\n");
        }
    }

}
