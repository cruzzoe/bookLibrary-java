import java.time.LocalDate;

public class Loan {

    private LocalDate dueDate;
    private LocalDate startDate;
    private User borrower;
    
    public Loan(User borrower, int loanLength){
        this.borrower=borrower;
        this.startDate=LocalDate.now();
        this.dueDate = startDate.plusDays(loanLength);
    }

    public LocalDate getDueDate(){
        return dueDate;
    }

}

