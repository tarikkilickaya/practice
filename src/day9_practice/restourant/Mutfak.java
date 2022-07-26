package day9_practice.restourant;

public class Mutfak {

    public String yemekler = "adanakebap, urfaciğer, kuşbaşı, küşleme";
    public String araSicak = "yaylacorba, mercimekcorba, düğüncorbası, corba";
    public String tatlilar = "baklava, sütlaç, güllaç, künefe";
    public String icecekler = "ayran, şalgam, kola";

    public Mutfak(String yemekler, String araSicak, String tatlilar, String icecekler) {
        this.yemekler = yemekler;
        this.araSicak = araSicak;
        this.tatlilar = tatlilar;
        this.icecekler = icecekler;
    }

    public Mutfak() {
        this("adanakebap", "mercimekcorba","künefe","şalgam");
    }

    @Override
    public String toString() {
        return "Mutfak{" +
                "\nyemekler='" + yemekler + '\'' +
                ", \naraSicak='" + araSicak + '\'' +
                ",  \ntatlilar='" + tatlilar + '\'' +
                ", \nicecekler='" + icecekler + '\'' +
                '}';
    }
}