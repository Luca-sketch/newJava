// Aula 09
// Rotinas


import javax.swing.*;
import java.util.jar.JarInputStream;

//
//
public class Main {
    public static void main(String[] args) {



        Cliente cliente1 = new Cliente();
        cliente1.setNome(JOptionPane.showInputDialog(null,"Digite o nome: "));
        cliente1.setLogin(JOptionPane.showInputDialog(null,"Digite o login"));
        cliente1.setSenha(JOptionPane.showInputDialog(null,"Digite a senha"));

        JOptionPane.showMessageDialog(null,cliente1.getNome());
        JOptionPane.showMessageDialog(null,cliente1.getLogin());

        cliente1.testarCredencial();

    }
}