package day7_practice;

public class Q03_MDArray {
    public static void main(String[] args) {
        /*
         * Girilen Multidimensional arraydeki cift sayilari toplayan bir method
         * yaziniz
         * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
         *
         * OUTPUT : Arraydeki cift sayilarin toplami : 30
         */

        int[][] arr = {{1, 3, 6}, {2, 8}, {5, 7, 9, 14}};

        ciftleriTopla(arr);
        System.out.println(ciftleriTopla(arr));

    }

    public static int ciftleriTopla(int[][] arr) {
        int toplam = 0;

        for (int[] each1 : arr) {
            for (int each2 : each1) {
                 if (each2 % 2 == 0){
                     toplam+= each2;
                 }
            }
        }
        return toplam;
    }
}