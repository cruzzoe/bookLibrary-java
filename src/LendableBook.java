

public abstract class LendableBook extends Book {

    private Loan loan;

    public LendableBook(String name) {
        super(name);
    }

    @Override
    public void borrow(User user){
        if (this.loan != null) {
            throw new IllegalStateException("Book is already borrowed");
        }
        else {
            Loan loan = new Loan(user, getLoanLength());
            this.loan = loan;
        }
    }

    public abstract int getLoanLength();

    @Override
    public void returnToLibrary(){
        if (this.loan != null){
            this.loan = null;
        }
        else {
            throw new IllegalStateException("Book is already in the library so cannot be returned");
        }
    }

    public Loan getLoan() {
        return this.loan;
    }

    public boolean isAvailable(){
        if (loan !=null){
            return false;
        }

        else{
            return true;
        }
    }

    @Override
    public String getStatusDescription() {
        if (loan == null) return "AVAILABLE";
        return "BORROWED, due " + loan.getDueDate();
  }

}
