
public abstract class Book {
    
    private String name;
    private int bookID;
    protected User borrower;

    public Book(String name, int bookID){
        this.name = name;
        this.bookID = bookID;
    }

    public String getName(){
        return name;
    }

    public int getID(){
        return bookID;
    }

    public boolean isAvailable(){
        if (borrower !=null){
            return false;
        }    
        else{
            return true;
        }
    }

    public String status(){
        if (isAvailable()){
            return "AVAILABLE";
        }
        else {
            return "NA";
        }
        
    }
}

