public class Silindir extends Daire{
    double yukseklik=0;

    public Silindir(double yaricap, double yukseklik) {
        super(yaricap);
       setYukseklik(yukseklik);
    }

    public Silindir() {
    }

    public double getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(double yukseklik) {
        if (yukseklik<0) return;
        this.yukseklik = yukseklik;
    }
    public double getHacim(){
        return (Math.PI*getYaricap()*getYaricap()*yukseklik);
    }
    public void showHacim(){
        System.out.printf("Silindir Hacim: %5.2f\n",getHacim());
    }

    @Override
    public double getAlan() {
        return 2*getYaricap()*getYaricap()*Math.PI+2*Math.PI*getYaricap()*yukseklik;
    }
    public void showAlan(){
        System.out.printf("Silindir Alan: %5.2f\n",getAlan());
    }
}
