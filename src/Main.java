import java.util.HashMap;
import java.util.Scanner;

public class Main {

    static void userHome(HashMap<String, Integer> userAccounts){

        System.out.println("\n\t\t\t\t\t==================================================");
        System.out.println("\t\t\t\t\tWelcome to Day Executioner\t\t\t\t\t");
        System.out.println("\t\t\t\t\t==================================================\n");

        System.out.println("\t\t\t\t\tInstructions:");
        System.out.println("\t\t\t\t\t#1. Select your year");
        System.out.println("\t\t\t\t\t#2. Select your month");
        System.out.println("\t\t\t\t\t#3. Select your week");
        System.out.println("\t\t\t\t\t#4. Select your day");
        System.out.println("\t\t\t\t\tStart Executing Your Daily Actions!");

        userYear();

    }

    static void userYear(){

        System.out.println("year");

    }

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
            if (userAccounts.containsValue(userPassword)) {
                System.out.println("Logging in...");
            } else {
                System.out.println("Incorrect Password ");
            }
        } else {
            System.out.println("no account was found");
        }
    }

    public static void main(String[] args) {

        HashMap<String, Integer> userAccounts = new HashMap<String, Integer>();

//        System.out.println("hello world");
        userAccounts(userAccounts);
//        loginUser(userAccounts);
        userHome(userAccounts);

    }
}