package ankit.soliddemo.withsolid;

public class WithSolid {
    public static void main(String[] args) {
        System.out.println("This follows Single responsibility Principle.");
        PrinterService printerService=new PrinterService();
        printerService.printPassbook();

        System.out.println("This follows open-closed Principle.");
        NotificationService notificationService=new WhatsAppNotificationService();
        notificationService.sendNotification();

        System.out.println("This follows Liskov-substitution Principle.");
        System.out.println("This follows Interface Segregation Principle.");
        UPIPayments upiPayments=new GooglePay();
        UPIPayments paytm=new Paytm();
        paytm.getScratchCard();
        upiPayments.getScratchCard();

        System.out.println("This follows Dependency inversion Principle.");

        BankCard bankCard=new CreditCard();
        ShoppingMall shoppingMall=new ShoppingMall(bankCard);
        shoppingMall.doPurchaseSomething(5000);


    }
}
