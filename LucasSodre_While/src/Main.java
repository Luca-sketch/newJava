// Nome: Lucas Eduardo Sodré
// Data: 22/05/2025
// Atividade: Loop While

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

/*
        int entrada;
        do {
            entrada = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero:"));
            JOptionPane.showMessageDialog(null, "O numero digitado foi " + entrada);
        } while (entrada != 5);
 */

        /*
        int i;
        String[] cursos = new String[5];
        cursos[0]="PL";
        cursos[1]="Java";
        cursos[2]="Python";
        cursos[3]="Mecanica";
        cursos[4]="Automação";
        for (i=0;i<5;i++) {System.out.println("O curso é: " + cursos[i]);}
        */

/*
        int i;
        String texto ="";
        String[] aluno = new String[5];

        for (i=0;i<5;i++){
            aluno[i] = JOptionPane.showInputDialog(null,"Insira o nome do aluno");
        }

        for (i=0;i<5;i++){
            JOptionPane.showMessageDialog(null,"O nome do aluno na posição "+i+"° "+aluno[i]);
        }

        for (int j=0;j<5;j++){
            texto +="\n Nome: "+aluno[j];
            JOptionPane.showMessageDialog(null,texto);
        }*/

        int [] nume= new int[10];
        String text="";

        for (int k=0;k<=11;k++){
            nume[k]=k+1;
            text+="\n O numero é :"+nume[k];
            JOptionPane.showMessageDialog(null,text);}
    }
}


