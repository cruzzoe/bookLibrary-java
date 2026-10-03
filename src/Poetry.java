

public class Poetry extends Book implements Lendable {
    
    private int loanLength = 3;

    public Poetry(String name){
        super(name);
    }

    @Override
    public void borrow(User user){
        Loan newLoan = new Loan(user, loanLength);
        this.loan = newLoan;
        System.out.println("Book borrowed by user: " + user.getName());
    }

    @Override
    public void returnToLibrary(){
        this.loan = null;
        System.out.println("Book returned");
    }
}
