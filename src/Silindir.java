public class Silindir extends Daire {
    private double yukseklik;



    public Silindir(double yaricap, double yukseklik) {
        super(yaricap);
        this.yukseklik = yukseklik;
    }

    public double getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(double yukseklik) {
        this.yukseklik = yukseklik;
    }

    public double getHacim() {

        return Math.PI*getYaricap()*getYaricap() * yukseklik;
    }

    @Override
    public double getAlan() {

        return (2 * getYaricap() * getYaricap() * Math.PI) + 2 * Math.PI * getYaricap() * getYukseklik();
    }
    @Override
    public String toString() {
        return String.format("%5.2f  %5.2f  %5.2f 5.2f",getYaricap(),yukseklik,getAlan(),getHacim());
    }
}