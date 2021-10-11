package ankit.SolidDemo.WithoutSolid;



public class Paytm implements  UPIPayments {


    @Override
    public void payMoney() {

    }

    @Override
    public void getScratchCard() {

    }
    // paytm doesnot use this So it voilates both Liskov Substitution and Interface segregation principle.
    @Override
    public void getCashBackAsCreditBalance() {

    }
}
