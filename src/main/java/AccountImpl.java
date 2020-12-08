import java.util.*;

public class AccountImpl implements Account{
    protected double balance;
    protected String accountId;
    protected String accountName;
    protected Date date;
    protected  double amount;

    public AccountImpl(String accountId, String accountName, double balance) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.balance = balance;
        this.date = new Date();
        this.amount = 0;
    }

    public String getAccountName() {
        return accountName;
    }

    @Override
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @Override
    public void deposit(double amount) {
        if ( amount >= 0 ){
            balance = balance + amount;
        }
    }

    @Override
    public void withdraw(double amount) {
        if ( balance - amount >= 0 ){
            balance = balance - amount;
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "AccountImpl{" +
                "balance=" + balance +
                ", accountId='" + accountId + '\'' +
                ", accountName='" + accountName + '\'' +
                ", date=" + date +
                '}';
    }
}
