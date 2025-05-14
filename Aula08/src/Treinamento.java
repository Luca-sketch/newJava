import javax.swing.*;

public class Treinamento extends RecursosHumanos{

    String categoria;

    public Treinamento(int codigo, String responsavel, String categoria){
        super(codigo,responsavel);
        this.categoria= categoria;
    }


    public void exibirCategoria(){
        JOptionPane.showMessageDialog(null,"O código é "+codigo);
        JOptionPane.showMessageDialog(null,"O responsavel é "+responsavel);
        JOptionPane.showMessageDialog(null,"A categoria é "+ categoria);
    }
}
