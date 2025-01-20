public class OgretimUyesi extends Akademisyen{
    String unvan;
    public OgretimUyesi(String adSoyad, String eposta, String telefon, String bolum, String gorevler, String dersler,String unvan) {
        super(adSoyad, eposta, telefon, bolum, gorevler, dersler);
        this.unvan = unvan;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    @Override
    public void dersegir() {
        System.out.println(getUnvan() + " " + getAdSoyad() + " " + getDersler() + " dersine girdi ! ");
    }
}
