package day9_practice.restourant;

public class Musteri {
    public static void main(String[] args) {

        Mutfak menu = new Mutfak();

        System.out.println("menu.toString() = " + menu.toString());

        Mutfak siparisim = new Mutfak("adanakebap", "mercimekcorba","künefe","şalgam");


        System.out.println(siparisim);


    }
}