public class Daire {


 public    double yaricap;

    public Daire( double yaricap) {

            if (yaricap > 0){
                this.yaricap = yaricap;
            }else
                this.yaricap=0;

    }

    public Daire() {

    }


    public  double getYaricap(){
        return this.yaricap;

    }
    public  void  setYaricap(){
        this.yaricap=yaricap;
    }
    public double getAlan(){
        return  yaricap*yaricap*Math.PI;
    }


    }

