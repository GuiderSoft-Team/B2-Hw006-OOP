public class MainApp {
    public static void main(String[] args) {
        System.out.println("Daire...");
        Daire daire = new Daire(3.75);
        System.out.println("Yarıçap= " +daire.getYaricap());
        daire.showAlan();
        System.out.println("");
        System.out.println("Silindir...");
        Silindir silindir = new Silindir(5.55, 7.25);
        System.out.println("Yarıçap= " + silindir.getYaricap());
        System.out.println("Yükseklik= " + silindir.getYukseklik());
        silindir.showAlan();
        silindir.showHacim();
    }
}
