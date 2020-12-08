import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountImplTest {
    private static final String SAVING_ACCOUNT = "saving";
    private static final String CHECKING_ACCOUNT = "checking";

    @Test
    void depositPositiveAmount() {
        Account acc1 = new AccountImpl("SVE01", SAVING_ACCOUNT,0);
        acc1.deposit(5);
        double expected_value = 5;
        double actual_value = acc1.getBalance();
        assertEquals(expected_value,actual_value);
    }

    @Test
    void depositNegativeAmount() {
        Account acc1 = new AccountImpl("SVE01", SAVING_ACCOUNT,0);
        acc1.deposit(-5);
        double expected_value = 0;
        double actual_value = acc1.getBalance();
        assertEquals(expected_value,actual_value);
    }

    @Test
    void withdrawNotAccepted() {
        Account acc1 = new AccountImpl("SVE01", SAVING_ACCOUNT,10);
        acc1.withdraw(100);
        double expected_value = 10;
        double actual_value = acc1.getBalance();
        assertEquals(expected_value,actual_value);
    }

    @Test
    void withdrawAccepted() {
        Account acc1 = new AccountImpl("SVE01", SAVING_ACCOUNT,100);
        acc1.withdraw(5);
        double expected_value = 95;
        double actual_value = acc1.getBalance();
        assertEquals(expected_value,actual_value);
    }

    @Test
    void getBalanceInit() {
        Account acc1 = new AccountImpl("SVE01", SAVING_ACCOUNT,0);
        double expected_value = 0;
        double actual_value = acc1.getBalance();
        assertEquals(expected_value,actual_value);
    }

    @Test
    void getBalanceAfterDeposit() {
        Account acc1 = new AccountImpl("SVE01", SAVING_ACCOUNT,0);
        acc1.deposit(10);
        double expected_value = 10;
        double actual_value = acc1.getBalance();
        assertEquals(expected_value,actual_value);
    }

    @Test
    void getBalanceAfterWdrow() {
        Account acc1 = new AccountImpl("SVE01", SAVING_ACCOUNT,100);
        acc1.withdraw(10);
        double expected_value = 90;
        double actual_value = acc1.getBalance();
        assertEquals(expected_value,actual_value);
    }
}