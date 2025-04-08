package Controller;

import Model.*;
import View.CalculadoraGUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ester
 */
public class CalculadoraController {

    private CalculadoraGUI view;
    private double primeiroNumero;
    private String operacaoPendente;
    private boolean novoNumero;

    public CalculadoraController(CalculadoraGUI view) {
        this.view = view;
        this.novoNumero = true;

        view.adicionarListenerNumerico(new NumericoListener());
        view.adicionarListenerAdicao(new OperacaoListener("+"));
        view.adicionarListenerSubtracao(new OperacaoListener("-"));
        view.adicionarListenerMultiplicacao(new OperacaoListener("*"));
        view.adicionarListenerDivisao(new OperacaoListener("/"));
        view.adicionarListenerIgual(new IgualListener());
        view.adicionarListenerLimpar(new LimparListener());
    }

    public class NumericoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String digito = e.getActionCommand();
            String textoAtual = view.getDisplayText();

            if (novoNumero) {
                textoAtual = "";
                novoNumero = false;
            }

            view.setDisplayText(textoAtual + digito);
        }
    }

    public class OperacaoListener implements ActionListener {

        private String operacao;

        public OperacaoListener(String operacao) {
            this.operacao = operacao;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            primeiroNumero = Double.parseDouble(view.getDisplayText());
            operacaoPendente = operacao;
            novoNumero = true;
        }
    }

    public class IgualListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            double segundoNumero = Double.parseDouble(view.getDisplayText());
            double resultado = 0;
            Operacao operacao = null;

            switch (operacaoPendente) {
                case "+":
                    operacao = new Soma();
                    break;
                case "-":
                    operacao = new Subtracao();
                    break;
                case "*":
                    operacao = new Multiplicacao();
                    break;
                case "/":
                    operacao = new Divisao();
                    break;
            }
            resultado = operacao.calcular(primeiroNumero, segundoNumero);
            view.setDisplayText(String.valueOf(resultado));

            novoNumero = true;
            operacaoPendente = null;
        }
    }

    public class LimparListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            view.limparDisplay();
            primeiroNumero = 0;
            operacaoPendente = null;
            novoNumero = true;
        }
    }
}
