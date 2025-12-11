package rvt;

public class PaymentCard {
    private double balance;


    public PaymentCard(double initialBalance) {
        this.balance = initialBalance;
    }


    public double balance() {
        return this.balance;
    }


    public boolean pay(double amount) {
        if (amount <= this.balance) {
            this.balance = this.balance - amount;
            return true;
        }
        return false;
    }


    public void addMoney(double amount) {
        if (amount > 0) {
            this.balance = this.balance + amount;
        }
    }


    public String toString() {
        return "The card has " + this.balance + " euros";
    }

    public static void main(String[] args) {
        PaymentCard card = new PaymentCard(10.0);
        System.out.println(card); 

        boolean success = card.pay(2.5);
        System.out.println("Payment success: " + success);
        System.out.println(card);  

        success = card.pay(15.0);
        System.out.println("Payment success: " + success);
        System.out.println(card);  

        card.addMoney(20.0);
        System.out.println(card);  

        card.addMoney(-5.0);
        System.out.println(card);  


        PaymentCard mattCard = new PaymentCard(5.0);
        PaymentCard annaCard = new PaymentCard(15.0);

        annaCard.pay(5.0);   
        mattCard.pay(10.0);  


        System.out.println("Matt: " + mattCard);
        System.out.println("Anna: " + annaCard);
    }
}
