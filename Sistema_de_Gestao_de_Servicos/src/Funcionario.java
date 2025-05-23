import javax.swing.*;

public class Funcionario extends Pessoa implements Trabalhador {

    private double salario;
    private Cargos cargos;


    public Funcionario(String nome, int idade, String cpf, double salario) {
        super();
        setNome(nome);
        setIdade(idade);
        setCpf(cpf);
        this.salario = salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public double getSalario(){
        return salario;
    }

    public void setCargos(Cargos cargos){
        this.cargos=cargos;
    }

    public Cargos getCargos(){
        return cargos;
    }

    @Override
    public void trabalhar(){
        JOptionPane.showMessageDialog(null,"O " + getNome() + " está trabalhando.");
    }

    @Override
    public void exibirDados(){
        JOptionPane.showMessageDialog(null,
                "Nome: " + getNome() +
                        "\nIdade: " + getIdade() +
                        "\nCPF: " + getCpf() +
                        "\nSalário: R$ " + salario+
                        "\nCargos: " + cargos
        );
    }
}
