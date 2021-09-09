package chapterThree;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    @Test
    public void accountCanDeposit() {
        //given
        Account yetundeAccount = new Account();
        //when
        yetundeAccount.deposit(150);
        int yetundeBalance = yetundeAccount.getBalance();
        assertEquals(150, yetundeBalance);
        //the scenerios are basically pre - condition


    }

    @Test
    public void accountCanTakeMoreThanOneDepositTest() {
        //given
        Account yetundeAccount = new Account();
        //when
        yetundeAccount.deposit(120);
        yetundeAccount.deposit(80);
        //check
        int yetundeBalance = yetundeAccount.getBalance();
        assertEquals(200, yetundeBalance);


    }

    @Test
    public void accountCannotTakeNegativeDepositTest() {
        Account jerryAccount = new Account();
        jerryAccount.deposit(2_000);
        jerryAccount.deposit(-1_200);
        int jerryBalance = jerryAccount.getBalance();
        assertEquals(2_000, jerryBalance);
    }


    @Test
    public void accountCanWithdraw() {
        Account femiAccount = new Account();
        femiAccount.deposit(10_000);
        femiAccount.withdraw(3_000, 1234);
        int femiBalance = femiAccount.getBalance();
        assertEquals(7_000, femiBalance);

    }

    //default pin = 1234
    @Test
    public void accoountNeedPinToVerifyPayment() {
        Account femiAccount = new Account();
        femiAccount.deposit(8_000);
        femiAccount.withdraw(3_000, 1236);
        int femiBalance = femiAccount.getBalance();
        assertEquals(8_000, femiBalance);

    }
    @Test
    public void accountCannotPerformOverdrawn(){
        Account femiAccount = new Account();
        femiAccount.deposit(5_000);
        femiAccount.withdraw(7_000, 1234);
        //femiAccount.withdraw(7_000_000, 1234);
        int femiBalance = femiAccount.getBalance();
        assertEquals(5_000, femiBalance);
    }
   // @Test

}



