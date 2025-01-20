public class Exa implements Iexample {
    @Override
    public void giris() {
        System.out.println("Giris yapildi !");
    }

    @Override
    public void cixis() {
        System.out.println("Cixis yapildi !");
    }

    @Override
    public void yemek() {
        System.out.println("Yemek yendi !");
    }
    public void run(){
        System.out.println(this.okul);
    }
}
