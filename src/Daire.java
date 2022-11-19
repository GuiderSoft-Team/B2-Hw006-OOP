public class Daire {

    private double yaricap;


    public Daire(double yaricap) {
        if (yaricap < 0) yaricap = 0;
        this.yaricap = yaricap;
    }


    public double getYaricap() {
        return yaricap;
    }

    public double getAlan() {
        return Math.PI * yaricap * yaricap;
    }


}
