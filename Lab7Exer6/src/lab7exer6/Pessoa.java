/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7exer6;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author unifenascimento
 */
public class Pessoa {

    private String nome;
    private String sobrenome;
    private int idade;
    private String cpf;

    public Pessoa(String nome, String sobrenome, int idade, String cpf) throws CpfInvalido {

        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        if (cpf.contains(".") || cpf.contains("-")) {

            throw new CpfInvalido("ERRO!!! CPF INVALIDO, NECESSARIO COLOCAR SEM . OU -");

        }
        this.cpf = cpf;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
