import javax.swing.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Pessoa> pessoas = new ArrayList<>();

        String[] nomes = new String[5];

        Funcionario f1 = new Funcionario("Lucas", 33, "123456", 8000);
        f1.setCargos(Cargos.SENIOR);

        Cliente c1 = new Cliente();
        c1.setNome("Jessica");
        c1.setIdade(33);
        try {
            c1.setCpf("123");
        } catch (CpfInvalidoException e) {
            JOptionPane.showMessageDialog(null, "Erro ao definir CPF: " + e.getMessage());
        }
        c1.setNumeroContrato("2026");

        Freelancer fl1 = new Freelancer("Marcos");
        fl1.setProjeto("Sistema de Vendas");

        // Adicionando na lista
        pessoas.add(f1);
        pessoas.add(c1);
        pessoas.add(fl1);

        // Polimorfismo em ação!
        for (Pessoa p : pessoas) {
            p.exibirDados(); // Cada objeto vai exibir do seu jeito!
        }
    }
}
