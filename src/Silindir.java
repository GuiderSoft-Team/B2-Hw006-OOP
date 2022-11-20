public class Silindir extends Daire {

    public double yukseklik;

    public Silindir() {
    }

    public Silindir(double yukseklik,double yaricap) {
        if (yukseklik<0){
        this.yukseklik = 0;
        }else {
            this.yukseklik=yukseklik;
        }
        this.yaricap=yaricap;
    }


    @Override
    public double getYaricap() {
        return super.getYaricap();
    }

    private double yaricap() {
        return 0;
    }

    public double getYukseklik() {
        return yukseklik;
    }

    public double getHacim(){
        return super.getAlan()*yukseklik;

    }

    @Override
    public double getAlan() {

        return 2*super.getAlan()+2*Math.PI*yaricap*yukseklik;


    }



}

