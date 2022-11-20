public class Daire {
    public double yaricap;

    public Daire() {
    }

    public Daire(double yaricap) {
        if(yaricap<0){
        this.yaricap = 0;
    }else {
        this.yaricap=yaricap;
        }
    }

    public double getYaricap() {
        return yaricap;
    }

    public double getAlan (){
        return yaricap*yaricap*Math.PI;
    }
}
