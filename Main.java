
public class Main {
    public static void main(String[] args) {
        Calisan c = new Calisan("Ahmet","A@gmail.com","0777777777");
        //Akademisyen a =new Akademisyen("Mehmet","A@gmail.com","0777777777","Ceng","Hoca","Ceng101");
        //System.out.println(a.giris());
       // System.out.println(c.giris());
        Bilgiİslem b = new Bilgiİslem("Nihad","n@gmail.com","055555555","IT","Tam islem");
        //System.out.println(b.giris());
        OgretimUyesi o = new OgretimUyesi("Elmir","esiracli@gmail.com","0707007","IT","Tam","Bilgisayar","Dosent");
        Asistan as = new Asistan("Elcan","el@gmail.com","000000000","Scinece","King","Physics");
       // System.out.println(o.giris());
        //Calisan d = new Akademisyen("Veli","A@gmail.com","0777777777","Ceng","Hoca","Ceng101");
        //System.out.println(d.giris());
        //Calisan[] girisyapanlar = {a,b,c,d};
        //Calisan.girisyap(girisyapanlar);
        as.dersegir();
        o.dersegir();
        Exa x = new Exa();
        x.giris();
        x.run();
    }
}
