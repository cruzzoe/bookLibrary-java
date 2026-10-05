

public class Poetry extends LendableBook implements Lendable {
    
    private int loanLength = 3;

    public Poetry(String name){
        super(name);
    }
    
    @Override
    public int getLoanLength(){
        return loanLength;
    }
}
