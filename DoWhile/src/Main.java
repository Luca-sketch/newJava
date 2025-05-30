import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;
//
//

public class Main {
    public static void main(String[] args) {


        int [][] numeros = new int[2][2];

        for (int i=0;i<=1;i++){

            for (int j=0;j<=1;j++){
                numeros[i][j]= Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o primeiro numero "));
            }
        }

        for (int i=0;i<=1;i++){
            for (int j=0;j<=1;j++){
                System.out.println(numeros[i][j]);
            }
        }





        
        /*

        int [][] numeros = new int[2][2];
        numeros[0][0]=1;
        numeros[0][1]=2;
        numeros[1][0]=3;
        numeros[1][1]=4;

        for (int i=0;i<=1;i++){
            for (int j=0;j<=1;j++){
                System.out.println(numeros[i][j]);
            }
        }
*/


/*
        ArrayList<Integer> idadeAluno = new ArrayList<>();
        int idade;

        int op;
        do{
            idade =Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
        if(idade<=18){
            JOptionPane.showMessageDialog(null,"Não cadastrado, menor de idade");
        }else{
            idadeAluno.add(idade);
        }
        op=JOptionPane.showConfirmDialog(null,"Deseja sair?",null,JOptionPane.YES_NO_CANCEL_OPTION);
        }while (op!=0);

        for (int id:idadeAluno)
        {System.out.println(id);}
*/

/*
           ArrayList<String> alunos = new ArrayList<>();
           ArrayList<String> cpfs = new ArrayList<>();
           String status;



           do{
               alunos.add(JOptionPane.showInputDialog("Digite o nome do aluno:"));
               cpfs.add(JOptionPane.showInputDialog("Digite o cpf do aluno:"));
               status=JOptionPane.showInputDialog("Deseja continuar?\n S/N");
           }while (status.toLowerCase().equals("s"));

           for (String aluno: alunos){
               int i = 0;
               JOptionPane.showMessageDialog(null,"Os alunos cadastrados foram "+ aluno + " com o numero do cpf" + cpfs.get(i));
               i++;
           }

 */
    }
}