public class Author {
  
 // beginning of empty constructor
    // private String lastName = "Butler";
    // privste genre = "Scifi";
    // private int books = 9;

    // public Author() { 

// }

// end of empty constructor


// beginning of 2 variable constructor

private String lastName;  

private String genre; 

private int books; 

public Author(String lastName, String genre){
    this.lastName = lastName; 
    this.genre = genre; 
    books = 9; 
}

// end of 2 variable constructor 


// beginning of 3 instance variables 

public Author(String lastName, String genre, int books){

    this.lastName = lastName; 
    this.genre = genre; 
    this.books = books; 
}
 

// end of 3 instance variable 


public String getLastName() {
    return this.lastName;
 }
 public String getGenre() {
     return this.genre;
 }
   public int getBooks() {
     return this.books;  
 }

}


