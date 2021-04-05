package section01;

public class MetodoBurbuja {

    public static void main(String[] args) {

        int[] numeros = {1, 5, 3, 7, 6, 9, 2};
        int contador = 0;
        int total = numeros.length;
        for (int i = 0; i < total; i++) {
            for (int j = 0; j < total - 1 - j; j++) {
                if(numeros[i] < numeros[j] + 1){
                    int aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j]=aux;
                }
                contador++;
            }
        }

        for(int i: numeros){
            System.out.print(i + " ");
        }
        System.out.println("contador = " + contador);
    }
}
