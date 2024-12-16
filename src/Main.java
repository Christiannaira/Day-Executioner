import java.util.HashMap;

public class Main {

    static void userAccounts() {

        HashMap<String, Integer> userAccounts = new HashMap<String, Integer>();

        userAccounts.put("Christian", 1234);

        System.out.println(userAccounts);

    }

    public static void main(String[] args) {

        System.out.println("hello world");

        userAccounts();

    }
}