import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        /*
        int i = 10;
        int j = 100;

        while (i > 0) {     // Somente roda quando a condição for verdadeira
            System.out.println("O valor de i "+i);
            i--;
        }

        do {                //
            System.out.println("O valor de j "+j);
            j++;
        } while (j < 10);
        */

        // Calculo tabuada 5

        int k = Integer.parseInt( JOptionPane.showInputDialog(null,"Digite o valor da tabuada: "));
        int i = 0;
        int j = k;

        while (i<9){
            System.out.println(j+k);
            j=j+k;
            i++;
        }
    }
}