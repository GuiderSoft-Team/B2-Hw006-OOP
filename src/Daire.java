public class Daire {

    private double yaricap;

    public Daire(){

    }

    public Daire(double yaricap){
        this.yaricap=yaricap;
    }

    public void setYaricap(double yaricap){
        if (yaricap>0){
            this.yaricap=yaricap;
        }else
            this.yaricap=0;
    }
      public double getYaricap(){
        return yaricap;
      }
      public double getAlan(){
        return (+yaricap*yaricap*Math.PI);
      }
}
