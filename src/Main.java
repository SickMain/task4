import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    static int wordCount(String path) throws FileNotFoundException{
        int words = 0;
        File file = new File(path);
        Scanner in = new Scanner(file);
        while (in.hasNext()) {
            String next = in.next();
            words++;
        }
        in.close();

        return words;
    }
    public static void main(String[] args) throws IllegalArgumentException {
        if (args.length == 0) throw new IllegalArgumentException("Missing argument");
        try {
            System.out.println(wordCount(args[0]));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

    }
}