/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exer8;

/**
 *
 * @author unifenascimento
 */
public class Pessoa {

    private static int contId = 1;
    private int id;
    private String nome;
    private String telefone;

    public Pessoa(String nome, String telefone) {
        this.id = contId++;
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String toString() {
        return "ID: " + id + ", Nome: " + nome + " Telefone: " + telefone;
    }

}
