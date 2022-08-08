package day12_okulProje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {

    static List<Kisi> ogrtmnList = new ArrayList<>();
    static List<Kisi> ogrncList = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static String kisiTuru;


    public static void girisPaneli() {
        System.out.println("====================================");
        System.out.println("ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ");
        System.out.println("====================================");
        System.out.println("1 - ÖĞRENCİ İŞLEMLERİ");
        System.out.println("2 - ÖĞRETMEN İŞLEMLERİ");
        System.out.println("Q - ÇIKIŞ");

        String secim = scan.next().toUpperCase();
        switch (secim) {
            case "1":
                kisiTuru = "ÖĞRENCİ";
                islemMenusu();
                break;
            case "2":
                kisiTuru = "ÖĞRETMEN";
                islemMenusu();
                break;
            case "Q":

                break;
            default:
                System.out.println("Hatalı giriş :(");
                girisPaneli();
                break;
        }
    }

    private static void islemMenusu() {
        System.out.println("Seçtiğin kişi türü " + kisiTuru);
        System.out.println("============= İŞLEMLER =============\n" +
                "         1-EKLEME\n" +
                "         2-ARAMA\n" +
                "         3-LİSTELEME\n" +
                "         4-SİLME\n" +
                "         5-ANA MENÜ\n" +
                "         0-ÇIKIŞ");

        System.out.println("İşlem tercihinizi giriniz : ");
        int secilenIslem = scan.nextInt();
        switch (secilenIslem) {
            case 1:
                ekle();
                islemMenusu();
                break;
            case 2:
                // arama();
                islemMenusu();
                break;
            case 3:
                // listeleme();
                islemMenusu();
                break;
            case 4:
                // silme();
                islemMenusu();
                break;
            case 5:
                girisPaneli();
                islemMenusu();
                break;
            case 0:
                // cikis();
                break;
            default:
                System.out.println("Güzel bir şey gir");
                islemMenusu();
                break;
        }
    }

    private static void ekle() {
        System.out.println("******* " + kisiTuru + " ekleme sayfasına hoş geldin");
        System.out.println("İsim soyisim gir : ");
        String adSoyad = scan.nextLine();
        scan.nextLine();
        System.out.println("Kimlik gir : ");
        String kimlikNo = scan.nextLine();

        System.out.println("Yaş gir : ");
        int yas = scan.nextInt();

        if (kisiTuru.equals("ÖĞRENCİ")) {

        } else {
            System.out.println("Bölüm gir");
            String bolum = scan.next();
            System.out.println("Sicil no gir");
            String sicilNo = scan.next();

            Ogretmen ogretmen = new Ogretmen(adSoyad, kimlikNo, yas, bolum, sicilNo);
            ogrtmnList.add(ogretmen);
            System.out.println(ogrtmnList);
        }
    }
}