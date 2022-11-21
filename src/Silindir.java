public class Silindir extends Daire{

    public double yukseklik;

    public Silindir() {
    }

    public Silindir(double yaricap, double yukseklik) {
        super(yaricap);
        this.yukseklik = yukseklik;
    }

    public double getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(double yukseklik) {
        if (yukseklik<0){
            this.yukseklik=0;
        }else {
            this.yukseklik = yukseklik;
        }
    }



    public double getHacim(){

        return super.getAlan()*yukseklik;
    }

    @Override
    public double getAlan() {

        return 2*yaricap*yaricap*Math.PI+2*Math.PI*yaricap*yukseklik;
    }
}

