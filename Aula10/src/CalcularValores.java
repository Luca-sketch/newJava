import javax.swing.*;

public class CalcularValores extends EntradaValores {

    public void calcular() {
        int n1 = getN1();
        int n2 = getN2();
        int op = getOp();

        switch (op) {
            case 1:
                JOptionPane.showMessageDialog(null, "O valor da soma é: " + (n1 + n2));
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "O valor da subtração é: " + (n1 - n2));
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "O valor da multiplicação é: " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    JOptionPane.showMessageDialog(null, "O valor da divisão é: " + ((double) n1 / n2));
                } else {
                    JOptionPane.showMessageDialog(null, "Não é possível dividir por zero.");
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida");
        }
    }
}