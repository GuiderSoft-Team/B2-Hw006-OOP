public class Daire {
    private double yaricap;

    public Daire(double yaricap) {
        setYaricap(yaricap);
    }

    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        if(yaricap<0) yaricap=0;
        this.yaricap = yaricap;
    }

    public double getAlan(){
        return Math.PI*Math.pow(yaricap,2);
    }
}
