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

        calendar(askMonth);

    }

    static boolean sunday(int userDay, int... days) {

        ArrayList<Integer> sunday = new ArrayList<Integer>();
        for (int day : days) {

            sunday.add(day);

        }

        return sunday.contains(userDay);

    }

    static boolean monday(int userDay, int... days) {

        ArrayList<Integer> monday = new ArrayList<Integer>();
        for (int day : days) {

            monday.add(day);

        }

        return monday.contains(userDay);

    }

    static boolean tuesday(int userDay, int... days) {

        ArrayList<Integer> tuesday = new ArrayList<Integer>();
        for (int day : days) {

            tuesday.add(day);

        }

        return tuesday.contains(userDay);

    }

    static boolean wednesday(int userDay, int... days) {

        ArrayList<Integer> wednesday = new ArrayList<Integer>();
        for (int day : days) {

            wednesday.add(day);

        }

        return wednesday.contains(userDay);

    }

    static boolean thursday(int userDay, int... days) {

        ArrayList<Integer> thursday = new ArrayList<Integer>();
        for (int day : days) {

            thursday.add(day);

        }

        return thursday.contains(userDay);

    }

    static boolean friday(int userDay, int... days) {

        ArrayList<Integer> friday = new ArrayList<Integer>();
        for (int day : days) {

            friday.add(day);

        }

        return friday.contains(userDay);

    }

    static boolean saturday(int userDay, int... days) {

        ArrayList<Integer> saturday = new ArrayList<Integer>();
        for (int day : days) {

            saturday.add(day);

        }

        return saturday.contains(userDay);

    }

    static void askDay(int[] sundayLists, int[] mondayLists, int[] tuesdayLists, int[] wednesdayLists, int[] thursdayLists, int[] fridayLists, int[] saturdayLists){

        Scanner askUser = new Scanner(System.in);
        System.out.print("\t\t\t\t\tSelect the Day you want to execute: ");

        int askDay = askUser.nextInt();

        if (sunday(askDay,sundayLists)) {
            System.out.println("sunday");
        } else if (monday(askDay, mondayLists)) {
            System.out.println("monday");
        } else if (tuesday(askDay,tuesdayLists)) {
            System.out.println("tuesday");
        } else if (wednesday(askDay, wednesdayLists)) {
            System.out.println("wednesday");
        } else if (thursday(askDay, thursdayLists)) {
            System.out.println("thursday");
        } else if (friday(askDay,fridayLists)) {
            System.out.println("friday");
        } else if (saturday(askDay,saturdayLists)) {
            System.out.println("saturday");
        }

    }

    static void calendar(String month) {

        switch (month) {

            case "January":

                System.out.println("\n\t\t\t\t\t==================================================\n");
                System.out.println("\t\t\t\t\t=> " + month + "\n");
                System.out.println("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
                System.out.println("\t\t\t\t\t      \t      \t      \t  1   \t  2   \t  3   \t  4   \n");
                System.out.println("\t\t\t\t\t  5   \t  6   \t  7   \t  8   \t  9   \t  10   \t  11   \n");
                System.out.println("\t\t\t\t\t  12   \t  13   \t  14   \t  15   \t  16   \t  17   \t  18   \n");
                System.out.println("\t\t\t\t\t  19   \t  20   \t  21   \t  22   \t  23   \t  24   \t  25   \n");
                System.out.println("\t\t\t\t\t  26   \t  27   \t  28   \t  29   \t  30   \t  31   \t       \n");

                int[] sundayListsJ = {5, 12, 19, 26};
                int[] mondayListsJ = {6, 13, 20, 27};
                int[] tuesdayListsJ = {7, 14, 21, 28};
                int[] wednesdayListsJ = {1, 8, 15, 22, 29};
                int[] thursdayListsJ = {2, 9, 16, 23, 30};
                int[] fridayListsJ = {3, 10, 17, 24, 31};
                int[] saturdayListsJ = {4, 11, 18, 25};

                askDay(sundayListsJ, mondayListsJ, tuesdayListsJ, wednesdayListsJ, thursdayListsJ, fridayListsJ, saturdayListsJ);

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

                int[] sundayListsF = {2, 9, 16, 23};
                int[] mondayListsF = {3, 10, 17, 24};
                int[] tuesdayListsF = {4, 11, 18, 25};
                int[] wednesdayListsF = {5, 12, 19, 26};
                int[] thursdayListsF = {6, 13, 20, 27};
                int[] fridayListsF = {7, 14, 21, 28};
                int[] saturdayListsF = {1, 8, 15, 22};

                askDay(sundayListsF, mondayListsF, tuesdayListsF, wednesdayListsF, thursdayListsF, fridayListsF, saturdayListsF);

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

                int[] sundayListsM = {2, 9, 16, 23, 30};
                int[] mondayListsM = {3, 10, 17, 24, 31};
                int[] tuesdayListsM = {4, 11, 18, 25};
                int[] wednesdayListsM = {5, 12, 19, 26};
                int[] thursdayListsM = {6, 13, 20, 27};
                int[] fridayListsM = {7, 14, 21, 28};
                int[] saturdayListsM = {1, 8, 15, 22, 29};

                askDay(sundayListsM, mondayListsM, tuesdayListsM, wednesdayListsM, thursdayListsM, fridayListsM, saturdayListsM);

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

                int[] sundayListsA = {6, 13, 20, 27};
                int[] mondayListsA = {7, 14, 21, 28};
                int[] tuesdayListsA = {1, 8, 15, 22, 29};
                int[] wednesdayListsA = {2, 9, 16, 23, 30};
                int[] thursdayListsA = {3, 10, 17, 24};
                int[] fridayListsA = {4, 11, 18, 25};
                int[] saturdayListsA = {5, 12, 19, 26};

                askDay(sundayListsA, mondayListsA, tuesdayListsA, wednesdayListsA, thursdayListsA, fridayListsA, saturdayListsA);

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

                int[] sundayListsMy = {4, 11, 18, 25};
                int[] mondayListsMy = {5, 12, 19, 26};
                int[] tuesdayListsMy = {6, 13, 20, 27};
                int[] wednesdayListsMy = {7, 14, 21, 28};
                int[] thursdayListsMy = {1, 8, 15, 22, 29};
                int[] fridayListsMy = {2, 9, 16, 23, 30};
                int[] saturdayListsMy = {3, 10, 17, 24, 31};

                askDay(sundayListsMy, mondayListsMy, tuesdayListsMy, wednesdayListsMy, thursdayListsMy, fridayListsMy, saturdayListsMy);

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

                int[] sundayListsJu = {1, 8, 15, 22, 29};
                int[] mondayListsJu = {2, 9, 16, 23, 30};
                int[] tuesdayListsJu = {3, 10, 17, 24};
                int[] wednesdayListsJu = {4, 11, 18, 25};
                int[] thursdayListsJu = {5, 12, 19, 26};
                int[] fridayListsJu = {6, 13, 20, 27};
                int[] saturdayListsJu = {7, 14, 21, 28};

                askDay(sundayListsJu, mondayListsJu, tuesdayListsJu, wednesdayListsJu, thursdayListsJu, fridayListsJu, saturdayListsJu);

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

                int[] sundayListsJy = {6, 13, 20, 27};
                int[] mondayListsJy = {7, 14, 21, 28};
                int[] tuesdayListsJy = {1, 8, 15, 22, 29};
                int[] wednesdayListsJy = {2, 9, 16, 23, 30};
                int[] thursdayListsJy = {3, 10, 17, 24, 31};
                int[] fridayListsJy = {4, 11, 18, 25};
                int[] saturdayListsJy = {5, 12, 19, 26};

                askDay(sundayListsJy, mondayListsJy, tuesdayListsJy, wednesdayListsJy, thursdayListsJy, fridayListsJy, saturdayListsJy);

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

                int[] sundayListsAug = {3, 10, 17, 24, 31};
                int[] mondayListsAug = {4, 11, 18, 25};
                int[] tuesdayListsAug = {5, 12, 19, 26};
                int[] wednesdayListsAug = {6, 13, 20, 27};
                int[] thursdayListsAug = {7, 14, 21, 28};
                int[] fridayListsAug = {1, 8, 15, 22, 29};
                int[] saturdayListsAug = {2, 9, 16, 23, 30};

                askDay(sundayListsAug, mondayListsAug, tuesdayListsAug, wednesdayListsAug, thursdayListsAug, fridayListsAug, saturdayListsAug);

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

                int[] sundayListsSep = {7, 14, 21, 28};
                int[] mondayListsSep = {1, 8, 15, 22, 29};
                int[] tuesdayListsSep = {2, 9, 16, 23, 30};
                int[] wednesdayListsSep = {3, 10, 17, 24};
                int[] thursdayListsSep = {4, 11, 18, 25};
                int[] fridayListsSep = {5, 12, 19, 26};
                int[] saturdayListsSep = {6, 13, 20, 27};

                askDay(sundayListsSep, mondayListsSep, tuesdayListsSep, wednesdayListsSep, thursdayListsSep, fridayListsSep, saturdayListsSep);

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

                int[] sundayListsOc = {5, 12, 19, 26};
                int[] mondayListsOc = {6, 13, 20, 27};
                int[] tuesdayListsOc = {7, 14, 21, 28};
                int[] wednesdayListsOc = {1, 8, 15, 22, 29};
                int[] thursdayListsOc = {2, 9, 16, 23, 30};
                int[] fridayListsOc = {3, 10, 17, 24, 31};
                int[] saturdayListsOc = {4, 11, 18, 25};

                askDay(sundayListsOc, mondayListsOc, tuesdayListsOc, wednesdayListsOc, thursdayListsOc, fridayListsOc, saturdayListsOc);

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

                int[] sundayListsNov = {2, 9, 16, 23, 30};
                int[] mondayListsNov = {3, 10, 17, 24};
                int[] tuesdayListsNov = {4, 11, 18, 25};
                int[] wednesdayListsNov = {5, 12, 19, 26};
                int[] thursdayListsNov = {6, 13, 20, 27};
                int[] fridayListsNov = {7, 14, 21, 28};
                int[] saturdayListsNov = {1, 8, 15, 22, 29};

                askDay(sundayListsNov, mondayListsNov, tuesdayListsNov, wednesdayListsNov, thursdayListsNov, fridayListsNov, saturdayListsNov);

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