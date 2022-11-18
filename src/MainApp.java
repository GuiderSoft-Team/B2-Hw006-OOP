public class MainApp {
    public static void main(String[] args) {
        System.out.println("--------------");
        System.out.println("Daire...");
        System.out.println("--------------");
        Daire daire = new Daire(3.75);
        System.out.printf("Yarıçap= %5.2f \n",daire.getYaricap());
        System.out.printf("Alan= %5.2f \n" ,daire.getAlan());
        System.out.println("");
        System.out.println("----------------");
        System.out.println("Silindir...");
        System.out.println("----------------");
        Silindir silindir = new Silindir(5.55, 7.25);
        System.out.println("Yarıçap= " + silindir.getYaricap());
        System.out.println("Yükseklik= " + silindir.getYukseklik());
        System.out.printf("Alan= %5.2f \n", silindir.getAlan());
        System.out.printf("Hacim= %5.2f\n" , silindir.getHacim());

    }
}
