
// Class to represent Library and its associated management
import java.util.ArrayList;
import java.util.List;

public class Library{

    private List<Book> libraryItems = new ArrayList<>();

    public void loadBooks(){
        System.out.println("Loading books to library");
        Book b1 = new Manga("One Piece", 1);
        Book b2 = new Manga("Death Note", 2);
        Book b3 = new Manga("Attack on Titan", 3);
        Book b4 = new Textbook("We love Maths!", 4);
        libraryItems.add(b1);
        libraryItems.add(b2);
        libraryItems.add(b3);
        libraryItems.add(b4);

        System.out.println("Books added");
    }

    public void borrowBooks(){
        Book b1 = libraryItems.get(2);
        User u1 = new StandardUser(1, "Keanu"); 
        borrow(b1, u1);
        // attempt to borrow the same book twice
        borrow(b1, u1);
        Book tb1 = libraryItems.get(3);
        // attempt to borrow a restricted book
        borrow(tb1, u1);
    } 

    public void printBooks(){
        System.out.println("-----");
        for (Book book:libraryItems){
            System.out.println(book.getID()+ "--:--" + book.getName() + "--:--" + book.status());
        }
        System.out.println("-----");
    }

    public void borrow(Book book, User user){
        if (book instanceof Lendable) {

            if (book.isAvailable()){
                book.borrower = user;
            }
            else{
                System.out.println("Book:" + book.getName() + " is unavailable. No action taken!");
            }
        }
        else {
            System.out.println("Book: "+ book.getName() + "is not available for lending - this is a reference only book.");
        }
    }

}
        
