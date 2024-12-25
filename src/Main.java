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

        Scanner askUser = new Scanner(System.in);

        System.out.println("\n\t\t\t\t\t==================================================\n");
        System.out.println("\t\t\t\t\t2001\t2002\t2003\t2004\t2005\t2006\t2007\n");
        System.out.println("\t\t\t\t\t2008\t2009\t2010\t2011\t2012\t2013\t2014\n");
        System.out.println("\t\t\t\t\t2015\t2016\t2017\t2018\t2019\t2020\t2021\n");
        System.out.println("\t\t\t\t\t2022\t2023\t2024\t2025\t2026\t2027\t2028\n");
        System.out.println("\t\t\t\t\t2029\t2030\t2031\t2032\t2033\t2034\t2035\n");

        System.out.print("\t\t\t\t\tSelect the Year you want to execute: ");
        int askYear = askUser.nextInt();

        userMonth(askYear);

    }

    static void userMonth(int year) {

        Scanner askUser = new Scanner(System.in);

        System.out.println("\n\t\t\t\t\t==================================================\n");
        System.out.println("\t\t\t\t\t=> " + String.valueOf(year));
        System.out.println("\n\t\t\t\t\tJanuary           February           March           April\n");
        System.out.println("\t\t\t\t\tMay               June               July            August\n");
        System.out.println("\t\t\t\t\tSeptember         October            November        December\n");


        System.out.print("\t\t\t\t\tSelect the Month you want to execute: ");
        String askMonth = askUser.nextLine();

        askDay(askMonth);

    }

    static void askDay(String month) {

        switch (month) {



        }

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