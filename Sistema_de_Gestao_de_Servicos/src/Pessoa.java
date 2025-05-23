import javax.swing.*;

public class Pessoa {

    private String nome;
    private int idade;
    private String cpf;


    public Pessoa() {

    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return idade;
    }

    public void setCpf(String cpf) {
        if (cpf == null || cpf.length() < 5) {
            throw new CpfInvalidoException("CPF inválido! Deve conter pelo menos 5 caracteres.");
        }
        this.cpf = cpf;
    }

    public String getCpf(){
        return cpf;
    }

    public void exibirDados(){
        JOptionPane.showMessageDialog(null,
                "O nome é: " + nome +
                        "\nA idade é: " + idade +
                        "\nO CPF é: " + cpf
        );
    }
}
