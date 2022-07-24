package day7_practice;

import java.util.Arrays;
import java.util.Scanner;

public class Q06_ArrayList {
    public static void main(String[] args) {

        /*
        Kullanıcın girdiği bir arrayin en büyük ile en küçük elemanının farkını bulan bir method oluşturun
         */

        farkiniBul();
    }

    public static void farkiniBul() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Array uzunluğunu giriniz : ");
        int uzunluk = scan.nextInt();
        int arr[] = new int[uzunluk];

        for (int i = 0; i < uzunluk; i++) {
            System.out.print("Arrayin " + (i + 1) + ". elemanını giriniz : ");
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Arraydeki en büyük eleman ile en küçük eleman arasındaki fark : " + (arr[uzunluk-1] - arr[0]));

        // Ödev : Bu soruyu Math classı kullanarak çözün.
    }
}