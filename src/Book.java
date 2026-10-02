
public abstract class Book {
    
    private String name;
    private int bookID;
    protected User borrower;

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

