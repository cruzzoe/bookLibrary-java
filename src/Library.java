
// Class to represent Library and its associated management
import java.util.ArrayList;
import java.util.List;

public class Library{

    private List<Book> libraryItems = new ArrayList<>();
    private List<User> libraryUsers = new ArrayList<>();
    private int nextBookID = 1;
    private int nextUserID = 1;

    public void addBook(Book book){
        book.setID(nextBookID);
        nextBookID++;
        libraryItems.add(book);
    }

    public void addUser(User user){
        user.setUserID(nextUserID);
        nextUserID++;
        libraryUsers.add(user);
    }

    public void loadBooks(){
        System.out.println("Loading books to library");
        addBook(new Manga("One Piece"));
        addBook(new Manga("Death Note"));
        addBook(new Manga("Attack on Titan"));
        addBook(new Textbook("We love Maths!"));
        addBook(new Poetry("Sonnets"));

        System.out.println("Books added.");
    }

    public void loadUsers(){
        System.out.println("Loading Users to library...");
        addUser(new StandardUser("Keanu Reeves"));
        addUser(new StandardUser("Bill Gates"));
        addUser(new StandardUser("Steve Jobs"));
        System.out.println("Users added.");
    }

    public void borrowBooks(){
        Book b1 = libraryItems.get(2);
        User u1 = libraryUsers.get(1); 
        borrow(b1, u1);
        // attempt to borrow a restricted book
        Book tb1 = libraryItems.get(3);
        borrow(tb1, u1);
        Book poems =  libraryItems.get(4);
        borrow(poems, u1);
    } 

    public void returnBooks(){
        Book b1 = libraryItems.get(2);
        returnBook(b1);

        //attempt to return a book that has already been returned
        returnBook(b1);
    }

    public void printBooks(){
        System.out.println("-----");
        for (Book book:libraryItems){
            if (!book.isAvailable()){
                System.out.println(book.getID()+ "--:--" + book.getName() + "--:--" + book.status() + "--:-- Loan due on: " + book.loan.getDueDate());
            }
            else{
                System.out.println(book.getID()+ "--:--" + book.getName() + "--:--" + book.status());
            }
        }
        System.out.println("-----");
    }

    public void borrow(Book book, User user){
        System.out.println("Attempting to borrow book: '" + book.getName() + "'");
        if (book instanceof Lendable) {
            if (book.isAvailable()){
                Lendable lendable = (Lendable) book;
                lendable.borrow(user);
                System.out.println("Book: '"+ book.getName() + "' has been borrowed by user: " + user.getName());
            }
            else{
                System.out.println("Book: '" + book.getName() + "' is unavailable. No action taken!");
            }
        }
        else {
            System.out.println("Book: '"+ book.getName() + "' is not available for lending - this is a reference only book.");
        }
    }

    public void returnBook(Book book){
        System.out.println("Attempting to return book: '" + book.getName() + "'");

        if (book instanceof Lendable) {

            if (book.isAvailable()){
                System.out.println("ERROR - Book: '"+ book.getName() + "' has already been returned!");
            }
            else{
                Lendable lendable = (Lendable) book;
                lendable.returnToLibrary();
                System.out.println("Book: '" + book.getName() + "' has been returned");
            }

        }
        else {
            System.out.println("Book: '"+ book.getName() + "' is not available for lending - this is a reference only book.");
        }
    }
}
        
