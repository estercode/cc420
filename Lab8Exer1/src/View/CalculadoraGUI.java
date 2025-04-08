package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalculadoraGUI extends JFrame {

    private JTextField display;
    private JButton[] botoesNum;
    private JButton adicao, subtrair, multiplicar, dividir, igual, clear;

    public CalculadoraGUI() {
        setTitle("Calculadora");
        setSize(100, 50);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        display = new JTextField();
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        JPanel painelBotoes = new JPanel(new GridLayout(5, 4));

        botoesNum = new JButton[10];
        for (int i = 0; i < 10; i++) {
            botoesNum[i] = new JButton(String.valueOf(i));
        }

        adicao = new JButton("+");
        subtrair = new JButton("-");
        multiplicar = new JButton("*");
        dividir = new JButton("/");
        igual = new JButton("=");
        clear = new JButton("C");

        painelBotoes.add(botoesNum[7]);
        painelBotoes.add(botoesNum[8]);
        painelBotoes.add(botoesNum[9]);
        painelBotoes.add(dividir);
        painelBotoes.add(botoesNum[4]);
        painelBotoes.add(botoesNum[5]);
        painelBotoes.add(botoesNum[6]);
        painelBotoes.add(multiplicar);
        painelBotoes.add(botoesNum[1]);
        painelBotoes.add(botoesNum[2]);
        painelBotoes.add(botoesNum[3]);
        painelBotoes.add(subtrair);
        painelBotoes.add(clear);
        painelBotoes.add(botoesNum[0]);
        painelBotoes.add(igual);
        painelBotoes.add(adicao);

        add(painelBotoes, BorderLayout.CENTER);
    }

    public void adicionarListenerNumerico(ActionListener listener) {
        for (JButton botao : botoesNum) {
            botao.addActionListener(listener);
        }
    }

    public void adicionarListenerAdicao(ActionListener listener) {
        adicao.addActionListener(listener);
    }

    public void adicionarListenerSubtracao(ActionListener listener) {
        subtrair.addActionListener(listener);
    }

    public void adicionarListenerMultiplicacao(ActionListener listener) {
        multiplicar.addActionListener(listener);
    }

    public void adicionarListenerDivisao(ActionListener listener) {
        dividir.addActionListener(listener);
    }

    public void adicionarListenerIgual(ActionListener listener) {
        igual.addActionListener(listener);
    }

    public void adicionarListenerLimpar(ActionListener listener) {
        clear.addActionListener(listener);
    }

    public String getDisplayText() {
        return display.getText();
    }

    public void setDisplayText(String text) {
        display.setText(text);
    }

    public void limparDisplay() {
        display.setText("");
    }
}
