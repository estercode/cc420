/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5exer3;

/**
 *
 * @author unifenascimento
 */
public class NavioMercante extends Navio {

    protected double capacidadeCarga;
    protected double carga;

    public NavioMercante(double capacidadeCarga, double carga, int numTripulantes, String nome) {
        super(numTripulantes, nome);
        this.capacidadeCarga = capacidadeCarga;
        this.carga = carga;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public void carregamento() {
          System.out.println("Nome: " + super.getNome()+ "Tripulantes: "+ super.getNumTripulantes() + "Capacidade de Carga: "+capacidadeCarga + "Carga: " + carga);

    }

}
