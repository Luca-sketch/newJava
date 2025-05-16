import javax.swing.*;

public class Cliente {

    private String nome;
    private String login;
    private String senha;


    public void setNome(String nome){
        this.nome=nome;
    }

    public String getNome(){
        return nome;
    }

    public void setLogin(String login){
        this.login=login;
    }

    public String getLogin(){
        return login;
    }

    public void setSenha(String senha){
        this.senha=senha;
    }

    public String getSenha(){
        return senha;
    }

    public void testarCredencial(){
        String l ="adm";
        String s ="1234";

        if(login.equals(l) && senha.equals(s)){
            JOptionPane.showMessageDialog(null,"Bem vindo: "+l+" sua senha é: "+"\n"+s);
        }else {
            JOptionPane.showMessageDialog(null,"Voce colocou sua senha errada, deveria ser "+l+" sua senha é: "+"\n"+s);
        }
    }
}
