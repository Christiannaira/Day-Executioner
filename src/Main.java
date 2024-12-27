import java.util.ArrayList;
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

        switch (askYear) {

            case 2025:
                userMonth(askYear);
                break;
            default:
                System.out.println("not available");

        }

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

            case "January":


                ArrayList<Integer> sunday = new ArrayList<Integer>();
                sunday.add(5);
                sunday.add(12);
                sunday.add(19);
                sunday.add(26);

                ArrayList<Integer> monday = new ArrayList<Integer>();
                sunday.add(6);
                sunday.add(13);
                sunday.add(20);
                sunday.add(27);



                System.out.println("\n\t\t\t\t\t==================================================\n");
                System.out.println("\t\t\t\t\t=> " + month + "\n");
                System.out.println("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
                System.out.println("\t\t\t\t\t      \t      \t      \t  1   \t  2   \t  3   \t  4   \n");
                System.out.println("\t\t\t\t\t  5   \t  6   \t  7   \t  8   \t  9   \t  10   \t  11   \n");
                System.out.println("\t\t\t\t\t  12   \t  13   \t  14   \t  15   \t  16   \t  17   \t  18   \n");
                System.out.println("\t\t\t\t\t  19   \t  20   \t  21   \t  22   \t  23   \t  24   \t  25   \n");
                System.out.println("\t\t\t\t\t  26   \t  27   \t  28   \t  29   \t  30   \t  31   \t       \n");

                Scanner askUser = new Scanner(System.in);
                System.out.print("\t\t\t\t\tSelect the Day you want to execute: ");

                int askDay = askUser.nextInt();

                if (sunday.contains(askDay)) {
                    System.out.println(askDay);
                } else {
                    System.out.println("not");
                }

                break;
            case "February":

                System.out.println("\n\t\t\t\t\t==================================================\n");
                System.out.println("\t\t\t\t\t=> " + month + "\n");
                System.out.println("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
                System.out.println("\t\t\t\t\t      \t      \t      \t      \t      \t      \t  1   \n");
                System.out.println("\t\t\t\t\t  2   \t  3   \t  4   \t  5   \t  6   \t  7   \t  8   \n");
                System.out.println("\t\t\t\t\t  9   \t  10   \t  11   \t  12   \t  13   \t  14   \t  15   \n");
                System.out.println("\t\t\t\t\t  16   \t  17   \t  18   \t  19   \t  20   \t  21   \t  22   \n");
                System.out.println("\t\t\t\t\t  23   \t  24   \t  25   \t  26   \t  27   \t  28   \t       \n");
                break;

            case "March":

                System.out.println("\n\t\t\t\t\t==================================================\n");
                System.out.println("\t\t\t\t\t=> " + month + "\n");
                System.out.println("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
                System.out.println("\t\t\t\t\t      \t      \t      \t      \t      \t      \t  1   \n");
                System.out.println("\t\t\t\t\t  2   \t  3   \t  4   \t  5   \t  6   \t  7   \t  8   \n");
                System.out.println("\t\t\t\t\t  9   \t  10   \t  11   \t  12   \t  13   \t  14   \t  15   \n");
                System.out.println("\t\t\t\t\t  16   \t  17   \t  18   \t  19   \t  20   \t  21   \t  22   \n");
                System.out.println("\t\t\t\t\t  23   \t  24   \t  25   \t  26   \t  27   \t  28   \t  29   \n");
                System.out.println("\t\t\t\t\t  30   \t  31   \t       \t       \t       \t       \t       \n");
                break;

            case "April":

                System.out.println("\n\t\t\t\t\t==================================================\n");
                System.out.println("\t\t\t\t\t=> " + month + "\n");
                System.out.println("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
                System.out.println("\t\t\t\t\t      \t      \t  1   \t  2   \t  3   \t  4   \t  5   \n");
                System.out.println("\t\t\t\t\t  6   \t  7   \t  8   \t  9   \t  10   \t  11   \t  12   \n");
                System.out.println("\t\t\t\t\t  13   \t  14   \t  15   \t  16   \t  17   \t  18   \t  19   \n");
                System.out.println("\t\t\t\t\t  20   \t  21   \t  22   \t  23   \t  24   \t  25   \t  26   \n");
                System.out.println("\t\t\t\t\t  27   \t  28   \t  29   \t  30   \t       \t       \t       \n");
                System.out.println("\t\t\t\t\t       \t       \t       \t       \t       \t       \t       \n");
                break;

            case "May":

                System.out.println("\n\t\t\t\t\t==================================================\n");
                System.out.println("\t\t\t\t\t=> " + month + "\n");
                System.out.println("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
                System.out.println("\t\t\t\t\t      \t      \t      \t      \t  1   \t  2   \t  3   \n");
                System.out.println("\t\t\t\t\t  4   \t  5   \t  6   \t  7   \t  8   \t  9   \t  10   \n");
                System.out.println("\t\t\t\t\t  11   \t  12   \t  13   \t  14   \t  15   \t  16   \t  17   \n");
                System.out.println("\t\t\t\t\t  18   \t  19   \t  20   \t  21   \t  22   \t  23   \t  24   \n");
                System.out.println("\t\t\t\t\t  25   \t  26   \t  27   \t  28   \t  29   \t  30   \t  31   \n");
                System.out.println("\t\t\t\t\t       \t       \t       \t       \t       \t       \t       \n");
                break;

            case "June":

                System.out.println("\n\t\t\t\t\t==================================================\n");
                System.out.println("\t\t\t\t\t=> " + month + "\n");
                System.out.println("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
                System.out.println("\t\t\t\t\t  1   \t  2   \t  3   \t  4   \t  5   \t  6   \t  7   \n");
                System.out.println("\t\t\t\t\t  8   \t  9   \t  10   \t  11   \t  12   \t  13   \t  14   \n");
                System.out.println("\t\t\t\t\t  15   \t  16   \t  17   \t  18   \t  19   \t  20   \t  21   \n");
                System.out.println("\t\t\t\t\t  22   \t  23   \t  24   \t  25   \t  26   \t  27   \t  28   \n");
                System.out.println("\t\t\t\t\t  29   \t  30   \t       \t       \t       \t       \t       \n");
                System.out.println("\t\t\t\t\t       \t       \t       \t       \t       \t       \t       \n");
                break;

            case "July":

                System.out.println("\n\t\t\t\t\t==================================================\n");
                System.out.println("\t\t\t\t\t=> " + month + "\n");
                System.out.println("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
                System.out.println("\t\t\t\t\t      \t      \t  1   \t  2   \t  3   \t  4   \t  5   \n");
                System.out.println("\t\t\t\t\t  6   \t  7   \t  8   \t  9   \t  10   \t  11   \t  12   \n");
                System.out.println("\t\t\t\t\t  13   \t  14   \t  15   \t  16   \t  17   \t  18   \t  19   \n");
                System.out.println("\t\t\t\t\t  20   \t  21   \t  22   \t  23   \t  24   \t  25   \t  26   \n");
                System.out.println("\t\t\t\t\t  27   \t  28   \t  29   \t  30   \t  31   \t       \t       \n");
                System.out.println("\t\t\t\t\t       \t       \t       \t       \t       \t       \t       \n");
                break;

            case "August":

                System.out.println("\n\t\t\t\t\t==================================================\n");
                System.out.println("\t\t\t\t\t=> " + month + "\n");
                System.out.println("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
                System.out.println("\t\t\t\t\t      \t      \t      \t      \t      \t  1   \t  2   \n");
                System.out.println("\t\t\t\t\t  3   \t  4   \t  5   \t  6   \t  7   \t  8   \t  9   \n");
                System.out.println("\t\t\t\t\t  10   \t  11   \t  12   \t  13   \t  14   \t  15   \t  16   \n");
                System.out.println("\t\t\t\t\t  17   \t  18   \t  19   \t  20   \t  21   \t  22   \t  23   \n");
                System.out.println("\t\t\t\t\t  24   \t  25   \t  26   \t  27   \t  28   \t  29   \t  30   \n");
                System.out.println("\t\t\t\t\t  31   \t       \t       \t       \t       \t       \t       \n");
                break;

            case "September":

                System.out.println("\n\t\t\t\t\t==================================================\n");
                System.out.println("\t\t\t\t\t=> " + month + "\n");
                System.out.println("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
                System.out.println("\t\t\t\t\t      \t  1   \t  2   \t  3   \t  4   \t  5   \t  6   \n");
                System.out.println("\t\t\t\t\t  7   \t  8   \t  9   \t  10   \t  11   \t  12   \t  13   \n");
                System.out.println("\t\t\t\t\t  14   \t  15   \t  16   \t  17   \t  18   \t  19   \t  20   \n");
                System.out.println("\t\t\t\t\t  21   \t  22   \t  23   \t  24   \t  25   \t  26   \t  27   \n");
                System.out.println("\t\t\t\t\t  28   \t  29   \t  30   \t       \t       \t       \t       \n");
                System.out.println("\t\t\t\t\t       \t       \t       \t       \t       \t       \t       \n");
                break;

            case "October":

                System.out.println("\n\t\t\t\t\t==================================================\n");
                System.out.println("\t\t\t\t\t=> " + month + "\n");
                System.out.println("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
                System.out.println("\t\t\t\t\t      \t      \t      \t  1   \t  2   \t  3   \t  4   \n");
                System.out.println("\t\t\t\t\t  5   \t  6   \t  7   \t  8   \t  9   \t  10   \t  11   \n");
                System.out.println("\t\t\t\t\t  12   \t  13   \t  14   \t  15   \t  16   \t  17   \t  18   \n");
                System.out.println("\t\t\t\t\t  19   \t  20   \t  21   \t  22   \t  23   \t  24   \t  25   \n");
                System.out.println("\t\t\t\t\t  26   \t  27   \t  28   \t  29   \t  30   \t  31   \t       \n");
                System.out.println("\t\t\t\t\t       \t       \t       \t       \t       \t       \t       \n");
                break;

            case "November":

                System.out.println("\n\t\t\t\t\t==================================================\n");
                System.out.println("\t\t\t\t\t=> " + month + "\n");
                System.out.println("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
                System.out.println("\t\t\t\t\t      \t      \t      \t      \t      \t      \t  1   \n");
                System.out.println("\t\t\t\t\t  2   \t  3   \t  4   \t  5   \t  6   \t  7   \t  8   \n");
                System.out.println("\t\t\t\t\t  9   \t  10   \t  11   \t  12   \t  13   \t  14   \t  15   \n");
                System.out.println("\t\t\t\t\t  16   \t  17   \t  18   \t  19   \t  20   \t  21   \t  22   \n");
                System.out.println("\t\t\t\t\t  23   \t  24   \t  25   \t  26   \t  27   \t  28   \t  29   \n");
                System.out.println("\t\t\t\t\t  30   \t       \t       \t       \t       \t       \t       \n");
                break;

            case "December":

                System.out.println("\n\t\t\t\t\t==================================================\n");
                System.out.println("\t\t\t\t\t=> " + month + "\n");
                System.out.println("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
                System.out.println("\t\t\t\t\t      \t  1   \t  2   \t  3   \t  4   \t  5   \t  6   \n");
                System.out.println("\t\t\t\t\t  7   \t  8   \t  9   \t  10   \t  11   \t  12   \t  13   \n");
                System.out.println("\t\t\t\t\t  14   \t  15   \t  16   \t  17   \t  18   \t  19   \t  20   \n");
                System.out.println("\t\t\t\t\t  21   \t  22   \t  23   \t  24   \t  25   \t  26   \t  27   \n");
                System.out.println("\t\t\t\t\t  28   \t  29   \t  30   \t  31   \t       \t       \t       \n");
                System.out.println("\t\t\t\t\t       \t       \t       \t       \t       \t       \t       \n");
                break;

        }

//        Scanner askUser = new Scanner(System.in);
//        System.out.print("\t\t\t\t\tSelect the Day you want to execute: ");
//        int askDay = askUser.nextInt();
//
//        System.out.println(askDay);



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