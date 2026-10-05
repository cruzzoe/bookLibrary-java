

public class Manga extends LendableBook {
    
    private int loanLength = 7;

    public Manga(String name){
        super(name);
    }

    @Override
    public int getLoanLength() {
        return loanLength;
    }

}
