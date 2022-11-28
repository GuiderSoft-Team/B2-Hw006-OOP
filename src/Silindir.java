public class Silindir extends Daire{

    private double yukseklik;

    public Silindir(double yaricap, double yukseklik) {
        super(yaricap);
        this.yukseklik = yukseklik;
    }

    public double getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(double yukseklik) {
        if (yukseklik<0){
            yukseklik=0;
        }
        this.yukseklik = yukseklik;
    }

    public Silindir(double yaricap) {
        super(yaricap);
    }
    public double getHacim(){
        return super.getAlan()*yukseklik;
    }

    @Override
    public double getAlan() {
        return super.getAlan()*2+2*yukseklik*getYaricap()*Math.PI;
    }

}
