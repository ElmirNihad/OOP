public class Asistan extends Akademisyen{
    public Asistan(String adSoyad, String eposta, String telefon, String bolum, String gorevler, String dersler) {
        super(adSoyad, eposta, telefon, bolum, gorevler, dersler);
    }



    @Override
    public void dersegir() {
        System.out.println(getAdSoyad() + " " + getDersler() + " " + " dersine girdi ! ");
    }
}
