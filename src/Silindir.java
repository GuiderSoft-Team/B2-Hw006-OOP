public class Silindir extends Daire{

    private double yukseklik;

    public Silindir(double yukseklik){
        if(yukseklik<0){
            this.yukseklik=0;
            }else{
            this.yukseklik=yukseklik;
        }

    }
    public Silindir(double yaricap,double yukseklik){
        super(yaricap);
        this.yukseklik=yukseklik;
    }

    public double getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(double yukseklik) {
        this.yukseklik = yukseklik;
    }
    public double getHacim(){
        return super.getAlan()*getYukseklik();
    }
    @Override
    public double getAlan(){
        return (2*Math.pow(getYaricap(),2)*Math.PI)+2*Math.PI*getYaricap()*yukseklik;
    }
}
