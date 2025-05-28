public class VerPositivo {
    int[] exer5 = {2, 4, 6, 8};

    public void chamarVerposisitivo(){
        verPositivo(0);
    }

    public void verPositivo(int numero
    ) {
        if (numero >= exer5.length) {
            return;
        }
        System.out.println("O valor do dobro do vetor na posição " + numero + " é " + (exer5[numero] * 2));
        verPositivo(numero + 1);
    }

}
