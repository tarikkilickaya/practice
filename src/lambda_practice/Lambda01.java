package lambda_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Lambda01 {
    /* TASK :
     * Input olarak verilen listteki isimlerden
     * icinde 'a' harfi bulunanlari silen bir code create ediniz.
     *
     * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
     * OUTPUT : [Veli,Omer]
     */

    static ArrayList<String> names = new ArrayList<>(Arrays.asList("Tülay", "Zekeriya", "Hasan", "İsmail", "Osman", "Fatih", "Ersin", "Mevlüt"));
    static List<Integer> numbers = new ArrayList<>(Arrays.asList(25, 65, -56, 55, 98, -89, 65, 55, 21, 54, 9, 35, 35, 34));

    public static void aHarfleriSilenGerisiniYazdiran(ArrayList<String> isimler) {
        System.out.println(isimler.stream().map(m -> m.toLowerCase()).filter(m -> !m.contains("a")).collect(Collectors.toList()));
    }

    // En büyük elemanı bulun.
    public static void maxElemaniBul(List<Integer> sayi) {
        Optional<Integer> maxSayi = sayi.stream().distinct().reduce(Math::max);
        System.out.println("maxSayi = " + maxSayi);

        // 2. Yol
        System.out.println("sayi.stream().reduce(Integer::max) = " + sayi.stream().reduce(Integer::max));
    }

    // Task : List'teki tum elemanlarin toplamini yazdiriniz.
    public static void elemanlariTopla(List<Integer> sayilar) {
        Integer max = sayilar.stream().reduce(0, (a, b) -> a + b);
        System.out.println(max);
    }

    // Task : List'teki cift elemanlarin carpimini  yazdiriniz.
    public static void ciftElemanlariCarp(List<Integer> list) {
        Integer carpim = list.stream().filter(t -> t % 2 == 0).reduce(Math::multiplyExact).get();
        System.out.println(carpim);
    }
}