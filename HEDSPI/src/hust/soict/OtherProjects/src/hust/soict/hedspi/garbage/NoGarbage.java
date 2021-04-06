package hust.soict.hedspi.garbage;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class NoGarbage {
    public static void main(String[] args) throws IOException {

        FileReader f = new FileReader("C:\\Users\\sitpr\\IdeaProjects\\HEDSPI\\OtherProjects\\src\\hust\\soict\\hedspi\\garbage\\text.txt");
        Scanner sc = new Scanner(f);
        long start = System.currentTimeMillis();
        StringBuffer line = new StringBuffer();
        while(sc.hasNext()){
            line.append(sc.nextLine());
            line.append("\n");
        }
        System.out.println(line);

        System.out.println(System.currentTimeMillis() - start);
        // Close the file.
        sc.close();
    }
}
