package section01;

import java.util.Arrays;

public class EjemploArreglo {

    public static void main(String[] args) {

        int[] numeros = new int[4];

        numeros[0] = 10;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[3];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);

        Arrays.sort(numeros);

        for(int numero: numeros){
            System.out.println(numero);
        }
    }
}