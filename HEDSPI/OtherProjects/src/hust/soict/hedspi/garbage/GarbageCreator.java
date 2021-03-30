package hust.soict.hedspi.garbage;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class GarbageCreator {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\sitpr\\IdeaProjects\\HEDSPI\\OtherProjects\\src\\hust\\soict\\hedspi\\garbage\\text");
        Scanner sc = new Scanner(fr);
        String line = "";
        while(sc.hasNext() == true){
            line = sc.nextLine();
            line += sc.nextLine();
        }
        System.out.println(line);
        // Close the file.
        sc.close();
    }
}
