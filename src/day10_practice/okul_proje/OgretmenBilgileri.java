package day10_practice.okul_proje;

public class OgretmenBilgileri {

    String isim;
    String soyIsim;
    int yas;
    String brans;
    String tel;

    public OgretmenBilgileri() {
    }

    public OgretmenBilgileri(String isim, String soyIsim, int yas, String brans, String tel) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.yas = yas;
        this.brans = brans;
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "OgretmenBilgileri{" +
                "isim='" + isim + '\'' +
                ", \nsoyIsim='" + soyIsim + '\'' +
                ", \nyas=" + yas +
                ",  \nbrans='" + brans + '\'' +
                ", \ntel='" + tel + '\'' +
                '}';
    }
}