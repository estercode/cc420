/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5exer3;

/**
 *
 * @author unifenascimento
 */
public class Cruzador extends NavioDeGuerra {

    protected int numCanhoes;

    public Cruzador(int numCanhoes, double blindagem, double ataque, int numTripulantes, String nome) {
        super(blindagem, ataque, numTripulantes, nome);
        this.numCanhoes = numCanhoes;
    }

    public int getNumCanhoes() {
        return numCanhoes;
    }

    public void setNumCanhoes(int numCanhoes) {
        this.numCanhoes = numCanhoes;
    }

   @Override
    public void poderDeFogo() {
         System.out.println("Ataque: " + Math.sqrt(numCanhoes)*super.getAtaque());
    }
}
