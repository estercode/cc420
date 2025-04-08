/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6exe3interface;

/**
 *
 * @author unifenascimento
 */
public abstract class Agente {

    protected String nome;
    protected boolean modo_agente;
    protected String profissao;

    public Agente(String nome, String profissao) {
        this.nome = nome;
        this.modo_agente = false;
        this.profissao = profissao;
    }

    public void modo_agente_on() {

        this.modo_agente = true;
    }

    public void apresentacao() {

    }

}
