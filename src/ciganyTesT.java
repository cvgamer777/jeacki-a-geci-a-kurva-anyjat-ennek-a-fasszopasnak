import org.junit.Test;

import java.io.FileNotFoundException;

public class ciganyTesT {
    @Test
    public  void testCigany() throws FileNotFoundException {
        ciganyService service0 = new ciganyService();
        ciganyService service = new ciganyService("files/jackie");
        System.out.println("3.feladat" + service.getLinesLenght());
    }

}
