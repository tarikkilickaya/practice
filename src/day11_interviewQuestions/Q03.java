package day11_interviewQuestions;

import java.util.Scanner;

public class Q03 {
    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
    // bunu kart sifre kontrol de de kullabilirinisz

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sifre = "erdal.bey123";
        int girisSayisi = 3;

        while (true) {
            System.out.print("Şifre gir : ");
            String girilenSifre = scan.nextLine();
            if (sifre.equals(girilenSifre)) {
                System.out.println("Şifre başarılı");
                break;
            } else {
                System.out.println("Şifre yanlış");
                girisSayisi--;
                System.out.println("Kalan giriş hakkın : " + girisSayisi);
                }
            if (girisSayisi == 0) {
                System.out.println("Giriş hakkın kalmadı kart bloke " + girisSayisi);
                break;
            }
        }
    }
}