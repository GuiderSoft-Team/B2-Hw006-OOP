public class Silindir extends Daire{
    private double yukseklik;

    public Silindir(double yaricap, double yukseklik) {
        super(yaricap);
        setYukseklik(yukseklik);
    }

    public double getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(double yukseklik) {
        if (yukseklik>0) {
            this.yukseklik = yukseklik;
        }else {
            this.yukseklik=0;
        }
    }
    public double getHacim(){
        return super.getAlan()*getYukseklik();
    }

    @Override
    public double getAlan() {
        return (2*getYaricap()*getYaricap()*Math.PI)+(2*Math.PI*getYaricap()*getYukseklik());
    }

    @Override
    public String toString() {
        return super.toString()+"yükseklik : "+yukseklik;
    }
}
