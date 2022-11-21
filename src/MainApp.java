public class MainApp {
    public static void main(String[] args) {

        Daire d1=new Daire(3.75);
        d1.getAlan();

        System.out.println("Yaricap="+d1.getYaricap());
        System.out.println("Alan="+d1.getAlan());

        Silindir s1=new Silindir(5.55,7.25);
        System.out.println("Yaricap="+s1.getYaricap());
        System.out.println("Yukselık="+s1.getYukseklik());
        System.out.println("Alan="+s1.getAlan());
        System.out.println("Hacim="+s1.getHacim());


    }
}