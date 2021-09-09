package chapterThree;

public class
Account {
    private int balance;


    public void deposit(int amountToDeposit) {
        if(amountToDeposit > 0)
        balance = balance + amountToDeposit;



    }

    public int getBalance() {
        return balance;


    }

    public void withdraw(int amountToWithdraw, int pin ){
        if(amountToWithdraw <= balance && pin == 1234) {
            balance = balance - amountToWithdraw;
        }

    }
}
