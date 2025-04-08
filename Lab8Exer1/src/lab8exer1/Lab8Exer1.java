/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab8exer1;

import View.CalculadoraGUI;
import Controller.CalculadoraController;
/**
 *
 * @author ester
 */
public class Lab8Exer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CalculadoraGUI view = new CalculadoraGUI();
        new CalculadoraController(view);
        view.setVisible(true);
    }
    
}
