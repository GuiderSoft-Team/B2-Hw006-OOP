public class Silindir extends Daire {

    private double yukseklik;


    public Silindir(double yaricap, double yukseklik) {
        super(yaricap);//Ata sınıfın cons. super() ile çağrılır.
        //ilk sırada çalıştırılır.
        if (yukseklik < 0) yukseklik = 0;
        this.yukseklik = yukseklik;
    }

    public double getYukseklik() {
        return yukseklik;
    }

    public double getHacim() {
        return super.getAlan() * yukseklik;
        //Ata sınıfın(Daire) alan metodunu çağırmak için
        //"super" keyword unu kullanıyoruz.
    }

    @Override
    public double getAlan() {
        return (2 * Math.PI * getYaricap() * getYaricap()
                + 2 * Math.PI * getYaricap() * yukseklik);
    }


}
