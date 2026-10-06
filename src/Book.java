
public abstract class Book {
    
    private String name;
    private int bookID;

    public Book(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getID(){
        return bookID;
    }

    public void setID(int bookID){
        this.bookID = bookID;
    }

    public void borrow(User user) {
        throw new UnsupportedOperationException( "'" + getName() + "' is reference only and cannot be borrowed");
      }

    public void returnToLibrary() {
        throw new UnsupportedOperationException( "'" + getName() + "' is reference only and cannot be returned");
      }

    public abstract String getStatusDescription();

}


