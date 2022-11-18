
public class MainApp {
    public static void main(String[] args) {

        try {
            Daire daire = new Daire(3.75);
            System.out.println(daire);
        } catch (LengthException e) {
            System.err.println(e.getMessage());
        }


        try {
            Silindir silindir = new Silindir(5.55, 7.25);
            System.out.println(silindir);
        } catch (LengthException e) {
            System.err.println(e.getMessage());
        }

    }
}
