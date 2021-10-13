package ankit.soliddemo.withoutsolid;

public class BankService {
    public long deposit(long amount, String accountNo) {
        //deposit amount
        return 0;
    }

    public long withDraw(long amount, String accountNo) {
        //withdraw amount
        return 0;
    }
// Here it is having 2 functionality which voilates single responsibility principle.
    public void printPassbook() {
        System.out.println("Print passBook.");
    }
}
