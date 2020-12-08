import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    private static final String SAVING_ACCOUNT = "saving";
    private static final String CHECKING_ACCOUNT = "checking";

    @Test
    void checkTotalBalanceOfClient() {
        Client client1 = new Client("01", "Jimy", "Fallon",0611,40,"USA");

        Account newAcc1 = new AccountImpl("SVE01", SAVING_ACCOUNT,10);
        Account newAcc2 = new AccountImpl("SVE02", CHECKING_ACCOUNT,20);
        client1.addAccount(newAcc1);
        client1.addAccount(newAcc2);

        double expected_value = 30;
        double actual_value = client1.showTotalBalance();
        assertEquals(expected_value,actual_value);
    }

    @Test
    void getNumberOfClients() {
        Client client1 = new Client("01", "Jimy", "Fallon",0611,40,"USA");
        Client.addClient(client1);
        int expected_value = 1;
        int actual_value = Client.getNumberOfClients();
        assertEquals(expected_value,actual_value);
    }

    @Test
    void checkNumberOfClientAccounts() {
        Client client1 = new Client("01", "Jimy", "Fallon",0611,40,"USA");

        Account newAcc1 = new AccountImpl("SVE01", SAVING_ACCOUNT,0);
        Account newAcc2 = new AccountImpl("SVE02", CHECKING_ACCOUNT,0);
        client1.addAccount(newAcc1);
        client1.addAccount(newAcc2);

        double expected_value = 2;
        double actual_value = client1.getAccounts().size();
        assertEquals(expected_value,actual_value);
    }

    @Test
    void removeClientAccount1() {
        Client client1 = new Client("01", "Jimy", "Fallon",0611,40,"USA");

        Account newAcc1 = new AccountImpl("SVE01", SAVING_ACCOUNT,0);
        Account newAcc2 = new AccountImpl("SVE02", CHECKING_ACCOUNT,0);
        client1.addAccount(newAcc1);
        client1.addAccount(newAcc2);

        client1.removeAccount("SVE01");
        double expected_value = 1;
        double actual_value = client1.getAccounts().size();
        assertEquals(expected_value,actual_value);
    }

    @Test
    void removeClientAccount2() {
        Client client1 = new Client("01", "Jimy", "Fallon",0611,40,"USA");

        client1.removeAccount("SVE01");
        double expected_value = 0;
        double actual_value = client1.getAccounts().size();
        assertEquals(expected_value,actual_value);
    }

    @Test
    void showClient() {
        Client client1 = new Client("01", "Jimmy", "Fallon",0611,40,"USA");

        String  expected_value = "Client{" +
                "Id='" + "01" + '\'' +
                ", firstName='" + "Jimmy" + '\'' +
                ", lastName='" + "Fallon" + '\'' +
                ", phone=" + 0611 +
                ", age=" + 40 +
                ", address='" + "USA" + '\'' +
                '}';
        assertEquals(expected_value,client1.toString());
    }
}