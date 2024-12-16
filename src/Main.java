import java.util.HashMap;
import java.util.Scanner;

public class Main {

    static void loginUser() {

        Scanner askUser = new Scanner(System.in);

        int i = 0;
        while (i < 5) {

            System.out.println("Enter your username: ");
            String userName = askUser.nextLine();

            if (!userName.isEmpty()) {

                checkUserAccount();

            } else {

                System.out.println("Try again.");

            }

            i++;

        }

    }

    static void userAccounts() {

        HashMap<String, Integer> userAccounts = new HashMap<String, Integer>();

        userAccounts.put("Christian", 1234);
        userAccounts.put("Vincent", 1234);

//        for (String userAccount : userAccounts.keySet()) {
//
//            System.out.print(userAccount);
//            System.out.print(" ");
//            System.out.println(userAccounts.get(userAccount));
//
//        }

    }

    static void checkUserAccount() {

        System.out.println("checking");

    }

    public static void main(String[] args) {

        System.out.println("hello world");

        userAccounts();
        loginUser();

    }
}