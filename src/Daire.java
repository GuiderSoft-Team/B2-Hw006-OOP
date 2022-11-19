public class Daire {
        private double yaricap;

        public Daire() {
        }

        public Daire(double yaricap) {
            if (yaricap<0){
                this.yaricap=0;
            }
            else {
                this.yaricap=yaricap;}
        }

        public void setYaricap(double yaricap) {
            this.yaricap = yaricap;
        }

        public double getYaricap(){
            return this.yaricap;
        }

        public double getAlan (){
            return Math.round(Math.PI*Math.pow(yaricap,2));
        }


    }


