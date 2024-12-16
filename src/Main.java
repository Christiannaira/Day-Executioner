import java.util.HashMap;

public class Main {

    static void userAccounts() {

        HashMap<String, Integer> userAccounts = new HashMap<String, Integer>();

        userAccounts.put("Christian", 1234);
        userAccounts.put("Vincent", 1234);

        for (String userAccount : userAccounts.keySet()) {

            System.out.print(userAccount);
            System.out.print(" ");
            System.out.println(userAccounts.get(userAccount));

        }


    }

    static void checkUserAccount() {



    }

    public static void main(String[] args) {

        System.out.println("hello world");

        userAccounts();

    }
}