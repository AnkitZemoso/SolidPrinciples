package ankit.soliddemo.withoutsolid;



public class Paytm implements  UPIPayments {


    @Override
    public void payMoney() {
        System.out.println("Pay Money");
    }

    @Override
    public void getScratchCard() {
        System.out.println("Get Scratch Card.");
    }

    // paytm doesnot use this So it voilates both Liskov Substitution and Interface segregation principle.
    @Override
    public void getCashBackAsCreditBalance() {
        System.out.println("get cashback.");
    }
}
