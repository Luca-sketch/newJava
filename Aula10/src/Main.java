import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Locale;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //----------------- Calculadora ---------
        /*
        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Entre com o primeiro número"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número"));

        int op = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha as opção:\n1.Soma\n2.Subtração\n3.Multiplicação\n4.Divisão"));

        switch (op){
            case 1: JOptionPane.showMessageDialog(null, "O valor da some é: "+(n1+n2));
                break;
            case 2: JOptionPane.showMessageDialog(null,"O valor da subtração é: " + (n1-n2));
                break;
            case 3: JOptionPane.showMessageDialog(null,"O valor da multiplicação é "+ (n1*n2));
                break;
            case 4: JOptionPane.showMessageDialog(null,"O valor da divisão é "+ (n1/n2));
            default:
                JOptionPane.showMessageDialog(null,"Opção inválida");
        }
        */


        //----------------- Escolha de sala ---------
        /*
       String curso = JOptionPane.showInputDialog(null,"Digite:\nP - Programação\nM - Mecânica\nE- Elétrica");

        switch (curso.toUpperCase()){
            case "P": JOptionPane.showMessageDialog(null, "Vá para a sala C09");
            break;
            case "M": JOptionPane.showMessageDialog(null, "Vá para a sala Oficina");
            break;
            case "E": JOptionPane.showMessageDialog(null,"Vá para a sala de Elétrica");
            break;
            default:JOptionPane.showMessageDialog(null,"Opção inválida");
        }
         */

        //CalcularValores calc = new CalcularValores();
        //calc.passarValores();
        //calc.calcular();

        //----------------- Conversor de Moeda ---------

        double valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Qual o valor a ser convertido: "));
        int moeda = Integer.parseInt(JOptionPane.showInputDialog(null,"1 - Dolar\n2- Libra\n3-Euro"));

        DecimalFormat df = new DecimalFormat("#.###"); // Instacia a classe de formatação de número, no exemplo são tes casas decimais

        switch (moeda){
            case 1: JOptionPane.showMessageDialog(null, "O valor em dolar é :"+ df.format(valor*5.57) );
                break;
            case 2: JOptionPane.showMessageDialog(null, "O valor em libra é :"+ df.format(valor*7.54) );
                break;
            case 3: JOptionPane.showMessageDialog(null, "O valor em euro é :"+ df.format(valor*6.35) );
                break;
            default: JOptionPane.showMessageDialog(null,"Entrada de valor errado");
        }

    }
}