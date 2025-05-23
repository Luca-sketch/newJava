import javax.swing.*;

public class Freelancer extends Pessoa implements Trabalhador {

    private String projeto;

    public void setProjeto(String projeto){
        this.projeto=projeto;
    }

    public String getProjeto(){
        return projeto;
    }

    public Freelancer(String nome){
        setNome(nome);
    }

    @Override
    public void trabalhar(){
        JOptionPane.showMessageDialog(null,"O trabalhor "+getNome()+ " está trabalhando");
    }

}
