package day7_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Q05_ArrayList {
    public static void main(String[] args) {
        /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
         *  1. Kullanicidan ismini isteyelim
         *  2. Kullanici adindaki bosluklari silelim.
         *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
         *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
         *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.
         */

        List<String> databaseIsimler = new ArrayList<>();
        databaseIsimler.add("Enes");
        databaseIsimler.add("İsmail");
        databaseIsimler.add("AbdulBaki");
        databaseIsimler.add("Emre");
        databaseIsimler.add("Melisa");
        databaseIsimler.add("Oğuz");
        System.out.println("databaseIsimler = " + databaseIsimler);

        Scanner scan = new Scanner(System.in);
        System.out.print("Kullanmak istediğiniz username'i giriniz : ");
        String username = scan.nextLine().trim();

        boolean usernameVarmi = databaseIsimler.contains(username);

        if (usernameVarmi){
            System.out.println("Bu kullanıcı adı alınmış");
        } else System.out.println("Bu kullanıcı adını kullanabilirsiniz");

        if (usernameVarmi) {
            int randomSayi = new Random().nextInt(100);
            username += randomSayi;
            System.out.println("Yeni kullanıcı adınız : " + username);
            databaseIsimler.add(username);
            System.out.println("databaseIsimler = " + databaseIsimler);
        } else System.out.println("Yeni kullanıcı adınız : " + username);
    }
}