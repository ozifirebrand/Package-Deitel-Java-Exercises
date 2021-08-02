package chapter3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AccountTest {

    @Test
    public void testThatNameCanBeSet(){
        Account theAccount = new Account();
        theAccount.setAccountName("Lucky", "Bolanle");
        Assertions.assertEquals("LuckyBolanle", theAccount.getAccountName());

    }
    @Test
    public void testBalanceIsSet(){
        Account theAccount = new Account();
        theAccount.setAccountName("Jaiyeola", "Laide");
        theAccount.getAccountName();
        theAccount.setBalance(400);
        Assertions.assertEquals(400, theAccount.getBalanceInAccount());

    }

    @Test
    public void testThatWeCanWithdraw(){
        Account theAccount = new Account();
        theAccount.setBalance(500);
        theAccount.withdraw(200);
        Assertions.assertEquals(300, theAccount.getBalanceInAccount());
    }

    @Test
    public void testThatWeCanDeposit(){
        Account theAccount = new Account();
        theAccount.setBalance(670);
        theAccount.depositMoney(130);
        Assertions.assertEquals(800, theAccount.getBalanceInAccount());
    }
    @Test
    public void testThatBalanceMustBeMoreThan10Dollars(){
        Account theAccount = new Account();
        theAccount.setBalance(5400);
        theAccount.withdraw(5500);
        Assertions.assertEquals(5400 , theAccount.getBalanceInAccount() );
    }

    @Test
    public void testThatBalanceIsAlwaysWithin500k(){
        Account theAccount = new Account();
        theAccount.setBalance(450000);
        theAccount.depositMoney(51000);
        Assertions.assertEquals(450000, theAccount.getBalanceInAccount());
    }
}