public class MainApp {
    public static void main(String[] args) {
        System.out.println("Daire...");
        Daire daire = new Daire(3.75);
        System.out.println("Yaricap = "+daire.getYaricap());
        System.out.println("Alan = "+daire.getAlan());
        System.out.println();
        System.out.println("Silindir...");
        Silindir silindir = new Silindir(5.55,7.25);
        System.out.println("Yaricap = "+silindir.getYaricap());
        System.out.println("Yükseklik = "+silindir.getYukseklik());
        System.out.println("Alan = "+silindir.getAlan());
        System.out.println("Hacim = "+silindir.getHacim());

    }
}
