public class Daire {
    private double yaricap;


    public Daire() {
    }

    public Daire(double yaricap) throws LengthException {
        setYaricap(yaricap);
    }

    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) throws LengthException {
        if (yaricap <= 0) throw new LengthException("Uzunluk pozitif olmali.");
        this.yaricap = yaricap;
    }

    public double getAlan() {
        return yaricap * yaricap * Math.PI;
    }


    @Override
    public String toString() {
        return String.format("Daire ...\n{ Yaricap = %5.2f, Alan = %5.2f}\n", yaricap, getAlan());
    }
}
