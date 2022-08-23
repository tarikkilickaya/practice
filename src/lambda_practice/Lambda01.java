package lambda_practice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
    static List<String> menu = new ArrayList<>(Arrays.asList("kusleme", "adana", "trilice", "havucdilim", "buryan",
            "kokorec", "kuzutandir", "guvec"));

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

    //TODO task tek lerin karesini buyukten kucuge
    public static void teklerinKareBuyuktenKucuge(List<Integer> sayi) {
        sayi.stream().filter(t -> t % 2 != 0).map(t -> t * t).sorted(Comparator.reverseOrder()).forEach(Methodlarim::yazdir);

    }

    // Task : List elemanlarini alafabetik buyuk harf ve  tekrarsiz print ediniz.
    public static void alfabetikBuyukHarfTekrarsiz(List<String> yemek) {
    }

    // Task : list elelmanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..
    public static void strKarakterSayisiYazdir(List<String> yemek) {
    }

    // Task :TODO list elemanlarinin son harfine gore ters sirali print ediniz.
    public static void sonHarfeGoreTersSira(List<String> yemek) {
        yemek.stream().sorted(Comparator.comparing(t -> t.toString().charAt(t.toString().length() - 1)).reversed()).forEach(Methodlarim::yazdir);
    }

    // Task : listin elemanlarin karakterlerinin cift sayili  karelerini hesaplayan,ve karelerini tekrarsiz
    // buyukten kucuge sirali  print ediniz..
    public static void karakterCiftKareBuyuktenKucuge(List<String> yemek) {
    }

    // TODO Task : List elemanlarinin karakter sayisini 7 ve 7 'den az olma durumunu kontrol ediniz.
    public static void karakterSayiYedidenBuyuk(List<String> yemek) {
        System.out.println(yemek.stream().allMatch(t -> t.length() <= 7) ? "List elemanları 7 ve daha az harften oluşuyor" : "Bazı elemanlar 7'den büyük");
    }

    //anyMatch() --> en az bir eleman sarti saglarsa true aksi durumda false return eder
    //allMatch() --> tum  elemanlar sarti saglarsa true en az bir eleman sarti saglamazsa false return eder.
    //noneMatch() --> hic bir sarti SAGLAMAZSA true en az bir eleman sarti SAGLARSA false return eder.
    // Task : List elelmanlarinin "W" ile baslamasını kontrol ediniz.
    public static void basHarfiWIleBaslayan(List<String> yemek) {
    }

    // TODO Task : List elelmanlarinin "x" ile biten en az bir elemanı kontrol ediniz.
    public static void xIleBitenEleman(List<String> yemek) {
    }

    // TODO Task : Karakter sayisi en buyuk elemani yazdiriniz.
    public static void karakterEnFazla(List<String> yemek) {
        //limit(1) => Sınırlandırma demek. Bu akışın elemanlarından oluşan, uzunluğu maxSize'dan uzun olmayacak
        // şekilde kesilmiş bir akış return eder. Stream return eder.
        Stream<String> sonIsim = yemek.stream().sorted(Comparator.comparing(t -> t.toString().length()).reversed()).limit(1);
        System.out.println(Arrays.toString(sonIsim.toArray()));
    }

    /*
TRİCK : • Stream'ler ekrana direkt yazdırılamaz. Stream'i toArray() ile Array'e çeviririz.
Array'i de Arrays.toString() 'in içine alıp yazdırabiliriz.
•  Ör; System.out.println(Arrays.toString(***.toArray())); veya System.out.println(Arrays.asList(***.toArray()));
kullanılabilir.
*/
    //TODO Task : list elemanlarini son harfine göre siralayıp ilk eleman hariç kalan elemanlari print ediniz.
    public static void sonHarfeGoreSiralaIlkHaricElmanlariYaz(List<String> yemek) {
    }
}