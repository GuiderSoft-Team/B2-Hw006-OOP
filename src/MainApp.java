public class MainApp {
    public static void main(String[] args) {
        Daire daire = new Daire(3.75);
        System.out.println("Daire...");
        System.out.print("Yarıçap= "+daire.getYaricap()+"\t");
        System.out.printf("Alan= %5.2f ",daire.getAlan());
        System.out.println();
        System.out.println("Silindir...");
        Silindir silindir = new Silindir(5.55, 7.25);
        System.out.printf("Yarıçap= %5.2f", silindir.getYaricap());
        System.out.printf("Yükseklik= %5.2f", silindir.getYukseklik());
        System.out.printf("Alan=%5.2f ",silindir.getAlan());
        System.out.printf("Hacim= %5.2f " , silindir.getHacim());

    }
}
