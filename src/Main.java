import java.util.HashMap;
import java.util.Scanner;

public class Main {

    static void loginUser(HashMap<String, Integer> userAccounts) {

        Scanner askUser = new Scanner(System.in);

        int i = 0;
        while (i < 5) {

            System.out.println("Enter your username: ");
            String userName = askUser.nextLine();

            if (!userName.isEmpty()) {

                checkUserAccount(userAccounts, userName);

            } else {

                System.out.println("Try again.");

            }

            i++;

        }

    }

    static void userAccounts(HashMap<String, Integer> userAccounts) {

        userAccounts.put("Christian", 1234);
        userAccounts.put("Vincent", 1234);

    }

    static void checkUserAccount(HashMap<String, Integer> userAccounts, String userName) {

        System.out.println("checking");

        Scanner askUserPassword = new Scanner(System.in);

        if (userAccounts.get(userName) != null) {

            System.out.println("Enter your password: ");
            int userPassword = askUserPassword.nextInt();

        } else {

            System.out.println("no account was found");

        }



    }

    public static void main(String[] args) {

        HashMap<String, Integer> userAccounts = new HashMap<String, Integer>();

        System.out.println("hello world");
        userAccounts(userAccounts);
        loginUser(userAccounts);

    }
}