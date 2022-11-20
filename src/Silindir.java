public class Silindir extends Daire{
    double yukseklik;

    public Silindir(double yaricap,double yukseklik) {
        super(yaricap);
        setYukseklik(yukseklik);}

    public double getYukseklik() {
        return yukseklik;}
    public void setYukseklik(double yukseklik) {
        if (yukseklik<0){
            this.yukseklik=0;
        }else {
            this.yukseklik=yukseklik;
        }}
    public double getHacim(){
        return (super.getAlan()*yukseklik*100)/100.0;}

    @Override
    public double getAlan() {
        return 2*yaricap*yaricap*Math.PI+2*Math.PI*yaricap*yukseklik;
    }}