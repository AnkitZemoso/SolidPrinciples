package ankit.SolidDemo.WithSolid;

public class BankService {

    public long deposit(long amount, String accountNo) {
        //deposit amount
        return 0;
    }

    public long withDraw(long amount, String accountNo) {
        //withdraw amount
        return 0;
    }
 // This voilates Single responsibility Principle.
    public void printPassbook() {
        System.out.println("Print passBook.");
    }
}