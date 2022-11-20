public class Daire {
    double yaricap;
    public Daire(double yaricap) {
        setYaricap(yaricap);
    }
    public double getYaricap() {
        return yaricap;
    }
    public void setYaricap(double yaricap) {
        if (yaricap < 0) {
            this.yaricap = 0;

        } else {
            this.yaricap = yaricap;
        }
    }
    public double getAlan() {
        return yaricap * yaricap * Math.PI;
    }
}