
public class Textbook extends Book {
    
    public Textbook(String name){
        super(name);
    }

    @Override
    public String getStatusDescription() {
      return "REFERENCE ONLY";
    }

}
