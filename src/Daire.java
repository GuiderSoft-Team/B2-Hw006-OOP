public class Daire {

    public double yariCap;

    public Daire() {
    }

    public Daire(double yariCap) {
        if(yariCap<0){
            this.yariCap = 0;
        }else {
            this.yariCap = yariCap;
        }
    }

    public double getYariCap() {
        return yariCap;
    }
    public double getAlan(){
        return Math.PI*yariCap*yariCap;

    }

    public void setYariCap(double yariCap) {
        this.yariCap = yariCap;
    }

}
