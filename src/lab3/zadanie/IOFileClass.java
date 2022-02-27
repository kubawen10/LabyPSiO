package lab3.zadanie;

import java.io.*;
import java.util.Scanner;

public class IOFileClass {
    static boolean WriteFile(String content, String path) {
        try {
            //writing to a file
            BufferedWriter writer = new BufferedWriter(new FileWriter(path));
            writer.write(content);
            writer.close();
            return true;
        }
        catch(IOException e){
            return false;
        }
    }

    static String ReadFile(String path){
        File file = new File(path);
        try{
            Scanner scanner = new Scanner(file);
            String output="";
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                output+=line;
            }
            return output;
        }
        catch(FileNotFoundException e){
            System.out.println("file not found");
            return "";
        }

    }
}