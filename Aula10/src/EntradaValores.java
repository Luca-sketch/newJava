import javax.swing.*;

public class EntradaValores {

    private int n1;
    private int n2;
    private int op;

    public int getN1() {
        return n1;
    }

    public int getN2() {
        return n2;
    }

    public int getOp() {
        return op;
    }

    public void passarValores() {
        n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o primeiro número"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número"));
        op = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha a opção:\n1.Soma\n2.Subtração\n3.Multiplicação\n4.Divisão"));
    }
}
