import java.io.FileNotFoundException;



public class Main {
    private static  void debugger() {}
    public static void main(String[] args) throws FileNotFoundException {
        //1. feladat

        ciganyService service = new ciganyService("files/jackie.txt");

        System.out.println("3. feladat " + service.getLinesLenght());

        debugger();
    }
}