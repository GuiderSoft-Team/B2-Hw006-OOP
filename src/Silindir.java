public class Silindir extends Daire{
    public double yukseklik;

    public Silindir(double yukseklik) {
        this.yukseklik = yukseklik;
    }

    public Silindir(double yariCap, double yukseklik) {
        super(yariCap);
        if(yukseklik<0){
            this.yukseklik =0;
        }else{
        this.yukseklik = yukseklik;
        }
    }

    public double getYukseklik() {
        return yukseklik;
    }

    public double getHacim() {
        return super.getAlan()*yukseklik;
    }

    @Override
    public double getAlan(){
        return 2*super.getAlan()+2*Math.PI*yariCap*yukseklik;
    }




}
