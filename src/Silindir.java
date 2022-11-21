public class Silindir extends Daire{

    private double yukseklik;
    public double yaricap;

    public Silindir(){

    }

    public Silindir(double yukseklik,double yaricap){
        this.yukseklik=yukseklik;
        this.yaricap=yaricap;
    }

    public double getYukseklik(){return yukseklik;}

    @Override
    public double getYaricap(){
        return yaricap;
    }

    @Override
    public void setYaricap(double yaricap){
        this.yaricap=yaricap;
    }

      public void setYukseklik(double yukseklik){
        if (yukseklik>0){
            this.yukseklik=yukseklik;
        }else
            this.yukseklik=0;
      }

         public double getHacim() {
        return yukseklik*getAlan();
         }
      @Override
    public double getAlan(){
        return (2*yaricap*yaricap*Math.PI+2*Math.PI*yaricap*yukseklik);
      }



}
