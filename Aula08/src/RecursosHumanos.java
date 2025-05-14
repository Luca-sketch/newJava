import javax.swing.*;

public class RecursosHumanos {
    int codigo;

    String responsavel;

    public RecursosHumanos(int codigo, String responsavel){
        this.codigo=codigo;
        this.responsavel=responsavel;
    }

    public void exibirInfo(){
        JOptionPane.showMessageDialog(null, "Código: "+ codigo);
        JOptionPane.showMessageDialog(null,"Responsável:" + responsavel);
    }
}
