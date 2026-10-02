

public class Manga extends Book implements Lendable {
    
    public Manga(String name, int bookID){
        super(name, bookID);
    }

    @Override
    public void borrow(User user){
        this.borrower = user;
        System.out.println("Book borrowed by user: " + user.getName());
    }

    @Override
    public void returnToLibrary(){
        this.borrower = null;
        System.out.println("Book returned");
    }
}
