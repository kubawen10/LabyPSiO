package lab3.objects;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        new Main().run();
    }

    public void run(){
        //bookExample();
        //fileInputExample();
        fileOutputExample();

    }

    public void bookExample(){
        System.out.println("BOOK EXAMPLE");
        //creating a new instance of the Book class
        Book book1 = new Book("Harry Potter", "J.K. Rowling");

        //printing title and author with a getter method
        String info=book1.getInfo();
        System.out.println(info);

        //checking if the book is borrowed with a getter method
        System.out.println(book1.isBookBorrowed());

        //borrowing the book with a setter method, changes the private isBorrowed field
        book1.borrowBook();
        System.out.println(book1.isBookBorrowed());
        //book1.isBorrowed=true;   Java doesn't see th isBorrowed field inside the book instance

        System.out.println("END OF BOOK EXAMPLE");
    }

    public void fileInputExample(){
        File file = new File("src/lab3/objects/dane.txt");
        try{
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("file not found");
        }
    }

    public void fileOutputExample() {
        try {
            //writing to a file
            String str = "Hello";
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/lab3/objects/output-file.txt"));
            writer.write(str);
            writer.close();

            //appending to already existing file
            str = "World";
            writer = new BufferedWriter(new FileWriter("src/lab3/objects/output-file.txt", true));
            writer.append(' ');
            writer.append(str);

            writer.close();


        }
        catch (IOException e){
            System.out.println("IOException");
        }
    }

}
