public class Silindir extends Daire {
    private double yukseklik;

    public Silindir(double yaricap, double yukseklik) throws LengthException {
        super(yaricap);
        setYukseklik(yukseklik);
    }

    public double getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(double yukseklik) throws LengthException {
        if (yukseklik <= 0) throw new LengthException("Uzunluk pozitif olmali.");
        this.yukseklik = yukseklik;
    }

    public double getHacim() {
        return super.getAlan() * yukseklik;
    }

    @Override
    public double getAlan() {
        return 2 * getYaricap() * getYaricap() * Math.PI + 2 * Math.PI * getYaricap() * yukseklik;
    }

    @Override
    public String toString() {
        return String.format("""
                Silindir ...
                { Yaricap = %5.2f, Yükseklik = %5.2f, Alan = %5.2f, Hacim = %5.2f}
                """, getYaricap(), getYukseklik(), getAlan(), getHacim());
    }
}
