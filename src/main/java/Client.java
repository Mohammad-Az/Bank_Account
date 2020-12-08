import java.util.HashMap;
import java.util.Map;

public class Client {

    private String Id;
    private String firstName;
    private String lastName;
    private long phone;
    private int age;
    private String address;


    private Map<String, Account> accounts = new HashMap<String, Account>();
    private static Map<String, Client> clients = new HashMap<String, Client>();

    public Client(String id, String firstName, String lastName, long phone, int age, String address) {
        Id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.age=age;
        this.address= address;
    }

    public String getId() {
        return Id;
    }

    public Map<String, Account> getAccounts() {
        return accounts;
    }

    public void addAccount(Account account) {
        this.accounts.put(account.getAccountId(), account);
    }

    public void removeAccount(String accountId) {
        if (this.getAccounts().containsKey(accountId)) {
            this.getAccounts().remove(accountId);
        }
    }

    public void removeClient(String clientId) {
        if (this.getClients().containsKey(clientId)) {
            this.getClients().remove(clientId);
        }
    }

    public Map<String, Client> getClients() {
        return clients;
    }

    public static void addClient(Client client) {
        clients.put(client.getId(), client);
    }

    public void showClientAccounts() {
        Map<String, Account> accounts = this.getAccounts();
        System.out.println(this);
        accounts.forEach((key,account)-> {
            System.out.println(account);
        });
    }

    public static int getNumberOfClients(){
        return Client.clients.size();
    }

    public double showTotalBalance() {
        double total = 0;
        for (Account account : accounts.values()) {
            total = total + account.getBalance();
        }
        return total;
    }

    public static void showClients() {
        clients.forEach((key, client)-> {
            System.out.println(client);
        });
    }

    @Override
    public String toString() {
        return "Client{" +
                "Id='" + Id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone=" + phone +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }


}
