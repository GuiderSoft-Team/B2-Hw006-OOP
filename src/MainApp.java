public class MainApp {
    public static void main(String[] args) {
        Daire daire=new Daire(3.75);
        System.out.println("Daire...");
        System.out.println("Yaricap= "+daire.getYaricap());
        System.out.printf("Alan= %5.2f\n",daire.getAlan());
        System.out.println();
        Silindir silindir=new Silindir(5.55,7.25);
        System.out.println("Silindir...");
        System.out.println("Yaricap= "+silindir.getYaricap());
        System.out.println("Yukseklik= "+silindir.getYukseklik());
        System.out.printf("Alan= %5.2f\n",silindir.getAlan());
        System.out.printf("Hacim= %5.2f",silindir.getHacim());

    }
}
