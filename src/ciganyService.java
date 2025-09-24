import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ciganyService {
    int[][]matrix;

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int countLines(String filename) throws FileNotFoundException {
        File fbe = new File(filename);
        Scanner scanner = new Scanner(fbe);
        int result = -1;
        while (scanner.hasNextLine()){
            scanner.nextLine();
            result++;
        }
        return result;
    }

    public  ciganyService(String filename) throws FileNotFoundException {
        int countLines = countLines(filename);
        setMatrix(new int[countLines][6]);
        readFromFile(filename);

    }
    private  void readFromFile (String filename) throws FileNotFoundException {
        File fbe = new File(filename);
        Scanner scanner = new Scanner(fbe);
        int  i = 0;
        scanner.nextLine();
        while (scanner.hasNextLine()) {

            String line = scanner.nextLine();
            String[] split = line.split("\t");
            for (int j=0; j<6;j++) {
                matrix[i][j]=Integer.parseInt(split[j]);
            }
            i++;
        }
    }
    public int getLinesLenght() {
        return getMatrix().length;
    }
}
