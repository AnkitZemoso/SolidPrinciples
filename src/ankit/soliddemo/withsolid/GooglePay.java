package ankit.soliddemo.withsolid;

public class GooglePay implements UPIPayments, CashBackManager {

    public void payMoney() {
        System.out.println("Paying Money from GooglePay.");
    }

    public void getScratchCard() {

        System.out.println("Getting scratch card from GooglePay.");
    }

    public void getCashBackAsCreditBalance() {
      //this features is there in gpay
        System.out.println("Getting Cashback from GooglePay.");
    }
}
