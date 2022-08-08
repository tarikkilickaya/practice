package day13_interviewQuestions;

import java.util.Scanner;

public class Q01_ArmstrongSayi {
    public static void main(String[] args) {

        /*  soru1: Check if the integer is an Armstrong numbers to 4 digit
            numbers(4 digit-> exclusive)
            Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri
            toplami o sayiyi veriyorsa sayi  Armstrong sayidir
            (0, 1, 153, 370, 371, 407)
            153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
            370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
            method create ediniz
            parametre sayı alsın
            sayıların kupToplami ataması
            girilen sayı conteiner
            if içinde kontrol ediniz
            % kullanınız
            basamaktakiSayi boş variable oluştur

      soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının
      amstrong sayı olup olmadıgını
      gösteren program yazınız */

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int sayi = scan.nextInt();
        armstrong(sayi);
        girilenSayiyaKadarOlanArmstrongSayilar(sayi);
    }

    private static void girilenSayiyaKadarOlanArmstrongSayilar(int sayi) {
        for (int i = 1; i <= sayi; i++) {
            armstrong(i);
        }
    }

    public static void armstrong(int sayi) {
        int sayininKuplerToplami = 0;
        int basamaktakiSayi = 0;
        int girilenSayi = sayi;

        while (sayi > 0) {
            basamaktakiSayi = sayi % 10;
            sayininKuplerToplami += (basamaktakiSayi * basamaktakiSayi * basamaktakiSayi);
            sayi = sayi / 10;
        }
        if (girilenSayi == sayininKuplerToplami) {
            System.out.println(girilenSayi + " armstrong sayıdır");
        } else {
            System.out.println(girilenSayi + " armstrong değildir");
        }
    }
}