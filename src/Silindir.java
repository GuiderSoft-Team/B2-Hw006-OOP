public class Silindir extends Daire {

    private double yukseklik;

    private double yaricap;

    public Silindir(double yaricap, double yukseklik) {
        super(yaricap);
        this.yukseklik = yukseklik;
        this.yaricap = yaricap;
    }

    public double getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(double yukseklik) {
        if (yukseklik>0){
            this.yukseklik = yukseklik;
        }else
            this.yukseklik=0;

    }

    @Override
    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        this.yaricap = yaricap;
    }
    public double getHacim(){
        return yukseklik*getAlan();
    }

    @Override
    public double getAlan() {


        return  ((2 * yaricap * yaricap * Math.PI + 2 * Math.PI * yaricap * yukseklik));
    }
}

