import javax.swing.*;

public class It {

    String nome;
    String cargo;
    int tempoCasa;

    public It(String nome, String cargo, int tempoCasa){
        this.nome=nome;
        this.cargo=cargo;
        this.tempoCasa=tempoCasa;
    }

    public void exibirSetor(){
        JOptionPane.showMessageDialog(null,"O nome do funcionario é: "+nome);
        JOptionPane.showMessageDialog(null,"O cargo é: " +cargo);
        JOptionPane.showMessageDialog(null,"O tempo de casa é: "+tempoCasa);
    }
}
