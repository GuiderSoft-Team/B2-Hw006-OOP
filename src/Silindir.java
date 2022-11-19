public class Silindir extends Daire{
    private double yukseklik;
    private double yaricap;

    public Silindir() {

    }

    public Silindir( double yaricap,double yukseklik) {
        super(yaricap);
        if(yukseklik<0){
            this.yukseklik =0;
        }else{
            this.yukseklik=yukseklik;
        }
        if (yaricap<0)
            this.yaricap=0;
        else this.yaricap=yaricap;
    }

    @Override
    public double getYaricap() {
        return yaricap;
    }

    public double getYukseklik() {

        return yukseklik;
    }
    public double getHacim(){
      return   super.getAlan()*yukseklik;
    }

    @Override
    public double getAlan() {
        return (2 * yaricap * yaricap * Math.PI + 2 * Math.PI * yaricap * yukseklik);
    }
}




