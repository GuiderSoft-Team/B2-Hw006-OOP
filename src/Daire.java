public class Daire {
    private double yariCap;

    public Daire(double yariCap) {
        setYariCap(yariCap);
    }

    public double getYariCap() {

        return yariCap;
    }

    public void setYariCap(double yariCap) {
        if (yariCap>0){
            this.yariCap = yariCap;
        }else {
            this.yariCap=0;
        }

    }

    public double getAlan(){
        return Math.round(yariCap*yariCap*Math.PI*100)/100.0;
    }


}
