import javax.swing.*;

public class Recrutamento extends RecursosHumanos {

    String tipo;

    public Recrutamento(int codigo, String responsavel, String tipo){
        super(codigo,responsavel);
        this.tipo=tipo;
    }

    public void exibirRecursosHumano(){
        JOptionPane.showMessageDialog(null, "O responsavel é:"+responsavel);
        JOptionPane.showMessageDialog(null,"O codigo é "+codigo);
        JOptionPane.showMessageDialog(null,"O tipo é : "+tipo);
    }
}
