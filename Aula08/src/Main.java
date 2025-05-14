// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)
    {
        //RecursosHumanos sede = new RecursosHumanos(1,"lucas");
        //sede.exibirInfo();

     //   It it = new It("Lucas","Analista Software",14);
     //   it.exibirSetor();

        /*
        Treinamento sedeT = new Treinamento(1, "lucas","Presencial");
        sedeT.exibirInfo();
        sedeT.exibirCategoria();
         */

        Recrutamento recrutamento = new Recrutamento(5,"Marina","Admissão");
        recrutamento.tipo="promoção";
        recrutamento.codigo=5;
        recrutamento.exibirRecursosHumano();
    }
}