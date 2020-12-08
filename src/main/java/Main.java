import java.util.*;

public class Main {

    private static final String SAVING_ACCOUNT = "saving";
    private static final String CHECKING_ACCOUNT = "checking";

    public static void main(String[] args) {

        Client client1 = new Client("01", "Jimy", "Fallon",0611,40,"USA");
        Client client2 = new Client("02", "Jhon", "Kedi", 0612, 36, "Paris");

        Account newAcc1 = new AccountImpl("SVE01", SAVING_ACCOUNT,0);
        Account newAcc2 = new AccountImpl("SVE02", CHECKING_ACCOUNT,0);
        Account newAcc3 = new AccountImpl("SVE03", SAVING_ACCOUNT,0);

        client1.addAccount(newAcc1);
        client1.addAccount(newAcc2);
        client2.addAccount(newAcc3);

        Client.addClient(client1);
        Client.addClient(client2);

        System.out.println(client1.showTotalBalance());


        client1.removeAccount("SVE01");
        client1.showClientAccounts();
        client2.showClientAccounts();

    }
}
