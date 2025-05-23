import javax.swing.*;

public class Cliente extends Pessoa {

    private String numeroContrato;

    public void setNumeroContrato(String numeroContrato){
        this.numeroContrato=numeroContrato;
    }

    public String getNumeroContrato(){
        return numeroContrato;
    }

    @Override
    public void exibirDados(){
        JOptionPane.showMessageDialog(null,"O nome é: "+getNome()+"\n A idade é: "+getIdade()+"\n O cpf é: "+getCpf()+"\n O contrato é: "+numeroContrato);
    }
}
