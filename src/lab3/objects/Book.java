package lab3.objects;
public class Book {
    //these are fields also called attributes, they store all the data variables of an object
    //you want them to be private
    private String title; //private can only be accessed inside the Book object, cannot use or change it outside the object
    private String author;
    private boolean isBorrowed;

    //constructor method, sets the values depending on parameters, there can be many constructor method depending on parameters
    public Book(){ //its good to have a constructor that doesn't take parameters, it's a default one
        this.title="Title unknown";
        this.author="Author unknown";
        isBorrowed=false;
    }
    public Book(String title, String author){
        this.title=title;
        this.author=author;
        isBorrowed=false; //no need to use this. when no naming conflicts
    }

    //this is a setter method, it changes a private field
    public void borrowBook(){
        isBorrowed=true;
    }

    //this is a setter method, it changes a private field
    public void returnBook(){
        isBorrowed=false;
    }

    //this is a getter method, it returns a private field
    public boolean isBookBorrowed(){
        return isBorrowed;
    }

    //this is a private method it can only be called inside an object, it is like a helper method to return public methods
    private String generateInfo() {
        return this.title + " - " + this.author;
    }
    //this is a getter method, it returns private fields
    public String getInfo(){
        return this.generateInfo();
    }
}
