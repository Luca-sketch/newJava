// Lista de exercicios

public class Main {
    public static void main(String[] args) {
        
        //Exercicio 1
        int[] exer1 = new int[5];

        for (int j = 0; j < exer1.length; j++) {
            exer1[j] = j + 1;
        }
        for (int numero: exer1) {
            System.out.println("O vetor exer1 é igual na posição " + numero + " é igual a " + numero);
        }

        //Exercicio2
        int[] exer2 = {10, 20, 30, 40};
        int soma = 0;
        for (int valor: exer2) {
            soma+=valor;
        }
        System.out.println("A soma total é igual a " + soma);

        //Exercicio3
        int[] exer3 = {3, 6, 9, 12, 15, 18};
        int totalPar = 0;
        String texto="Os numeros são: ";

        for (int valor: exer3) {
            if (valor% 2 == 0) {
                totalPar++;
                texto+=valor+"_";
            }
        }
        System.out.println(totalPar);
        System.out.println(texto);

        //Exercicio 4
        String[] exer4 = {"Ana", "Bruno", "Carlos", "Diana"};

        for (String n: exer4) {
            System.out.println("Olá, boa tarde " + n);
        }

        //Exercicio 5
        int[] exer5 = {2, 4, 6, 8};

        for (int k : exer5) {
            System.out.println("O valor do dobro do item " + k + " é " + k * 2);
        }
    }
}