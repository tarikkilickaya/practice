package day13_interviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03_Fibonacci {
    public static void main(String[] args) {
        /*
        Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
        0-1-1-2-3-5-8-13-21-34....
        */

        List<Integer> fibonacciList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int sayi = scan.nextInt();
        fibonacciList.add(0);
        fibonacciList.add(1);
        System.out.println("fibonacciList = " + fibonacciList);
        int i = 1;
        if (sayi <= 1) {
            System.out.println("Daha büyük sayılar giriniz ");
        } else {
            while (fibonacciList.get(i) < sayi) {
                fibonacciList.add(fibonacciList.get(i) + fibonacciList.get(i - 1));
                i++;
            }
            System.out.println("fibonacciList = " + fibonacciList);
        }
        int sonIndextekiEleman = fibonacciList.size() - 1;
        if (fibonacciList.get(sonIndextekiEleman) > sayi) {
            fibonacciList.remove(sonIndextekiEleman);
            System.out.println("Girdiğiniz sayı fibonacci dizinde bulunmamaktadır. " +
                    "Girdiğiniz sayıya kadarki fibonacci dizisi budur : " + fibonacciList);
        } else {
            System.out.println("Girdiğiniz sayı fibonacci dizisinde var : " + fibonacciList);
        }
    }
}