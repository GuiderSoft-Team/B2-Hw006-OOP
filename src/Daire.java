public class Daire {
    private double yaricap=0;

    public Daire(double yaricap) {
       setYaricap(yaricap);
    }

    public Daire() {
    }

    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        if (yaricap<0) return;
        this.yaricap = yaricap;
    }
    public double getAlan(){
        return (Math.PI*yaricap*yaricap);
    }
    public void showAlan(){
        System.out.printf("Daire Alan: %5.2f",getAlan());
    }
}
