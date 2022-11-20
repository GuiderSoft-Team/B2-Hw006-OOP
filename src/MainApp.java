public class MainApp {
    public static void main(String[] args) {
        System.out.println("Daire...");
        Daire daire=new Daire(3.75);
        System.out.println("Yarı Çap= "+daire.getYariCap());

        System.out.printf("%s %.2f","Alan = " ,daire.getAlan());
        System.out.println("");
        System.out.println("Silindir...");
        Silindir silindir=new Silindir(5.55,7.25);
        System.out.println("Yarı Çap= "+silindir.getYariCap());
        System.out.println("Yükseklik= " +silindir.getYukseklik() );
        System.out.printf("%s %.2f","Alan = ",silindir.getAlan());
        System.out.println();
        System.out.printf("%s %.2f","Hacim = " ,silindir.getHacim());


    }


}
