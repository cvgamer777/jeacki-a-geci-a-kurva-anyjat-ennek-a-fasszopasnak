import java.io.FileNotFoundException;
import java.util.Scanner;



public class Main {
    private static  void debugger() {}
    public static void main(String[] args) throws FileNotFoundException {
        //1. feladat

        ciganyService service = new ciganyService("files/jackie.txt");
        debugger();
    }
}