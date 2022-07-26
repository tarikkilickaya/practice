package day10_practice.okul_proje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Giris {
    /*
     * ogretmen bilgilerini kullanicidan aliniz
     * aldiginiz bilgilerrden object ureterek yeni
     * ogretmenler olusturun ve bilgilerini yazdirin
     * ogretmen bilgilerini kullanicidan aliniz
     * aldiginiz bilgilerrden object ureterek yeni
     * ogretmenler olusturun ve bilgilerini yazdirin
     */

    public static void main(String[] args) {
        System.out.println("Hoş geldi okulumuza");
        System.out.println("İsim gir");
        Scanner scan = new Scanner(System.in);
        String isim = scan.nextLine();
        System.out.println("Soyisim gir");
        String soyIsim = scan.nextLine();
        System.out.println("Yaş gir");
        int yas = scan.nextInt();
        System.out.println("Branş gir");
        String brans = scan.next();

        System.out.println("Telefon gir");
        String tel = scan.next();

        OgretmenBilgileri adayOgretmen = new OgretmenBilgileri(isim,soyIsim,yas,brans,tel);

        List<OgretmenBilgileri> ogretmenList = new ArrayList<>();
        ogretmenList.add(adayOgretmen);

        System.out.println("ogretmenList = " + ogretmenList);

    }
}