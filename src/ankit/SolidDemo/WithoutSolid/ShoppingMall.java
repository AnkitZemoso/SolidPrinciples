package ankit.SolidDemo.WithoutSolid;

public class ShoppingMall {

    private DebitCard debitCard;
    // Here we have provided concrete implementation of Debit Card which voilates dependecy inversion principle.
    public ShoppingMall(DebitCard debitCard) {
        this.debitCard = debitCard;
    }

    public void doPurchaseSomething(long amount){
        debitCard.doTransaction(amount);
    }


}
