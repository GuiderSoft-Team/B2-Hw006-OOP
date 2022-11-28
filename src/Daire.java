public class Daire {
    private double yaricap;

    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        if (yaricap<0){
            yaricap=0;
        }
        this.yaricap = yaricap;
    }

    public Daire(double yaricap) {
        this.yaricap = yaricap;


    }
    public double getAlan(){
        return Math.PI*Math.pow(yaricap,2);
    }
}
