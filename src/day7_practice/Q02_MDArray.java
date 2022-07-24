package day7_practice;

import java.util.Arrays;

public class Q02_MDArray {
    public static void main(String[] args) {
        /*
         *  String 2D array olustur
         *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
         *  String de $ varsa 3.2 ile carp
         *  String de € varsa 4.2 ile carp
         *  elemanlarin toplamini double olarak yazdir
         */

        String[][] arr = {{"$12", "$22", "0$"}, {"€9", "€40", "$1"}, {"€12", "$2", "$0"}};

        double toplam = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j].contains("$")) {
                    toplam += Double.parseDouble(arr[i][j].replaceAll("\\$", "")) * 3.2;
                    // parantez içindeki replacAll methodu ile $ işaretlerinden kurtulduk, elimizde String "12" var.
                    // double toplam variable ile işleme katmak içiçn data casting yapmak gerekir. Bu yüzden
                    // Double.parseDouble kullandık. Bu aşamada 12 değerinin data türü double oldu.
                    // Eklerken de 3.2 ile çarptık.
                } else if (arr[i][j].contains("€")) {
                    toplam += Double.parseDouble(arr[i][j].replaceAll("€", "")) * 4.2;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println(toplam);
    }
}