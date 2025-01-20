
public class Calisan {
    String AdSoyad,eposta,telefon;

    Calisan(String adSoyad, String eposta, String telefon) {
        this.AdSoyad = adSoyad;
        this.eposta = eposta;
        this.telefon = telefon;
    }

    public String getAdSoyad() {
        return AdSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        AdSoyad = adSoyad;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String giris(){
        return  this.AdSoyad +" giris yapdi ";
    }

    public static void girisyap(Calisan[] c){
        for(Calisan i : c){
            System.out.println(i.giris());
        }

    }
}