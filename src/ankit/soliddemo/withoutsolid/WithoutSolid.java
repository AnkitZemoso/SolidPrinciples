package ankit.soliddemo.withoutsolid;


public class WithoutSolid {
    public static void main(String[] args) {
        BankService bankService=new BankService();
        System.out.println("Here it voilates Single Responsibity Principle");
        bankService.printPassbook();

        System.out.println("Here it voilates open-closed Principle.");
        NotificationService notificationService=new NotificationService();
        notificationService.sendNotification("Phone");

        System.out.println("This voilates Liskov Substitution as well Interface Segregation Principle.");

        UPIPayments upiPayments= new Paytm();

        System.out.println("This voilates dependency Inversion Principle");
        DebitCard debitCard=new DebitCard();
        ShoppingMall shoppingMall=new ShoppingMall(debitCard);
        shoppingMall.doPurchaseSomething(5000);




    }
}
