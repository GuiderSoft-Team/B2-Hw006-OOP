public class Silindir extends Daire {
    private double yukseklik;

    public Silindir(double yariCap, double yukseklik) {
        super(yariCap);
        setYukseklik(yukseklik);

    }

    public double getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(double yukseklik) {
        if (yukseklik < 0) {
            this.yukseklik = 0;

        } else {
            this.yukseklik = yukseklik;
        }

    }
    public double getHacim(){
        return Math.round(super.getAlan()*yukseklik*100)/100.0;
    }

    @Override
    public double getAlan() {
        return Math.round((2*super.getAlan()+2*Math.PI*getYariCap()*yukseklik)*100)/100.0;
    }
}