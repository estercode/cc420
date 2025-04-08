/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5exer3;

/**
 *
 * @author unifenascimento
 */
public class NavioDeGuerra extends Navio {

    protected double blindagem;
    protected double ataque;

    public NavioDeGuerra(double blindagem, double ataque, int numTripulantes, String nome) {
        super(numTripulantes, nome);
        this.blindagem = blindagem;
        this.ataque = ataque;
    }

    public double getBlindagem() {
        return blindagem;
    }

    public void setBlindagem(double blindagem) {
        this.blindagem = blindagem;
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    public void exibirArmas() {
        System.out.println("Nome: " + super.getNome() + "Ataque: " + ataque + "Blindagem: " + blindagem);
        poderDeFogo();
    }

    public void poderDeFogo() {
        System.out.println("Ataque: " + ataque);
    }

}
