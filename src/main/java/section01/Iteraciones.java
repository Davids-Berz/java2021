package section01;

import java.util.Arrays;

public class Iteraciones {

    public static void main(String[] args) {

        String[] products = {"Samsung Galaxy", "Bicicleta", "Television", "Iphone x", "MackBook Air", "Disco Duro"};

        int totalProducts = products.length;

        Arrays.sort(products);

        System.out.println("sort\t");

        for (String product : products){
            System.out.println("product = " + product);
        }

        for (int i = 0; i < totalProducts/2; i++) {
            String actual = products[i];
            String inverso = products[totalProducts -1 - i];
            products[i] = inverso;
            products[totalProducts -1 - i] = actual;
        }

        System.out.println("sort inverse\t");

        for (String product : products){
            System.out.println("product = " + product);
        }
    }
}
