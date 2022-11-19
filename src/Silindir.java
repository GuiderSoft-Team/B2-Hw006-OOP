public class Silindir extends Daire{
    private double yukseklik;

    public Silindir() {
    }

    public Silindir(double yukseklik) {
        if (yukseklik>0) {
            this.yukseklik = yukseklik;
        }else {
            this.yukseklik=0;
        }
    }

    public Silindir(double yaricap, double yukseklik) {
        super(yaricap);
        this.yukseklik = yukseklik;
    }

    public double getYukseklik(){
        return yukseklik;
    }
    public double getHacim(){
        return yukseklik*(getYaricap()*getYaricap()*Math.PI);
    }

    @Override
    public double getAlan() {
        return (2*getYaricap()*getYaricap()*Math.PI+2*Math.PI*getYaricap()*yukseklik);
    }
}
