package section01;

public class Arreglos {
    public static void main(String[] args) {

        int[][] array = new int[2][10];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == 0) array[i][j] = j;
                if (i != 0) array[i][j] = j * (i * 5);
            }
        }

        int a = 0, b = 0;
        for (int[] i : array) {
            System.out.println("Array " + a);
            for (int j : i) {
                System.out.println("array [" + a + "] [" + b + "] = " + j);
                b++;
            }
            b = 0;
            a++;
        }
    }
}
